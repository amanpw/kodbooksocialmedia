package com.newpostuser.com.newpostuser.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newpostuser.com.newpostuser.Repository.PostRepository;
import com.newpostuser.com.newpostuser.entities.Post;

@Service
public class PostServiceImplementation implements PostServices {
    @Autowired
	PostRepository repo;
	@Override
	public String saveData(Post post) {
		repo.save(post);
		return "Data has been stored";
		
	}
	@Override
	public List<Post> featchalldata() {
	    List<Post> allData =	repo.findAll();
		return allData;
	}
}
