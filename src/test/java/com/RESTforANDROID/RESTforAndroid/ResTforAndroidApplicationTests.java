package com.RESTforANDROID.RESTforAndroid;

import com.RESTforANDROID.RESTforAndroid.Model.emploee.Employee;
import com.RESTforANDROID.RESTforAndroid.Model.emploee.EmployeeDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ResTforAndroidApplicationTests {
	@Autowired
	EmployeeDAO employeeDAO;

	@Test
	void contextLoads() {
		Employee employee = new Employee("Nikita","Vitebsk","IT");
		employeeDAO.save(employee);

	}

}
