package com.tejas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tejas.entity.Address;

public interface AddrRepo extends JpaRepository<Address, Integer>{

}
