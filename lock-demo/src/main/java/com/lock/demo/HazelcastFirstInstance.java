package com.lock.demo;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.cp.IAtomicLong;
import com.hazelcast.cp.lock.FencedLock;

public class HazelcastFirstInstance {
    public static void main(String n[]) {
    	HazelcastInstance instance=Hazelcast.newHazelcastInstance();
        FencedLock mylock=instance.getCPSubsystem().getLock("mylock");
        IAtomicLong count=instance.getCPSubsystem().getAtomicLong("mycounter");
        while(true){
        mylock.lock();
        
        System.out.println("Acquired the mylock -> Lock");
        
        try {
        	Thread.sleep(10000);
        	long result=count.incrementAndGet();
        	System.out.println("Current Value is-->"+result);
        	
        }
        catch(InterruptedException e) {
        	e.printStackTrace();
        }
        finally {
        	mylock.unlock();
        	System.out.println("Released the lock");
        	try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
       }
   }
}
