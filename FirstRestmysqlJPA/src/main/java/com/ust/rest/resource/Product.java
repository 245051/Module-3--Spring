package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

//import javax.persistence.Entity;
//import javax.persistence.Id;


@Entity 
//Then only it will detect class as persistent class. We are telling JPA to create a table with the class.
//@Table(name="myproducts")
// Class whose object need to be persisyed in database.

@Getter
@Setter
public class Product { // In rest object is having each representation,rest give representation to the state
	
	
	@Id
	@Getter
	@Setter
	//@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@GeneratedValue(strategy=GenerationType.AUTO)  // We need ORN to give the primary key.It is the frame work who creates the ID.It will add the ID with the help of daata place
	// AUTO--> default,IDENTITY --> will give a big number,SEQUENCE,TABLE
	//Auto is the default generation type.Genertio   type is the strategy which the JPA should use or follow to generate primary key values
	//When a strategy is not specified the JPA uses auto strategy.When the underline database is mysql Generation Type.auto means the JPA will create a hybernite sequence in the database for geneartion of primary keys.
	//
	private long productId;
	
	private String name;
	private String description;
	@Column(name= "qty") // By this we can change the "quantity " as "qty" in database.
	private int quantity;
	private int price;
	
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	private BigDecimal price;
//	public long getProductId() {
//		return productId;
//	}
//	public void setProductId(long productId) {
//		this.productId = productId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}


}
//This is what the hybernite will show when it runs the GeneartedValue(GenearteType.Auto)
//select next_val as id_val from hibernate_sequence for update
//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//Hibernate: insert into product (description, name, quantity, product_id) values (?, ?, ?, ?)
//Hibernate: select next_val as id_val from hibernate_sequence for update
//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//Hibernate: insert into product (description, name, quantity, product_id) values (?, ?, ?, ?)

//------------------------------------
//Hibernate: insert into product (description, name, price, qty) values (?, ?, ?, ?)
//Hibernate: insert into product (description, name, price, qty) values (?, ?, ?, ?)
//Hibernate: insert into product (description, name, price, qty) values (?, ?, ?, ?)


