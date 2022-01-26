package com.feng.springcloud.service;

import com.feng.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author
 * @time 2022/1/21 21:09
 * @Description- TODO
 */
public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}

