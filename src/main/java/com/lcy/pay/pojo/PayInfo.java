package com.lcy.pay.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description:
 * @author:lcy
 * @createTime:2020/5/8 20:11
 */
@Data
public class PayInfo {

    private Integer id;

    private Integer userId;

    private Long orderNo;

    private Integer payPlatform;

    private String platformNumber;

    private String platformStatus;

    private BigDecimal payAmount;

    private Date createTime;

    private Date updateTime;

    public PayInfo(Long orderNo, Integer payPlatform, String platformStatus, BigDecimal payAmount) {
        this.orderNo = orderNo;
        this.payPlatform = payPlatform;
        this.platformStatus = platformStatus;
        this.payAmount = payAmount;
    }
}
