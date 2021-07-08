package com.hendra.departmentservice.controller;

import com.hendra.cloudfeign.api.UserIntv;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import com.hendra.departmentservice.entity.Department;
//import com.hendra.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    protected static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/")
    public String savePost() {
        return "savePost";
    }

    @Autowired
    private UserIntv userIntv;

    @GetMapping("/{id}")
    public String getMapping(@PathVariable("id") long id) {

        logger.info("Enter Department with ID "+userIntv.testUser());
        return id + "\tcoba";
    }

//	@Autowired
//	private DepartmentService departmentService;
//	
//	@PostMapping("/")
//	public Department saveDepartment(@RequestBody Department department) {
//		return departmentService.saveDepartment(department);
//	}
//	
//	@GetMapping("/{id}")
//	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
//		return departmentService.findDepartmentById(departmentId);
//	}
}
