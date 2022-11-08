package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(10,20,20,10,10,30,50,10,20));
		Collections.sort(ar);
		int[] a = new int[101];
		
		for (int i = 0; i < ar.size(); i++) {
			a[ar.get(i)]++;
		}
		int result=0;
		for (int j = 0; j < a.length; j++) {
			result += a[j]/2;			
		}
		System.out.println(result + " cift corap vardir");

	}

}
