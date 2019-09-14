package io.jb.springbootquickstart.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	//get all Topics
	//Get topic (id)
	//updateTopic(Topic t)
	//deleteTopic(id)
}
