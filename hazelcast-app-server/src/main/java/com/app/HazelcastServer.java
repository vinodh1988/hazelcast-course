package com.app;

import java.util.Map;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastServer {
    public static void main(String n[]) {
    	HazelcastInstance instance=Hazelcast.newHazelcastInstance();
    	Map<Integer,String> map=instance.getMap("people");
    	map.put(1, "Raju");
    	map.put(2, "Ravi");
    	map.put(3, "Harish");
    }
}
