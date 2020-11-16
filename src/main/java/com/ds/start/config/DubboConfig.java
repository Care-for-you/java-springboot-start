package com.ds.start.config;

import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName DubboConfig
 * @Description dubbo配置类
 * @Author Ds.Yang
 * @Date 2020/10/20 11:26
 * @Version 1.0
 */
@PropertySource(value = "classpath: dubbo/dubbo.properties")
@ImportResource(value = "classpath: dubbo/*.xml")
public class DubboConfig {

}
