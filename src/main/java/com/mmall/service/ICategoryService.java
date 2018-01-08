package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * @Author: Panson
 * @Description:
 * @Date: Created in 20:38 2018/1/8
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

}
