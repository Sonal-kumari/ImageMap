package com.springproject;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin

public class CallApi {
	
	@Autowired
	public JsonFile jf;
	
	@GetMapping("/display")
	public String display(@RequestParam String sname) throws IOException, ParseException
	{
		return jf.fetchData(sname);
	}
}

