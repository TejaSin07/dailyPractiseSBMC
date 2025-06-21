package com.tejas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tejas.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

}
