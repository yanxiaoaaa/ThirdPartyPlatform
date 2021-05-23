package com.science.resource.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.science.resource.VO.ListQuery;
import com.science.resource.entity.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 文件存储表 服务类
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-04-08
 */
public interface StorageService extends IService<Storage> {
    public void deleteByKey(String key);
    public void add(Storage storageInfo);
    public List<Storage> getAll();
    public Storage findByFilename(String fileName);
    List<Storage> findByRolling(ListQuery listQuery, String fileName);
    public List<Storage> getAll(ListQuery listQuery);
    public Storage findByKey(String key);
    public void deleteByKeyList(List<String> removeIds);
    public List<Storage> findByKeys(List<String> imgIds);
    public String deleteByUrl(String avatar);
    public Storage findById(Integer id);
    public List<Storage> getFileInfo(List urllist);
}
