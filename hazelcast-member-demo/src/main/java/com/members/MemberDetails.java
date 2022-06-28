package com.members;

import java.util.Set;

import com.hazelcast.cluster.Cluster;
import com.hazelcast.cluster.Member;
import com.hazelcast.core.HazelcastInstance;

public class MemberDetails {
	public static void main(String[] args) {
		HazelcastInstance instance = CommonMember.getInstance();
	    getMemberDetails(instance);	
	}
	
	public static void getMemberDetails(HazelcastInstance instance) {
	System.out.println("Name of the instance:"+instance.getName());
	Cluster c=instance.getCluster();
	System.out.println("Cluster State:: "+c.getClusterState().name());
	Set<Member> members=c.getMembers();
	for(Member x:members) {
		System.out.println("Address::"+x.getAddress());
		System.out.println("Attributes::"+x.getAttributes());
		System.out.println("----------------------------------");
	}
	}
}
