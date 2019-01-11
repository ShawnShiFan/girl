package com.shawn.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * by Shawn
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {//如何把配置写到类中  注意Component注解Bean才能识别
  private String cupSize;
  private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
