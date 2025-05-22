package com.springboot.practice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.practice.entity.RegisterEntity;


@Repository
public interface RegisterRepository extends CrudRepository<RegisterEntity, Long> {

	List<RegisterEntity> findAll();
	
	@SuppressWarnings("unchecked")
	RegisterEntity save(RegisterEntity request);
}
