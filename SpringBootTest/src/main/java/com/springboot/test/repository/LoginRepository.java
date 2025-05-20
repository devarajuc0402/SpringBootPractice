package com.springboot.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.test.entity.LoginEntity;

@Repository
public interface LoginRepository extends CrudRepository<LoginEntity, Long> {

	List<LoginEntity> findAll();
}
