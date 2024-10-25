package com.newpostuser.com.newpostuser.entities;

import java.util.Arrays;
import java.util.Base64;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
	String program ;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(columnDefinition = "LONGBLOB")
	byte [] photo;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPhotoBase64() {
		if(photo==null) {
			return null;
		}
		return Base64.getEncoder().encodeToString(photo);
	}
	public Post(Long id, String program, byte[] photo) {
		super();
		this.id = id;
		this.program = program;
		this.photo = photo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", program=" + program + ", photo=" + Arrays.toString(photo) + ", getId()=" + getId()
				+ ", getProgram()=" + getProgram() + ", getPhoto()=" + Arrays.toString(getPhoto()) + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
