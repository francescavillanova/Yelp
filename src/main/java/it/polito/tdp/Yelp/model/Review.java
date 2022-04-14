package it.polito.tdp.Yelp.model;

import java.time.LocalDate;

public class Review {
	private String reviewId;
	private Business business;  // al posto della chiave esterna businessId
	private User user;  // al posto della chiave esterna userId
	private double stars;
	private LocalDate reviewDate;
	private int votesFunny;
	private int votesUseful;
	private int votesCool;
	private String reviewText;
	
	
}
