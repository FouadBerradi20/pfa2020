package org.sambasoft.repositories;

import org.sambasoft.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository <Course, Long>{

}
