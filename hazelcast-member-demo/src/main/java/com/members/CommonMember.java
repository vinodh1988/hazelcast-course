package com.members;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class CommonMember {
   private static HazelcastInstance instance;
   
   static {
	   instance=Hazelcast.newHazelcastInstance();
   }
   
   public static HazelcastInstance getInstance() {
	   return instance;
   }
}
