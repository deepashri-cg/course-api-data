package io.jb.springbootquickstart.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{
	//get all Topics
	//Get topic (id)
	//updateTopic(Topic t)
	//deleteTopic(id)
}
