package com.qge.simple.factory;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/4 08:45
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class WeaponFactory {

    public static Weapon get(String weaponType){
        if ("TANK".equals(weaponType)) {
            return new Tank();
        }else if ("DAGGER".equals(weaponType)){
            return new Dagger();
        } else if ("FIGHTER".equals(weaponType)) {
            return new Fighter();
        }else {
            throw new RuntimeException("不支持该武器的生产");
        }
    }

}
