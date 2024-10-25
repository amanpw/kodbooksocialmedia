package com.newpostuser.com.newpostuser.services;

import java.util.List;

import com.newpostuser.com.newpostuser.entities.Post;

public interface PostServices {

	String saveData(Post post);
	List<Post> featchalldata();
}
