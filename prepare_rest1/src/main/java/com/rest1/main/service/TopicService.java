package com.rest1.main.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rest1.bean.Topics;import com.rest1.main.controller.OwnerProperties;

@Service
public class TopicService {
	
	@Autowired
	private OwnerProperties owner;
	
	List<Topics> topics= new ArrayList<Topics>( Arrays.asList(new Topics("1","topic1","topic1 description"),
			new Topics("2","topic2","topic2 description")));
	
	
	public List<Topics> getTopics() {
		//return "topics";
		return topics;
	}

	public Topics getTopic(String id) {
		//return "topics";
		//return topics.stream().filter(t->t.getId().equals(id) ).findFirst().get();
		return topics.get(1);
	}

	public void addTopic(Topics topic) {
		
		
		topic.setName(owner.getFirstName());
		topics.add(topic);
		//return getTopic(topic.getId());
	}

	public void updateTopic(Topics topic, String id) {
		// TODO Auto-generated method stub
		//topics.stream().filter(t->t.getId().equals(id) ).findFirst().get();
		for(int i=0;i<topics.size();i++) {
			Topics t= topics.get(i);
			if(t.getId().equals(id))
				topics.set(i,topic);
		}

		return ;
	}

	public void deleteTopic(Topics topic, String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++) {
			Topics t= topics.get(i);
			if(t.getId().equals(id))
				topics.remove(i);
			}

	}
	

}
