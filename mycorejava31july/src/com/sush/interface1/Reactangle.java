package com.sush.interface1;

public interface Reactangle extends Polygon {

	@Override
	default void Area(int l, int b) {
	System.out.println("the area is rectangle is"+ l*b);
		
	}

	@Override
	default void Area(int r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void Area(int a, int b, int c) {
		// TODO Auto-generated method stub
		
	}

	
}
