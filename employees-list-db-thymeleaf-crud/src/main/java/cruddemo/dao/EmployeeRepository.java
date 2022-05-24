package cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// replaces Service + DAO packages
	
	
}
