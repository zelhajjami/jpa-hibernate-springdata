package org.zelhajjami.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	private String categoryName;
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY) //charger les produits que sur la demande
	private Collection<Product> products;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Collection<Product> getProducts() {
		return products;
	}
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	
	
}
