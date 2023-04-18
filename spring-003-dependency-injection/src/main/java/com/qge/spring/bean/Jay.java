package com.qge.spring.bean;

import java.util.Arrays;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/03/2023/3/31 16:53
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class Jay {
    private String[] hobbies;
    private Girl[] girls;

    @Override
    public String toString() {
        return "Jay{" +
                "hobbies=" + Arrays.toString(hobbies) +
                ", girls=" + Arrays.toString(girls) +
                '}';
    }

    public void setGirls(Girl[] girls) {
        this.girls = girls;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
}
