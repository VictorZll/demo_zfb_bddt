package com.example.demo.service;

import com.example.demo.entity.PayDto;

public interface aliPayService {
    /**
     * 支付宝下单
     * @param payDto payDto
     * @return String
     */
    String order(PayDto payDto);
}
