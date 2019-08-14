package com.demo.onlinebanking.repository;

import com.demo.onlinebanking.security.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}