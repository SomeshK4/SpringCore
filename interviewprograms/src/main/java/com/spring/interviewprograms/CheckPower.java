package com.spring.interviewprograms;



public class CheckPower {
	public static void main(String[] args) {
		checkPower(164,4);
	}
	
	
	static boolean checkPower(int a , int b){
		 int num=b;
		    System.out.println("No to check power="+b);
		    int sum=1;

		    while(sum<=a){
		        sum=sum*b;
		        if(sum==a){
		            System.out.println(b+" is a Power of "+a);
		            return true;
		        }
		        else if(sum>a){
		        	System.out.println(sum);
		            System.out.println(b+" is not a Power of "+a);
		            return false;
		        }
		     }
		    return false;
	}
}
