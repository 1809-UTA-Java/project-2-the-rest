package com.revature.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SandvichController {

	private Map<String, Integer> parseString(String input) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : input.split("&")) {
			String[] s = temp.split("=");
			map.put(s[0], Integer.parseInt(s[1]));
		}
		return map;
	}
	
	@RequestMapping( value="process", method=RequestMethod.GET)
	public ResponseEntity<Map<String, Integer>> process(@RequestBody String payload) throws Exception {
		Map<String, Integer> map = parseString(payload);
		return ResponseEntity.ok(map);
	}
}
