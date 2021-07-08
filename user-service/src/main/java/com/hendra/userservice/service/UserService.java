//package com.hendra.userservice.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import com.hendra.userservice.entity.User;
//import com.hendra.userservice.repository.UserRepository;
//import com.hendra.userservice.vo.Department;
//
//@Service
//public class UserService {
//
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private RestTemplate restTemplate;
//
//	public User saveUser(User department) {
//		return userRepository.save(department);
//	}
//
//	public com.hendra.userservice.vo.User findUserById(Long departmentId) {
//		User user = userRepository.findByUserId(departmentId);
//		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+user.getDepartmentId(), Department.class);
//		return new com.hendra.userservice.vo.User(user, department);
//	}
//	
//}
