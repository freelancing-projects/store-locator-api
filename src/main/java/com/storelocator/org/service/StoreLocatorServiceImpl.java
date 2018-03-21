package com.storelocator.org.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class StoreLocatorServiceImpl implements StoreLocatorService {

	@Autowired
	ResourceLoader resourceLoader;

	@Override
	public JSONObject getStorsJson() throws IOException, JSONException {
		Resource resource = resourceLoader.getResource("classpath:stores.json");
		String json = new BufferedReader(new InputStreamReader(resource.getInputStream())).readLine();
		JSONObject jsonObject = new JSONObject(json);
		return jsonObject;
	}

}
