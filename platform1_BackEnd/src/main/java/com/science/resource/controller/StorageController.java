package com.science.resource.controller;


import com.alibaba.fastjson.JSON;
import com.science.resource.StorageService.ScienceStorageService;
import com.science.resource.common.CommonResult;
import com.science.resource.entity.Storage;
import com.science.resource.service.ServiceOrderService;
import org.aspectj.apache.bcel.generic.MULTIANEWARRAY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 文件存储表 前端控制器
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-04-08
 */
@RestController
@RequestMapping("/resource/storage")
public class StorageController {
    @Autowired
    private ScienceStorageService storageService;

    @Autowired
    private ServiceOrderService serviceOrderService;

    @PostMapping("/create")
    public Object create(@RequestParam("file") MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        Storage store = storageService.store(file.getInputStream(), file.getSize(), file.getContentType(), originalFilename);
        return CommonResult.success(store);
    }

    @PostMapping("/multi_create")
    public Object multiCreate(@RequestParam("fileList") List<MultipartFile> fileList) throws IOException {
        List<String> pathList = new ArrayList<>();
        for (MultipartFile file : fileList){
           String originalFilename = file.getOriginalFilename();
           Storage store = storageService.store(file.getInputStream(), file.getSize(), file.getContentType(), originalFilename);
           pathList.add(store.getUrl());
       }
        return CommonResult.success(pathList);
    }

    @GetMapping("/science/storage/fetch/{key:.+}")
    public ResponseEntity<Resource> fetch(@PathVariable String key) {
        Storage store = storageService.findByKey(key);
        if (store == null) {
            return ResponseEntity.notFound().build();
        }
        if (key.contains("../")) {
            return ResponseEntity.badRequest().build();
        }
        String type = store.getType();
        MediaType mediaType = MediaType.parseMediaType(type);

        Resource file = storageService.loadAsResource(key);
        if (file == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().contentType(mediaType).body(file);
    }
}

