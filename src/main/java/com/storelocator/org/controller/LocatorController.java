package com.storelocator.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocatorController {

	@GetMapping("/getLocations/{zip}")
	public String getLocations(@PathVariable("zip") String zip) {
		return "hello";
	}
}
