package com.newpostuser.com.newpostuser.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newpostuser.com.newpostuser.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	
}
