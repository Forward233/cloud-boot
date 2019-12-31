package com.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: yhl
 * DateTime: 2019/12/8 23:13
 * Description: write some description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String url;
    private String service;
    private String consumer;
}
