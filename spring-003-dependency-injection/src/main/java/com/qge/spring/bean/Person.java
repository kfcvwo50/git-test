package com.qge.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/03/2023/3/31 17:19
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class Person {

    private List<String> names;
    private Map<String,String> phones;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", phones=" + phones +
                ", properties=" + properties +
                ", addresses=" + addresses +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Properties properties;

    public void setPhones(Map<String, String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    private Set<String> addresses;

}
