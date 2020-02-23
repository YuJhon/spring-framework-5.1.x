package com.rain.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * <pre>功能描述：</br>启动扫包配置<pre>
 * @ProjectName spring
 * @Author rain
 * @date 2020-02-23 13:28
 * @version v1.0
 */
@Component
@ComponentScan("com.rain")
@EnableAspectJAutoProxy(exposeProxy = true)
public class RainConfig {
}
