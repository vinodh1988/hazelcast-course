package com.lock.demo;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.cp.IAtomicLong;
import com.hazelcast.cp.lock.FencedLock;

public class HazelcastSecondInstance {
  public static void main(String[] args) throws Exception {
	HazelcastInstance instance =HazelcastClient.newHazelcastClient();
	 FencedLock mylock=instance.getCPSubsystem().getLock("mylock");
     IAtomicLong count=instance.getCPSubsystem().getAtomicLong("mycounter");
    while(true) {
     while(true) {
    	 if(mylock.isLocked())
    	    System.out.println("Waiting...!!!");
    	 else
    		 break;
    	 Thread.sleep(1000);
     }
     mylock.lock();
     System.out.println("Client acquired lock");
     System.out.println("Current value of the counter"+count.incrementAndGet());
     mylock.unlock();
     System.out.println("Client released the sleep and going to sleep 5 seconds");
     Thread.sleep(5000);
   }
  }
}
