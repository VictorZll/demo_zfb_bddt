package com.example.demo.controller;

import com.example.demo.entity.PayDto;
import com.example.demo.service.aliPayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test1")
    public String test1(){
        return "jsp/index";
    }


    /**
     * 充值
     * @param payDto payDto
     * @return R
     */
    @PostMapping(value = "/charge")
    public R charge(@RequestBody PayDto payDto){
        //payDto就是你前端传过来的值,比如充值金额是多少 用户id是多少..
        //这个实体类根据你们自己的业务需求去写就好
        String orderString = aliPayService.order(payDto);
        return R.ok("orderString",orderString);
    }
}
