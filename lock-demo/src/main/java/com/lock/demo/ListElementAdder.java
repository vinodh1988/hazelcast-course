package com.lock.demo;

import java.util.Scanner;

import com.hazelcast.collection.IList;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class ListElementAdder {
    public static void main(String[] args) {
		HazelcastInstance instance=Hazelcast.newHazelcastInstance();
		Scanner sc=new Scanner(System.in);
		IList<String> people=instance.getList("people");
		do {
			System.out.println("Enter a name->");
			String name=sc.next();
			people.add(name);
			System.out.println("Enter yes to continue anything else to exit");
		    
		}while(sc.next().equals("yes"));
	}
}
