package com.solution.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.topic.ITopic;

@Service
public class TopicService implements InitializingBean {
     public List<String> messages=new ArrayList<String>();
     
     @Autowired
     ITopic<String> topic;

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		topic.addMessageListener((message)->{
			messages.add(message.getMessageObject());
		});
	}
     
	public List<String> getMessages(){
		return messages;
	}
     
}
