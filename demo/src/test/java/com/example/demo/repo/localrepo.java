package com.example.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.clieRep;

@SpringBootTest
public class localrepo {

	@Autowired
	private clieRep rp;
	
	@Test
	void isPersonExistedById() {
		
		boolean b1 = rp.existsById(1L);
		
		assertThat(b1).isTrue();
	}
}
