package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.dao.AuthorityRepository;
import com.luv2code.springboot.thymeleafdemo.entity.Authority;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorityServiceImpl implements AuthorityService{

    @Autowired
    AuthorityRepository authorityRepository;
    @Override
    public List<Authority> findAll() {
        return authorityRepository.findAll();
    }
}
