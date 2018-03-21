package com.storelocator.org.service;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public interface StoreLocatorService {
	
	JSONObject getStorsJson() throws IOException, JSONException;
	
}
