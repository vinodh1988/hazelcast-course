package com.clientapps;

import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.multimap.MultiMap;
import com.members.HazelcastClientProvider;

public class MultiMapAPP {
	static HazelcastInstance client =HazelcastClientProvider.getClient();
	static MultiMap<String,String> mm =	client.getMultiMap("teams");
	public static void addTeamMembers(String teamname,String value){
	 
	  mm.put(teamname, value);
	}
	
	public static void printRecords() {
	  Set<String> set= mm.keySet();
	  for(String x:set) {
		  System.out.println("################### "+x+ " ##################");
		  Collection<String> collection=mm.get(x); 
		  for(String a:collection)
			  System.out.println(a);
		  
	  }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		String[] teams= {"Devops","Coding","Testing"};
		System.out.println("Which team you want add Data"
				+ " \n 1. Devops \n 2. Coding \n 3. Testing "
				+ "\n 4. Read All information \n enter (1/2/3/4)::");
		Integer choice = Integer.parseInt(sc.next());
	    if(choice==1 || choice==2 || choice==3) {
	        System.out.println("Enter a team member::");
	    	addTeamMembers(teams[choice-1],sc.next() );
	    }
	    else if(choice==4)
	    	printRecords();
	    else
	    	System.out.println("Invalid Choice");
	    }
	}
}
