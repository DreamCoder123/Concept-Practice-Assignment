package com.masai.Service;

import org.springframework.stereotype.Service;

import com.masai.model.Emoployee;
import com.masai.model.Reportingmanager;

@Service
public interface EmployeeService {

	public Emoployee saveEmployee(Emoployee emoployee);
	public Emoployee findEmployeeById(Integer emplid);
	public Reportingmanager findbyemployeeid(Integer integer);
	
}
