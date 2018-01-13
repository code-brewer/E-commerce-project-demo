package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.pojo.ProductDetailVo;

/**
 * @Author: Panson
 * @Description:
 * @Date: Created in 20:21 2018/1/12
 */
public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);
    ServerResponse<String> setSaleStatus(Integer productId,Integer status);
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
}
