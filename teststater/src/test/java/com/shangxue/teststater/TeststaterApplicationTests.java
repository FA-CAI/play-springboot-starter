package com.shangxue.teststater;

import com.shangxue.helloworld.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
class TeststaterApplicationTests {

	@Test
	void contextLoads() {
	}


	@Autowired
	private PersonService personService;  //IDEA发神经了 //从使用者的角度来看，自己并没有将PersonService放入到Spring容器中，就直接来使用了，进行注入进来了。


	@Test
	public void testHelloWorld() {
		personService.sayHello();
	}


}
/**
 *
 * 总结下Starter的工作原理

 Spring Boot在启动时扫描项目所依赖的JAR包，寻找包含spring.factories文件的JAR包，
 然后读取spring.factories文件获取配置的自动配置类AutoConfiguration，
 然后将自动配置类下满足条件(@ConditionalOnXxx)的@Bean放入到Spring容器中(Spring Context)
 这样使用者就可以直接用来注入，因为该类已经在容器中了
 *
 * */