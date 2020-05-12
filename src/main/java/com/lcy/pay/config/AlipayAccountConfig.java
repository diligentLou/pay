package com.lcy.pay.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:lcy
 * @createTime:2020/5/9 10:04
 */
@Component
@ConfigurationProperties(prefix = "alipay")
@Data
public class AlipayAccountConfig {

    private String appId;

    private String privateKey;

    private String publicKey;

    private String notifyUrl;

    private String returnUrl;
}
