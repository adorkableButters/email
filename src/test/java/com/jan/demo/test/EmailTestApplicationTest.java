package com.jan.demo.test;

import com.jan.demo.Service.EmailTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailTestApplicationTest {

	@Autowired
	private EmailTestService emaillTestService;

	@Test
	public void sayHellow() {
		emaillTestService.sayHellow();
	}

	@Test
	public void sendSimpleMaileTest() {
		emaillTestService.sendEmail("1186617183@qq.com","这是我的第一封邮件","大家好，这是我的第一封邮件");
	}
}