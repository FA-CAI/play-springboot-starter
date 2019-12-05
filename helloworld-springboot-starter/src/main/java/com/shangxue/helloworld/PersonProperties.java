package com.shangxue.helloworld;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/12/5 17:44
 * @Version
 *
 *
 * 在使用Spring官方的Starter时通常可以在application.properties中来配置参数覆盖掉默认的值，例如在使用redis时一般就会有对应的RedisProperties
 *
 * 我们来模仿来定义自己的Properties类
 */
@ConfigurationProperties(prefix = "spring.person")
public class PersonProperties {
    // 姓名
    private String name;
    // 年龄
    private int age;
    // 性别
    private String sex = "M";

    // Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
