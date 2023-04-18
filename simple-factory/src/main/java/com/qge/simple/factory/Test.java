package com.qge.simple.factory;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/4 08:49
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class Test {
    public static void main(String[] args) {
        Weapon tank = WeaponFactory.get("TANK");
        tank.attack();
    }
}
