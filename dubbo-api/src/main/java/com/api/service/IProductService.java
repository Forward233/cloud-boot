package com.api.service;

import com.api.model.Product;

/**
 * @author: yhl
 * @DateTime: 2020/6/18 10:09
 * @Description:
 */
public interface IProductService {
    Product getProductById(Long id);
    Boolean addProduct(Product product);
}
