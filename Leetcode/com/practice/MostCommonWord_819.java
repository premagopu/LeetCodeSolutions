package com.practice;

import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord_819 {

	public static void main(String[] args) {
		String[] banned = { "hit" };
		System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", banned));

	}
	// O(P+B) time complexity
	// O(P+B) space complexity

	public static String mostCommonWord(String paragraph, String[] banned) {
		HashSet<String> ban = new HashSet<>();
		int max = Integer.MIN_VALUE;
		String result = "";
		for (String s : banned) {
			ban.add(s);
		}
		HashMap<String, Integer> hm = new HashMap<>();
		String[] words = paragraph.split("\\W+");
		for (String w : words) {
			w = w.toLowerCase();
			if (!ban.contains(w)) {
				hm.put(w, hm.getOrDefault(w, 0) + 1);
				if (hm.get(w) > max) {
					max = hm.get(w);
					result = w;
				}
			}
		}
		return result;

	}
}
	/* Solution 2 : using Character 
	 public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> ban = new HashSet<>();
        for(String s : banned){
            ban.add(s);
        }
        paragraph += ".";
        HashMap<String, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        String result = "";
        StringBuilder word = new StringBuilder();
        for (char c: paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c));
            }else if(word.length() > 0){
                String w = word.toString();
                if(!ban.contains(w)){
            	hm.put(w, hm.getOrDefault(w, 0)+1);
                    if(hm.get(w) > max){
            		    max = hm.get(w);
            		    result = w;
            	    }                
                }
                word = new StringBuilder();
            }
            
        }
        return result;
        
    }
	 */

