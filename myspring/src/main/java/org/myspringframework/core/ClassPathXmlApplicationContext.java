package org.myspringframework.core;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: ***
 * @Author: Mr.Shi
 * @version: 1.0
 * @Date: 2023/04/2023/4/7 09:06
 * @copyright: 内蒙古柒个贰航空旅游有限公司 All rights reserved. Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class ClassPathXmlApplicationContext implements ApplicationContext{

    private Map<String,Object> singletonObjects = new HashMap<>();

    public ClassPathXmlApplicationContext(String configLocation){
        try {
            SAXReader reader = new SAXReader();
            InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
            Document document = reader.read(stream);
            List<Node> nodes = document.selectNodes("//bean");
            nodes.forEach(node -> {
                try {
                    Element beanElt = (Element) node;
                    String id = beanElt.attributeValue("id");
                    String clazz = beanElt.attributeValue("class");
                    Class<?> aClass = Class.forName(clazz);
                    Constructor<?> defaultCon = aClass.getDeclaredConstructor();
                    Object bean = defaultCon.newInstance();
                    singletonObjects.put(id,bean);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
            nodes.forEach(node -> {
                try {
                    Element beanElt = (Element) node;
                    String id = beanElt.attributeValue("id");
                    String clazz = beanElt.attributeValue("class");
                    Class<?> aClass = Class.forName(clazz);
                    List<Element> properties = beanElt.elements("property");
                    properties.forEach(property->{
                        try {
                            String propertyName = property.attributeValue("name");
                            Field field = aClass.getDeclaredField(propertyName);
                            String setMethodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
                            Method setMethod = aClass.getDeclaredMethod(setMethodName, field.getType());
                            String value = property.attributeValue("value");
                            String ref = property.attributeValue("ref");
                            if (value != null){
                                String simpleName = field.getType().getSimpleName();
                                switch (simpleName){

                                }
                                setMethod.invoke(singletonObjects.get(id),value);
                            }
                            if (ref != null){
                                setMethod.invoke(singletonObjects.get(id),singletonObjects.get(ref));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
                }catch (Exception e){
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Object getBean(String beanName) {
        return "";
    }
}
