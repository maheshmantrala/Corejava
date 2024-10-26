package com.sush.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaEx {

	public static void main(String[] args) {

		List<item> listarr=new ArrayList<item>();

		listarr.add(new item(1,80000f,"Dell"));
		listarr.add(new item(2,40000f,"lenovo"));
		listarr.add(new item(3,50000f,"HP"));


		for(item i:listarr) 
			System.out.println(i);

		Collections.sort(listarr,(i1,i2)->{
			return i1.name.compareTo(i2.name);
		});
		System.out.println("After sorting");
		for(item i:listarr)
			System.out.println(i);

		System.out.println("Filtering the price");

		Stream<item> s=listarr.stream().filter(i->i.price> 20000f);
		s.forEach(i->System.out.println(i.id +","+i.name+ "," +i.price));
	}

}


