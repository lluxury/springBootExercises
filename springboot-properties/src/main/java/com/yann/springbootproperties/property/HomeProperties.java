package com.yann.springbootproperties.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: demo3
 * @description: 家兴属性
 * @author: Yann
 * @create: 2019-03-23 13:08
 **/
@Component
@ConfigurationProperties(prefix = "home")
public class HomeProperties {
    private String province;

    private String city;

    private String desc;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "HomeProperties{" +
                "province='" + province + '\'' +
                ",city='" + city + '\'' +
                ",desc='" + desc + '\'' +
                '}';
    }
}
