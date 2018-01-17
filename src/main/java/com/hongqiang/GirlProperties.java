package com.hongqiang;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="girl")
//获取'girl'的前缀
public class GirlProperties {
    private String cupSize;
    private Integer age;

    public String getCupSize(){
        return  cupSize;
    }

    public void setCupSize(String cupSize){
        this.cupSize=cupSize;
    }

}
