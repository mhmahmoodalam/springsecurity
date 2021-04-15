package com.example.demo.repository;

import com.example.demo.security.model.AccountUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCrudRepository  extends CrudRepository<AccountUser, Integer> {

}
