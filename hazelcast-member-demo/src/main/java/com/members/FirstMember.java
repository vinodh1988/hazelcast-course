package com.members;

import java.util.Set;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class FirstMember {
	private static HazelcastInstance instance;
	   
	   static {
		   instance=Hazelcast.newHazelcastInstance();
	   }
	   
	public static void main(String[] args) {
		Set<String> set=instance.getSet("technologies");
		set.add("Java");
		set.add("C++");
		set.add("SQL");
		set.add("Python");
		set.add("Node JS");
	}
}
