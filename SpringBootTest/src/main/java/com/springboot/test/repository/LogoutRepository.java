package com.springboot.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.test.entity.LogoutEntity;

@Repository
public interface LogoutRepository extends CrudRepository<LogoutEntity, Long> {

	List<LogoutEntity> findAll();
}
