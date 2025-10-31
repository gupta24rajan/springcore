package com.springcore.lifecycle;
 // setting properties
public class Apple {
     private double price;

	 public double getPrice() {
		 return price;
	 }

	 public void setPrice(double price) {
		 System.out.println("Setting the price value");
		 this.price = price;
	 }

	 public Apple() {
		super();
		// TODO Auto-generated constructor stub
	 }

	 @Override
	 public String toString() {
		return "Apple [price=" + price + "]";
	 }
     
	 //init method
	 public void init() {
		 System.out.println("Bean is going through init process...");
	 }
	 
	 //destroy method
	 public void destroy() {
		 System.out.println("Bean will be destroyed now...");
	 }
	 
}
