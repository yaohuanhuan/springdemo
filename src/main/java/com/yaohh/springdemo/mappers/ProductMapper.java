package com.yaohh.springdemo.mappers;

import com.yaohh.springdemo.javabean.Product;

import java.util.List;


/**
 * Created by yx on 2017/8/25.
 * hello
 */
public interface ProductMapper {

    public Product findById(Integer id);

    public Product findAll(Integer id);
}
