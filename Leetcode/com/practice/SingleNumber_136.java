package com.practice;

import java.util.HashMap;

public class SingleNumber_136 {
	
	public static void main(String[] args){
		int[] nums = {2,2,3,1,1};
		System.out.println(singleNumber(nums));

	}

	public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
        	if(hm.containsKey(nums[i])){
        		hm.remove(nums[i]);
        	}else{
        		hm.put(nums[i], i);
        	}
        }
        
        return (int) hm.keySet().iterator().next();
    }
}
