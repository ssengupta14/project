package com.elenverve.dvo;

import java.io.Serializable;
import java.util.Date;

public class TestimonialDvo implements Serializable{
	private String testimonialId;
	private String username;
	private String comments;
	
	private double reviewStars;
	private Date date;	
	public static String ANNONIMOUS_USER="Annonimous";
	
	public String getTestimonialId() {
		return testimonialId;
	}
	public void setTestimonialId(String testimonialId) {
		this.testimonialId = testimonialId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public double getReviewStars() {
		return reviewStars;
	}
	public void setReviewStars(double reviewStars) {
		this.reviewStars = reviewStars;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
