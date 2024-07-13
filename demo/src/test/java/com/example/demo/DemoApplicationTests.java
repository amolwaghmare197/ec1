package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private simpleTest st;

	@Test
	void contextLoads() {
	}

	@Test
	public void rud() {
		int a = st.add(5, 10);
		assertEquals(a , 60);
	}

}
