package com.spring.interviewprograms;


public class SumofDigit {
	public static void main(String[] args) {
		int sum = ultimateSum(123457);
		System.out.println(sum);
	}
	
	static int ultimateSum(int number){
		int sum = 0;
		int n = number;
		while(n>9){
			sum = 0;
			while(n > 0){
				int rem;
	            rem = n % 10;
	            sum = sum + rem;
	            n = n / 10;
			}
			n = sum;
		}
		
			
			
		return sum;
		
	}

}
