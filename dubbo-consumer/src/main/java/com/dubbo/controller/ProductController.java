package com.dubbo.controller;

import com.api.model.Product;
import com.api.service.dubbo.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yhl
 * @DateTime: 2020/6/18 10:30
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Reference()
    private IProductService productService;

    @GetMapping("/getProductById")
    public Product getProductById(Long id){
        log.info("----------------getProductById请求参数：[{}]", id);
        return productService.getProductById(1L);
    }
}
