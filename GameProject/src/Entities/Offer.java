package Entities;

public class Offer {
	//FIELD
	private int  id;
	private String offerName;
	private double offerDiscount;
	private int offerDate;
	
	//YAPICI
	public Offer() {
		
	}
	public Offer(int id, String offerName, double offerDiscount, int offerDate) {
		super();
		this.id = id;
		this.offerName = offerName;
		this.offerDiscount = offerDiscount;
		this.offerDate = offerDate;
	}
	
	//SET/GET
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public double getOfferDiscount() {
		return offerDiscount;
	}
	public void setOfferDiscount(double offerDiscount) {
		this.offerDiscount = offerDiscount;
	}
	public int getOfferDate() {
		return offerDate;
	}
	public void setOfferDate(int offerDate) {
		this.offerDate = offerDate;
	}

}
