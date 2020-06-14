package org.as.devtechsolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Lab {
	public static void main(String[] args) {
		Account a1= new Account(12, 6, "Frank");
		Account a2= new Account(7, 19, "David");
		Account a3= new Account(14, 4, "Kerin");
		
		ArrayList<Account> al= new ArrayList<>();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		Collections.sort(al);
		System.out.println("Most valuable account details: "+ al.get(al.size()-1));
		
		
				
	}

}
