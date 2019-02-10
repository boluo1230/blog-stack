package com.mini.blogstack.controller;

import com.mini.blogstack.base.bean.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bolun Liu
 * Date:2019/2/10
 **/
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/test")
    public Result test() {
        return Result.success();
    }

}
