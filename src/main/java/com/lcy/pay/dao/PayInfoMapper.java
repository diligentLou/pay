package com.lcy.pay.dao;

import com.lcy.pay.pojo.PayInfo;

/**
 * @description:
 * @author:lcy
 * @createTime:2020/5/8 20:12
 */
public interface PayInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PayInfo record);

    int insertSelective(PayInfo record);

    PayInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayInfo record);

    int updateByPrimaryKey(PayInfo record);

    PayInfo selectByOrderNo(Long orderNo);
}
