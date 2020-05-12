package com.lcy.pay.service;

import com.lcy.pay.pojo.PayInfo;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

/**
 * @description:
 * @author:lcy
 * @createTime:2020/5/7 20:08
 */
public interface IPayService {


    /**
     * 创建/发起支付
     * @param orderId
     * @param amount
     * @param bestPayTypeEnum
     * @return PayResponse
     */
    PayResponse create(String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum);

    /**
     * 异步通知处理
     * @param notifyData
     * @return String
     */
    String asyncNotify(String notifyData);

    /**
     * 查询支付记录(通过订单号)
     * @param orderId
     * @return
     */
    PayInfo queryByOrderId(String orderId);
}
