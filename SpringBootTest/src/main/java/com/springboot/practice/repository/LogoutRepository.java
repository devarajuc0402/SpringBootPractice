package com.springboot.practice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.practice.entity.LogoutEntity;

@Repository
public interface LogoutRepository extends CrudRepository<LogoutEntity, Long> {

	List<LogoutEntity> findAll();
}
