package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.clieRep;
import com.example.demo.entity.loginDet;

@RestController
@RequestMapping("/")
public class cliCont {

	
	@Autowired
    private clieRep repo;
	
	@GetMapping("/all")
	public void getAll() {
		List<loginDet> a1 = repo.findAll();
		
		boolean s1 = repo.existsById(1L);
		System.out.println(s1);
	}
}
