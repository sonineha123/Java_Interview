package com.custom.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class NoSuchElement {

	public static void main(String[] args) {
		
        List<String>list=new ArrayList<String>();
		 list.add("Element 1");
		 list.add("Element 2");
		 
         Iterator<String>iterator = list.iterator();
		 
		 while(iterator.hasNext()) {
		 
		 String element= iterator.next();
		 System.out.println("Element:"+ element);
	}

	     try {
	    	 
	    	 String element= iterator.next();
	    	 System.out.println(element);
	     }
	     catch(NoSuchElementException e) {
	    	 System.out.println(e);
	     }
	     
	}
}