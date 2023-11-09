package com.yedam.app.accessigndatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
															
													// <사용 class, 기본키 타입>
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	// findBy : 검색
	List<Customer> findByFirstName(String name);
	List<Customer> findByLastName(String name);
}
