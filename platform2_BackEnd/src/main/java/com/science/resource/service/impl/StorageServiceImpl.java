package com.science.resource.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.science.resource.VO.ListQuery;
import com.science.resource.entity.Storage;
import com.science.resource.mapper.StorageMapper;
import com.science.resource.service.StorageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 文件存储表 服务实现类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-04-08
 */
@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {
    @Resource
    private StorageMapper storageMapper;

    public void deleteByKey(String key) {
        Map example = new HashMap();
        example.put("key_word",key);
        storageMapper.deleteByMap(example);
    }

    public void add(Storage storageInfo) {
        storageInfo.setIsDeleted(false);
        storageInfo.setAddTime(new Date(System.currentTimeMillis()));
        storageInfo.setUpdateTime(new Date(System.currentTimeMillis()));
        storageMapper.insert(storageInfo);
    }

    public List<Storage> getAll(){
        List<Storage> storages = storageMapper.selectList(null);
        return storages;
    }

    public List<Storage> getAll(ListQuery listQuery){
        Page page = new Page(listQuery.getPageNum(),listQuery.getPageSize());
        Page storages = storageMapper.selectPage(page,null);
        return storages.getRecords();
    }

    public int update(Storage storageInfo) {
        storageInfo.setUpdateTime(new Date(System.currentTimeMillis()));
        return storageMapper.updateById(storageInfo);
    }

    public Storage findById(Integer id) {
        return storageMapper.selectById(id);
    }

    public List<Storage> querySelective(String key, String name, Integer page, Integer limit, String sort, String order) {
        QueryWrapper wrapper = new QueryWrapper();

        //        StorageExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(key)) {
            wrapper.eq("key_word",key);
        }
        if (!StringUtils.isEmpty(name)) {
            wrapper.in("name",name);

        }
        wrapper.eq("isDeleted",false);



        return storageMapper.selectList(wrapper);
    }

    public Storage findByFilename(String fileName) {
        QueryWrapper example = new QueryWrapper();
        example.eq("file_name",fileName);
//        example.createCriteria().andNameEqualTo(fileName);
        List<Storage> storageList = storageMapper.selectList(example);
        if (storageList.size() == 1){
            return storageList.get(0);
        }
        return null;
    }
    public List<Storage> findByRolling(ListQuery listQuery, String fileName) {
        Page page = new Page(listQuery.getPageNum(),listQuery.getPageSize());
        QueryWrapper example = new QueryWrapper();
        example.orderByDesc("add_time");

        example.like("file_name",fileName);
        return storageMapper.selectPage(page,example).getRecords();
    }
    public Storage findByKey(String key) {
        QueryWrapper example = new QueryWrapper();
        example.eq("key_word",key);
        List<Storage> storages = storageMapper.selectList(example);
        if (storages.size() == 1){
            return storages.get(0);
        }
        return null;
    }
    public String deleteByUrl(String avatar) {
        QueryWrapper example = new QueryWrapper();

        example.eq("url",avatar);
        Storage storage = storageMapper.selectOne(example);
        storageMapper.delete(example);
        if (storage == null){
            return null;
        }
        return storage.getKeyWord();
    }

    public void deleteByKeyList(List<String> removeIds) {
        QueryWrapper example = new QueryWrapper();
        example.in("key_word",removeIds);
        storageMapper.delete(example);
    }

    public List<Storage> findByKeys(List<String> imgIds) {
        QueryWrapper example = new QueryWrapper();
        example.in("key_word",imgIds);
        return storageMapper.selectList(example);
    }

    public List<Storage> getFileInfo(List urllist){
        QueryWrapper example = new QueryWrapper();
        example.in("url",urllist);
        return storageMapper.selectList(example);
    }
}
