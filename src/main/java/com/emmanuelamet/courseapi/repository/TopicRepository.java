package com.emmanuelamet.courseapi.repository;

import com.emmanuelamet.courseapi.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
