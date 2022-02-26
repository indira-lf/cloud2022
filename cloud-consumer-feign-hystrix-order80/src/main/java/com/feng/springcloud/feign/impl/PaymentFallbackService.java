package com.feng.springcloud.feign.impl;

import com.feng.springcloud.feign.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author
 * @time 2022/2/24 14:08
 * @Description- TODO
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";

    }
}
