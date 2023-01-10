package net.javaguides.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	Optional<Employee> findByEmail(String Username);

	Optional<Employee> findByUserName(String userName);

	//@Query("select u from Employee u where u.username = :username")
	//Employee GetUserByUserName(@Param("username") String userName);
}
