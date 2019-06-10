package com.msun.springbootmail.springbootmail;

import com.msun.springbootmail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMailApplicationTests {

	@Autowired
	private MailService MailService;

	@Test
	public void sendMail() {
		MailService.sendSimpleMail("708851221@qq.com","test simple mail"," hello this is simple mail");
	}

}

