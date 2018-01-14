package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: Panson
 * @Description:
 * @Date: Created in 11:20 2018/1/14
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
