package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.loginDet;

public interface clieRep extends JpaRepository<loginDet, Long> {

}
