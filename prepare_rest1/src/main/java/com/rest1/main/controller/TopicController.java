package com.rest1.main.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest1.bean.Topics;
import com.rest1.main.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService tservice;
	@Autowired
	private OwnerProperties owner;

	
	@RequestMapping("/topics")
	public List<Topics> getTopics() {
		//return "topics";
		return tservice.getTopics();
	}
	
	@RequestMapping("/topics/{id}")
	
	public Topics getTopic(@PathVariable String id) {
		//return "topics";
		return tservice.getTopic(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	
	public void addTopic(@RequestBody Topics topic) {
		tservice.addTopic(topic);
		//return tservice.addTopic(topic);
	}

@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")	
	public void addTopic(@RequestBody Topics topic,@PathVariable String id) {
		tservice.updateTopic(topic,id);
		//return tservice.addTopic(topic);
	}

@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")	
public void deleteTopic(@RequestBody Topics topic,@PathVariable String id) {
	tservice.deleteTopic(topic,id);
	//return tservice.addTopic(topic);
}
@RequestMapping("/dynamic-configuration")
public Map dynamicConfiguration() {
    // Not the best practice to use a map to store differnt types!
    Map map = new HashMap();
    map.put("message", owner.getFirstName());
    
    map.put("key", owner.isValue());
    return map;
}

}







