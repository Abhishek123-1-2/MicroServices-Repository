package com.mindcraft.AccountServiceDemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class MyAccountController {
@GetMapping(path="/balance",produces=MediaType.APPLICATION_JSON_VALUE)
public Map<String,Double> fetchBalance(){
	//fake balance from random account
	//{balance:35000}
	Map<String,Double> map = new HashMap<>();
	map.put("balance", Double.valueOf(Math.random()*12345));
	return map;
	
}

}
