package com.yaohh.springdemo.controller;

import com.yaohh.springdemo.javabean.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yx on 2017/8/23.
 * hello
 */

@Controller
public class TestController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @ResponseBody
    public Product test(){
        Product product = new Product();
        product.setName("aaaaa");
        return product;
    }
}
