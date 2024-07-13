package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;

@Component
public class simpleTest{


	public int add(int a , int b) {
		int res = a + b;
		return res;
	}
	
	@Test
	public void rud() {
		int a = add(5, 10);
		assertEquals(a , 60);
	}
}
