package com.example.demo.service.imp;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.example.demo.config.AliDevPayConfig;
import com.example.demo.entity.PayDto;
import com.example.demo.entity.Record;
import com.example.demo.service.aliPayService;
import com.example.demo.util.log;

public class IaliPayService implements aliPayService {
    @Override
    public String order(PayDto payDto) {
        //这里你可以做一些存表操作..具体根据你们自己的业务来操作...
        String orderString = "";//这个字符串是用来返回给前端的
        String orderNo = Record.getOrderId();//这行代码是生成一个商户的订单号..根据你们自己的业务需求去生成就可以了..
        log.info("==================支付宝下单,商户订单号为：" + orderNo);

        try {
            AliDevPayConfig aliDevPayConfig= new  AliDevPayConfig(); //实例化上面的那个配置类..
            //实例化客户端（参数：网关地址、商户appid、商户私钥、格式、编码、支付宝公钥、加密类型），为了取得预付订单信息
            AlipayClient alipayClient = new DefaultAlipayClient(AliDevPayConfig.URL, aliDevPayConfig.getAPPID(),
                    AliDevPayConfig.RSA_PRIVATE_KEY, AliDevPayConfig.FORMAT, AliDevPayConfig.CHARSET,
                    AliDevPayConfig.ALIPAY_PUBLIC_KEY, AliDevPayConfig.SIGNTYPE);
            //实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
            AlipayTradeAppPayRequest ali_request = new AlipayTradeAppPayRequest();
            //SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式
            AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
            //业务参数传入,可以传很多，参考API
            //model.setPassbackParams(URLEncoder.encode(request.getBody().toString())); //公用参数（附加数据）
            //对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
            model.setBody("具体描述信息.例如QQ币充值");
            //商品名称
            model.setSubject("例:QQ币");
            //商户订单号(根据业务需求自己生成)
            model.setOutTradeNo(orderNo);
            //交易超时时间 这里的30m就是30分钟
            model.setTimeoutExpress("30m");
            //支付金额 后面保留2位小数点..不能超过2位
            model.setTotalAmount("10.00");
            //销售产品码（固定值） //这个不做多解释..看文档api接口参数解释
            model.setProductCode("QUICK_MSECURITY_PAY");
            ali_request.setBizModel(model);
            //异步回调地址（后台）//这里我在上面的aliPayConfig有讲..自己去看
            ali_request.setNotifyUrl(AliDevPayConfig.notify_url);
            log.info("====================异步通知的地址为：" + ali_request.getNotifyUrl());
            //同步回调地址（APP）同上
            ali_request.setReturnUrl(AliDevPayConfig.return_url);
            log.info("====================同步通知的地址为：" + ali_request.getReturnUrl());

            // 这里和普通的接口调用不同，使用的是sdkExecute
            //返回支付宝订单信息(预处理)
            AlipayTradeAppPayResponse alipayTradeAppPayResponse = alipayClient.sdkExecute(ali_request);
            //就是orderString 可以直接给APP请求，无需再做处理。
            orderString = alipayTradeAppPayResponse.getBody();
            System.out.println(orderString);
        } catch (AlipayApiException e) {
            e.printStackTrace();
            log.info("与支付宝交互出错，未能生成订单，请检查代码！");
        }
        return orderString;
    }
}
