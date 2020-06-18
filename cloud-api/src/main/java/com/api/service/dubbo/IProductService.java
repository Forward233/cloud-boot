package com.api.service.dubbo;

import com.api.model.Product;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: yhl
 * @DateTime: 2020/6/18 10:09
 * @Description:
 */
public interface IProductService {
    Product getProductById(Long id);
    Boolean addProduct(Product product);
}
