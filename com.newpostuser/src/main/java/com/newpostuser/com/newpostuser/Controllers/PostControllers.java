package com.newpostuser.com.newpostuser.Controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.newpostuser.com.newpostuser.entities.Post;
import com.newpostuser.com.newpostuser.services.PostServiceImplementation;


@Controller
public class PostControllers {
    @Autowired
	PostServiceImplementation service;
	@PostMapping("/post")
	public String post(@RequestParam String program , @RequestParam MultipartFile photo , Model model )  {
		
	 Post post = new Post();
	 post.setProgram(program);
	 
		 try {
			post.setPhoto(photo.getBytes());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 service.saveData(post);
	 List<Post> listData = service.featchalldata();
	 
	 model.addAttribute("post", listData);
		return "show";
	}
	
}
