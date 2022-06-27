package com.app;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastServer {
    public static void main(String n[]) {
    	HazelcastInstance instance=Hazelcast.newHazelcastInstance();
    }
}
