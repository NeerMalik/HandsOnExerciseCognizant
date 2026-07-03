package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.repository.StockRepository;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

@SpringBootApplication
public class OrmLearnApplication {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private SkillService skillService;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Bean
	CommandLineRunner run(CountryRepository countryRepository,
	                      StockRepository stockRepository) {

		return args -> {

			// =======================
			// HANDS ON 1
			// =======================

			System.out.println("\n========== COUNTRY ==========");

			System.out.println("\nCountries containing 'ou'");
			countryRepository.findByNameContaining("ou")
					.forEach(System.out::println);

			System.out.println("\nCountries containing 'ou' in ascending order");
			countryRepository.findByNameContainingOrderByNameAsc("ou")
					.forEach(System.out::println);

			System.out.println("\nCountries starting with 'Z'");
			countryRepository.findByNameStartingWith("Z")
					.forEach(System.out::println);


			// =======================
			// HANDS ON 2
			// =======================

			System.out.println("\n========== STOCK ==========");

			System.out.println("\nFacebook September Data");

			stockRepository.findByCodeAndDateBetween(
							"FB",
							LocalDate.of(2019, 9, 1),
							LocalDate.of(2019, 9, 30))
					.forEach(System.out::println);

			System.out.println("\nGoogle Close > 1250");

			stockRepository.findByCodeAndCloseGreaterThan(
							"GOOGL",
							new BigDecimal("1250"))
					.forEach(System.out::println);

			System.out.println("\nTop 3 Highest Volume");

			stockRepository.findTop3ByOrderByVolumeDesc()
					.forEach(System.out::println);

			System.out.println("\nLowest Netflix");

			stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX")
					.forEach(System.out::println);


			// =======================
			// HANDS ON 4
			// =======================

			testGetEmployee();

			testAddEmployee();

			testUpdateEmployee();


			// =======================
			// HANDS ON 5
			// =======================

			testGetDepartment();


			// =======================
			// HANDS ON 6
			// =======================

			testAddSkillToEmployee();

		};
	}

	private void testGetEmployee() {

		System.out.println("\n========== GET EMPLOYEE ==========");

		Employee employee = employeeService.get(1);

		System.out.println(employee);

		System.out.println(employee.getDepartment());

		System.out.println(employee.getSkillList());

	}

	private void testAddEmployee() throws Exception {

		System.out.println("\n========== ADD EMPLOYEE ==========");

		Employee employee = new Employee();

		employee.setName("Neer");

		employee.setSalary(90000);

		employee.setPermanent(true);

		employee.setDateOfBirth(
				new SimpleDateFormat("dd/MM/yyyy")
						.parse("10/09/2005"));

		Department department = departmentService.get(2);

		employee.setDepartment(department);

		employeeService.save(employee);

		System.out.println(employee);

	}

	private void testUpdateEmployee() {

		System.out.println("\n========== UPDATE EMPLOYEE ==========");

		Employee employee = employeeService.get(1);

		Department department = departmentService.get(3);

		employee.setDepartment(department);

		employeeService.save(employee);

		System.out.println(employee);

	}

	private void testGetDepartment() {

		System.out.println("\n========== GET DEPARTMENT ==========");

		Department department = departmentService.get(2);

		System.out.println(department);

		System.out.println(department.getEmployeeList());

	}

	private void testAddSkillToEmployee() {

		System.out.println("\n========== ADD SKILL TO EMPLOYEE ==========");

		Employee employee = employeeService.get(3);

		Skill skill = skillService.get(1);

		employee.getSkillList().add(skill);

		employeeService.save(employee);

		System.out.println(employee.getSkillList());

	}

}