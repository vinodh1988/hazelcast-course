package com.members;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastClientProvider {
 private static HazelcastInstance client;
 
 static {
   client =	 HazelcastClient.newHazelcastClient();
 }
 
 public static HazelcastInstance getClient() {
	 return client;
 }
}
