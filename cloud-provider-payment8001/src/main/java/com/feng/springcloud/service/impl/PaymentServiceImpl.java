package com.feng.springcloud.service.impl;

import com.feng.springcloud.dao.PaymentDao;
import com.feng.springcloud.entities.Payment;
import com.feng.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author
 * @time 2022/1/21 21:11
 * @Description- TODO
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }
}
