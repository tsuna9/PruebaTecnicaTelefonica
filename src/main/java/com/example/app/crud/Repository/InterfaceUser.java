package com.example.app.crud.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.app.crud.Entity.*;

@Repository
public interface InterfaceUser extends CrudRepository<User, Integer>{

}
