package com.java.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class List {
	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;
	public static void main(String[] args) {
		int count = 0;
		   for (int i = START; i <= END; i++)
		     count++; 
		   System.out.println(count);
	}
	
	
	

}
