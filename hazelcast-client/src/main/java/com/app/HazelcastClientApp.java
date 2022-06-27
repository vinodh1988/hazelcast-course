package com.app;

import java.util.Scanner;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelcastClientApp {
   public static void main(String[] args) {
	  HazelcastInstance client=HazelcastClient.newHazelcastClient();
	  IMap<Integer,String> map= client.getMap("people");
	  
	  Scanner sc=new Scanner(System.in);
	  while(true) {
		  System.out.println("What do you want to do 1. add data 2. read Data (add/read):: ");
		  String choice = sc.next();
		  switch(choice) {
		  case "add":
			   System.out.println("Enter key number::");
			   Integer x=Integer.parseInt(sc.next());
			   System.out.println("Enter Value:: ");
			   String value=sc.next();
			   map.put(x, value);	
			   break;
		  case "read":
			   System.out.println("Enter key number::");
			   Integer key=Integer.parseInt(sc.next());
		  	   System.out.println("The Value is :: "+map.get(key));
		  	   break;
		  	   
		  case "exit":
			   System.exit(0);
		  default: 
			   System.out.println("Invalid option");
			   break;
		  }
	  }
	  
   }
}
