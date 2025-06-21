package com.tejas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tejas.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
