package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="profilepictures")
public class ProfilePicture 
{
	@Id
   private String username;

   private byte[] image;
   
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
   
}
