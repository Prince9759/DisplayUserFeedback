package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataController {
	
	@Autowired
	UserDataRepo repo;
	
	@GetMapping("/saveData")
	
	public String saveData(UserData userData)
	{
		
		repo.save(userData);
		return "Data inserted Successfully";
	}
	
}
