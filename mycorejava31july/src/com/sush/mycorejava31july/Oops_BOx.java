package com.sush.mycorejava31july;

public class Oops_BOx {
	double length;
	double width;
	double height;

	public Oops_BOx(double length, double width, double height) {

		this.length = length;
		this.width = width;
		this.height = height;
	}

	public Oops_BOx() {

		// TODO Auto-generated constructor stub
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Oops_BOx [length=" + length + ", width=" + width + ", height=" + height + "] ";
	}
	double Volume() {
		return length*width*height;
	}



}
