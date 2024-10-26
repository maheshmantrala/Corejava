package com.sush.mycorejava29july;

public class Helloworld {

	public static void main(String[] args) {
		//simple interest 
//		int principle=1000;
//		
//	      int time =3;
//		for(int r=0;r<60;r++) {
//		//	int []arr=new int[100];
//			int SI= (principle*r*time)/100;
//		
//			System.out.println("The simple interest is:"+SI);
//			}
// IF A CAN DO WORK IN 12 DAYS AND B CAN DO WORK IN 24 DAYS ,THEN HOW MANY DAYS REQUIRED FOR A AND B TOGETHER TO COMPLETE SAME WORK?
		float n1=12;
		float n2=24;
		
	float 	lcm=(n1>n2)?n1:n2;
		
		while(true){
			if(lcm % n1==0 && lcm % n2==0) {
				//System.out.println(lcm);
				break;
			}
		     ++lcm;
		}
		
		//System.out.println("the work will be:"+lcm);
		
		float efficiencyA= lcm/n1;
		float efficiencyB= lcm/n2;
		
		float sum= efficiencyA+efficiencyB;
		
	float  Result= (lcm/sum);
		
		System.out.println("The number of days required to complete the work for A and B is:"+Result);
		
		
		
	
	}

}
