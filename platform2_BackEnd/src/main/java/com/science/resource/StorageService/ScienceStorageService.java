package com.science.resource.StorageService;

import com.science.resource.VO.ListQuery;
import com.science.resource.entity.Storage;
import com.science.resource.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * 提供存储服务类，所有存储服务均由该类对外提供
 */
@Slf4j
@Service
public class ScienceStorageService {

    private String active;  //判断使用哪种存储方式

    @Autowired
    private IStorage storage;


    @Autowired
    private StorageService storageService;

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public IStorage getStorage() {
        return storage;
    }

    public void IStorage(IStorage storage) {
        this.storage = storage;
    }
    /**
     * 存储一个文件对象
     *
     * @param inputStream   文件输入流
     * @param contentLength 文件长度
     * @param contentType   文件类型
     * @param fileName      文件索引名
     */
    public Storage store(InputStream inputStream, long contentLength, String contentType, String fileName) {
        String key = generateKey(fileName);
        storage.store(inputStream, contentLength, contentType, key);

        String url = generateUrl(key);
        Storage storageInfo = new Storage();
        storageInfo.setName(fileName);
        storageInfo.setSize((int) contentLength);
        storageInfo.setType(contentType);
        storageInfo.setKeyWord(key);
        storageInfo.setUrl(url);
        storageService.add(storageInfo);

        return storageInfo;
    }

    private String generateKey(String originalFilename) {
       return storage.generateKey(originalFilename);
    }

    public Stream<Path> loadAll() {
        return storage.loadAll();
    }

    public Path load(String keyName) {
        return storage.load(keyName);
    }

    public Resource loadAsResource(String keyName) {
        return storage.loadAsResource(keyName);
    }

    public void delete(String keyName) {
        storageService.deleteByKey(keyName);
        storage.delete(keyName);
    }

    private String generateUrl(String keyName) {
        return storage.generateUrl(keyName);
    }

    public String getUrl(String fileName) {
       Storage storage =  storageService.findByFilename(fileName);
       if (storage !=null){
           return storage.getUrl();
       }
       return null;
    }


    public Storage findByKey(String key) {
        return storageService.findByKey(key);
    }

    public List<Storage> getStorageList(ListQuery listQuery) {
        return storageService.getAll(listQuery);
    }

    public Storage getStorageDetail(int id) {
        return storageService.findById(id);
    }

    public void deleteByUrl(String avatar) {
       String keyName =  storageService.deleteByUrl(avatar);
       if (keyName == null){
           return;
       }
       storage.delete(keyName);
//       ossOptionService.deleteFile(keyName);
    }

    public void deleteList(List<String> removeIds) {
        if (removeIds == null || removeIds.size() <=0){
            return;
        }
        storageService.deleteByKeyList(removeIds);
        storage.deleteRemoveList(removeIds);
//        ossOptionService.deleteRemoveList(removeIds);
    }

    public List<Storage> findRolling(ListQuery listQuery, String fileName) {
       return storageService.findByRolling(listQuery,fileName);
    }

    public List<Storage> findByKeys(List<String> imgIds) {
        return storageService.findByKeys(imgIds);
    }
}
