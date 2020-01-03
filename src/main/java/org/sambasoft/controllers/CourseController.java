package org.sambasoft.controllers;

import java.util.List;

import org.sambasoft.entities.Course;
import org.sambasoft.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class CourseController {
	
	@Autowired
	private CourseRepository CourseRepository;

	@GetMapping("/courses")
	public List<Course> getcourses() {
		return CourseRepository.findAll();
	}

	@GetMapping("/Course/{id}")
	public Course getCourse(@PathVariable Long id) {
		return CourseRepository.findOne(id);
	}

	@DeleteMapping("/Course/{id}")
	public boolean deleteCourse(@PathVariable Long id) {
		CourseRepository.delete(id);
		return true;
	}

	@PutMapping("/Course")
	public Course updateCourse(@RequestBody Course Course) {
		return CourseRepository.save(Course);
	}

	@PostMapping("/Course")
	public Course createCourse(@RequestBody Course Course) {
		return CourseRepository.save(Course);
	}

}
