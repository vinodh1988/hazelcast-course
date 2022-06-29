package com.lock.demo;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.collection.IList;
import com.hazelcast.collection.ItemEvent;
import com.hazelcast.collection.ItemListener;
import com.hazelcast.core.HazelcastInstance;

public class ListEvenListener {
	public static void main(String[] args) {
		HazelcastInstance client=HazelcastClient.newHazelcastClient();
		IList<String> people=client.getList("people");
		people.addItemListener(new ListEventListener(), true);
		
	}
   
}


class ListEventListener<String> implements ItemListener<String>{

	public void itemAdded(ItemEvent<String> item) {
		// TODO Auto-generated method stub
		System.out.println(item.getItem()+" is processed ######");
	}

	public void itemRemoved(ItemEvent<String> item) {
		// TODO Auto-generated method stub
		
	}
	
}