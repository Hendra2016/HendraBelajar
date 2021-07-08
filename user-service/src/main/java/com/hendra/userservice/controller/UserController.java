package com.hendra.userservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.hendra.userservice.entity.User;
//import com.hendra.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	protected static final Logger logger = LoggerFactory.getLogger(UserController.class);

//	@Autowired
//	private UserService departmentService;

//	@PostMapping("/")
//	public User saveDepartment(@RequestBody User department) {
//		return departmentService.saveUser(department);
//	}
//	
//	@GetMapping("/{id}")
//	public User getUserWithDepartment(@PathVariable("id") Long departmentId) {
//		return departmentService.findUserById(departmentId);
//	}

	@GetMapping("/")
	public String saveUser() {
		return "Save User";
	}

	@GetMapping("/{id}")
	public String getUserWithDepartment(@PathVariable("id") Long userId) {
		logger.info("enter The User with ID");
		return userId + "\tuser";
	}
}
