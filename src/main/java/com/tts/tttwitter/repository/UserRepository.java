package com.tts.tttwitter.repository;

import org.springframework.stereotype.Repository;

import com.tts.tttwitter.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByUsername(String username);
	
	
}
