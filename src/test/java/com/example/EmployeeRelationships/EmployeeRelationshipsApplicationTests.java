package com.example.EmployeeRelationships;

import com.example.EmployeeRelationships.models.Department;
import com.example.EmployeeRelationships.models.Employee;
import com.example.EmployeeRelationships.models.Project;
import com.example.EmployeeRelationships.repositories.DepartmentRepository;
import com.example.EmployeeRelationships.repositories.EmployeeRepository;
import com.example.EmployeeRelationships.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeRelationshipsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

//	@Test
//	public void testAll(){
//		Department department = new Department("HR");
//		departmentRepository.save(department);
//		Employee employee1 = new Employee("Jeff", "Bezos", 00000001, department);
//		employeeRepository.save(employee1);
//		Project project1 = new Project("World Domination", 5);
//		projectRepository.save(project1);
//
//	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("HR");
		departmentRepository.save(department);
		Employee employee1 = new Employee("Jeff", "Bezos", 00000001, department);
		employeeRepository.save(employee1);

	}

	@Test
	public void addEmployeesAndProjects(){
		Department department = new Department("HR");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Jeff", "Bezos", 00000001, department);
		employeeRepository.save(employee1);

		Project project1 = new Project("World Domination", 5);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}


	@Test
	void contextLoads() {
	}

}
