package com.Microservices.Main;

import java.util.ArrayList;
import java.util.List;

public class MyTestClass {
	
	public int[] solution(int N) {
		if(N == 0) {
			int[] temp = {0};
			return temp;
		}
		int[] result = new int[N];
		for(int i = 0;i < N;i++) {
			result[i] = i*2 -N +1;
		}
		return result;
	}
	public List<Integer> solution2(int N) {
		List<Integer> result = new ArrayList<>(N);
		for(int i =0;i < N;i++) {
			result.add(i*2 - N +1);
		}
		return result;
	}
	
	public String solution1(String S,int K) {
		final List<String> result = new ArrayList<>(7);
		result.add("Mon");
		result.add("Tue");
		result.add("Wed");
		result.add("Thu");
		result.add("Fri");
		result.add("Sat");
		result.add("Sun");
		
		int currentIndex = result.indexOf(S);
		int counter = 0;
		String finalDay = "";
		while(counter < K) {
			if(currentIndex+1 > 6) {
				currentIndex = 0;
			} else {
				currentIndex +=1;
			}
			counter++;
		}
		finalDay = result.get(currentIndex);
		return finalDay;
	}

	public static void main(String[] args) {
		MyTestClass obj = new MyTestClass();
//		System.out.println(obj.solution1("Wed",0));
		
//		int [] result = obj.solution(100);
//		for(int num: result) {
//			System.out.println(num);
//		}
		System.out.println(obj.solution2(10));
	}

}
