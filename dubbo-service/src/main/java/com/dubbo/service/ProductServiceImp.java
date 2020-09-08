package com.dubbo.service;

import com.alibaba.fastjson.JSON;
import com.api.model.Product;
import com.api.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: yhl
 * @DateTime: 2020/6/18 10:18
 * @Description:
 */
@Slf4j
@Service
public class ProductServiceImp implements IProductService {

    @Override
    public Product getProductById(Long id) {
        final Product product = new Product(1L, "apple", 5);
        log.info("---------------getProductById返回结果:[{}]", product);
        return product;
    }

    @Override
    public Boolean addProduct(Product product) {
        log.info("addProduct:[{}]", JSON.toJSONString(product));
        return true;
    }
}
