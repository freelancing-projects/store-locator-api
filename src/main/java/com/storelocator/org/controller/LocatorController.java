package com.storelocator.org.controller;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.storelocator.org.service.StoreLocatorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/locations")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class LocatorController {

	@Autowired
	StoreLocatorService storeLocatorService;
	
	@ApiOperation(value = "Search a zip code")
	@RequestMapping(value = "/showLocation/{zipCode}", method= RequestMethod.GET)
	public String getLocations(@PathVariable("zip") String zip) {
		return "hello";
	}
	
	@ApiOperation(value = "getting stores json")
	@RequestMapping("/getStores")
	public String getStores() throws IOException, JSONException {
		return storeLocatorService.getStorsJson().toString();
	}
	
	
}
