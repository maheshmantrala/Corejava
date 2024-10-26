package com.sush.lambda;

public class item {
   int id;
   float price;
   String name;
public item(int id, float price, String name) {

	this.id = id;
	this.price = price;
	this.name = name;
}
@Override
public String toString() {
	return "item [id=" + id + ", price=" + price + ", name=" + name + "]";
}

   
}
