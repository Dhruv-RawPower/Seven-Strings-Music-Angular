package net.javaguides.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	// Create a Logger
    Logger logger
        = Logger.getLogger(
        		EmployeeServiceImpl.class.getName());
    
	
	@Autowired
	private EmployeeRepository employeeRepository;


	
	
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		logger.info("Before Encyption");
		System.out.println(employee);
		logger.info(employee.getPassword());
		BCryptPasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();
		employee.setPassword(bcryptEncoder.encode(employee.getPassword()));
	
		logger.info("After Encryption");
		logger.info(employee.getPassword());
		
		this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
		logger.info("In getEmployeeById");
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
	}
	 
	@Override
	public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		logger.info("In Pagingation of Service Impl.");
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.employeeRepository.findAll(pageable);
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		/*if(userName.equals("Conor"))
		{
			
			return new User("Conor", "Mcgregor", new ArrayList<>());
		}else
		{
			throw new UsernameNotFoundException("User Not Found!!");
		}*/

		logger.info("In find by username");
		//loading user from database
		Employee user = this.employeeRepository.findByUserName(userName).orElseThrow(() -> new UsernameNotFoundException(userName));
		logger.info("In find by username khallas");
		return user;
		
		
	}
}
