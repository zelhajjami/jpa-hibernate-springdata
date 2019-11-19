package org.zelhajjami.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements Serializable{
	@Id
	@GeneratedValue
	private Long idProduct;
	private String appelation;
	private double price;
	private int quantity;
	@ManyToOne
	@JoinColumn(name="ID_CAT") //Foreign key
	private Category category;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String appelation, double price, int quantity) {
		super();
		this.appelation = appelation;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public Product(String appelation, double price, int quantity, Category category) {
		super();
		this.appelation = appelation;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public String getAppelation() {
		return appelation;
	}
	public void setAppelation(String appelation) {
		this.appelation = appelation;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
