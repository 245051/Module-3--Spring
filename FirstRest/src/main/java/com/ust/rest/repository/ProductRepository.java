package com.ust.rest.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.ust.rest.resource.Product;
@Repository // In other classes we are calling the object ,in this 
public class ProductRepository {
 private ArrayList<Product>  productCaching = new ArrayList<>();
 	
 		public ProductRepository() {
 			Product p1=new Product();
 			p1.setProductId(101);
 			p1.setName("Laptop");
 			p1.setDescription("MAcbook retina Eye");
 			p1.setPrice(new BigDecimal(1800000));
 			p1.setQuantity(5);
 			productCaching .add(p1);
 			
 	 			Product p2=new Product();
 	 			p2.setProductId(102);
 	 			p2.setName("tablet");
 	 			p2.setDescription("Samasung MAx view");
 	 			p2.setPrice(new BigDecimal(1800));
 	 			p2.setQuantity(10);
 	 			productCaching .add(p2);
 	 		
 	 		Product p3=new Product();
 	 			p3.setProductId(103);
 	 			p3.setName("Mobile");
 	 			p3.setDescription("Samasung ");
 	 			p3.setPrice(new BigDecimal(18000));
 	 			p3.setQuantity(15);
 	 			productCaching .add(p3);
 	 			
 	 			Product p4 =new Product();
 	 			p4.setProductId(104);
 	 			p4.setName("Airconditioner");
 	 			p4.setDescription("lue housde ");
 	 			p4.setPrice(new BigDecimal(15000));
 	 			p4.setQuantity(12);
 	 			productCaching .add(p4);
 	 			
 	 			Product p5 =new Product();
 	 			p5.setProductId(105);
 	 			p5.setName("Washing machine");
 	 			p5.setDescription("Wash ");
 	 			p5.setPrice(new BigDecimal(20000));
 	 			p5.setQuantity(5);
 	 			productCaching .add(p5);
 	 		
 			
 		}
 
 
 
		 public boolean addProduct(Product product) {
			 if(productCaching.add(product))
					return true;
				else
					return false;
			// return productCaching.add(product);
			 
		 }
		 //REtrieve
		 public Product getProduct(long ProductId) {
			 Iterator<Product> iter = productCaching.iterator();
			 Product product=null;
			 while(iter.hasNext()) {
				 product = iter.next();
				 
				 if(product.getProductId()==ProductId)
				 	break;
			 }
				 if(product!=null)
					 return product;
				 
				 else
					 return null;
			 
		 }



		public ArrayList<Product> getProduct() {
			// TODO Auto-generated method stub
			return productCaching;
		}
		public Product updateproduct(Product productToUpdate) {
			Product searchProduct = null;
			Iterator<Product> iter = productCaching.iterator();
			int index=0;
			while(iter.hasNext()) {
				
				searchProduct = iter.next();
				if(searchProduct.getProductId() == productToUpdate.getProductId()) {
					productCaching.add(index,productToUpdate);
					productToUpdate =searchProduct;
				}
				index++;
			}
			return productToUpdate;
					
				}
		public void delete(long productId) {
			
			Iterator<Product> iter=productCaching.iterator();
			int index=0;
			while(iter.hasNext()) {
				Product tempProduct = iter.next();
				if(tempProduct.getProductId()==productId) {
					//productCaching.remove(index);
					break;
				}
				index++;
				}
			productCaching.remove(index);
			}
		}
			
		

