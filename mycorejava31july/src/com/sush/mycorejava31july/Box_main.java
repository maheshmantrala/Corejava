package com.sush.mycorejava31july;

public class Box_main {

	public static void main(String[] args) {

		Oops_BOx b2=new Oops_BOx(4,5,6);

		Weight weight=new Weight(500);
		Color c=new Color("black");
		b2.toString();
		c.showcolor();
		weight.showweight();
		double volume =b2.Volume();
		double box_weight=weight.weight;
		double Density= box_weight/volume;
		System.out.println("The density of the box is "+Density);


	}

}
