package com.shangxue.helloworld;

/**
 * @Descirption shangxue
 * @Author tengfei
 * @Date 2019/12/5 17:45
 * @Version
 */
public class PersonService {

    private PersonProperties properties;

    public PersonService() {
    }

   //待会用这个有参构造器。这里真注入
    public PersonService(PersonProperties properties) {
        this.properties = properties;
    }

    public void sayHello(){
        System.out.println("hello,my name is: " + properties.getName() + "; i am" + properties.getAge() + "years old"
                + "; my sex: " + properties.getSex());
    }


}
