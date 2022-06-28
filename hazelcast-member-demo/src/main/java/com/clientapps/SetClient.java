package com.clientapps;

import com.hazelcast.collection.ISet;
import com.hazelcast.core.HazelcastInstance;
import com.members.HazelcastClientProvider;

public class SetClient {
	static HazelcastInstance client =HazelcastClientProvider.getClient();
	
    public static void setReader() {
    	ISet<String> set=client.getSet("technologies");
    	System.out.println("------------------------------------------------------------------------");
    	System.out.println(set);
    	for(String x:set)
    		System.out.println(x);
        System.out.println("------------------------------------------------------------------------");
    }
    
    public static void main(String[] args) {
		setReader();
	}
}
