package com.nebuale.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsoleApplicationTests {

	@Test
	public void contextLoads() {
	   System.out.println("Test Message 04");
	}

	@Test
	public void testMethod02() {
	   System.out.println("Test message 03");
	}

}
