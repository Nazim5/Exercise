package ie.cct.objectorientedconstructs.s2018370s2018092;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import ie.cct.objectorientedconstructs.FeedFactoryInterface;
import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

public abstract class Feed implements FeedInterface {
	
	public static class MyClass {
		  public static void main(String[] args) {
		    ArrayList<String> item = new ArrayList<String>();
		    item.add("BREAKING NEWS");
		    item.add("Here are some breaking new!");
		    item.add("NOT Quite some breaking news");
		    item.add("Here are some breaking news");
		    item.add("EVEN LESS IMPORTANT NEWS");
		    item.add("Here are some even less important news");
		    
		    Collections.sort(item);  // Sort items
		    for (String i : item) 
		      System.out.println(i);  
		  
		  }
		 

	
	public Collection<String> listTitles() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public FeedItem getItem(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int numItems() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Collection<FeedItem> findItems(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	}
}


	

