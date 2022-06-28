package com.clientapps;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.replicatedmap.ReplicatedMap;
import com.members.HazelcastClientProvider;

public class ReplicatedMapDemo {
	static HazelcastInstance client =HazelcastClientProvider.getClient();
	
	public static void main(String n[]) {
	 ReplicatedMap<Integer,String> map=client.getReplicatedMap("replicamap");
     map.put(1, "George");
     map.put(2, "Arjun");
     map.put(3, "Naveen");
     map.put(4, "Rakesh");
     map.put(5, "Ramu");
     map.put(6, "Rahul");
     map.put(7, "Rakshak");
	}
}
