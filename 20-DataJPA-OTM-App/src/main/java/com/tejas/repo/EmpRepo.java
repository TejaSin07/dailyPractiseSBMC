package com.tejas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tejas.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
