package com.qge.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/4 16:20
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String name;

    public User() {
        System.out.println("第一步：无参数构造方法执行");
    }

    public void setName(String name) {
        System.out.println("第二步：给对象属性赋值");
        this.name = name;
    }

    public void initBean(){
        System.out.println("第六步：初始化bean");
    }

    public void destroyBean(){
        System.out.println("第十步：销毁bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("        Bean的加载器是：" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("        Bean的工厂是：" + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.print("第三步：");
        System.out.println("Bean的名字是：" + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第五步：");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第九步：");
    }
}
