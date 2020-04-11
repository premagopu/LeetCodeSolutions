package com.practice;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {

	public static void main(String[] args) {
		System.out.println(isHappy(19));

	}
	
	 public static boolean isHappy(int n) {
	        Set<Integer> s = new HashSet<>();
	        int sum = 0;
	        while(true){
	            if(!s.add(n)){
	                break;
	            }
	            sum = 0;
	            while(n > 0){
	                int rem = n % 10;
	                sum += rem * rem;
	                n /= 10;    
	            }
	            if(sum == 1){
	                return true;
	            }
	            n = sum;
	        }
	        return false;
	    }

}
