package com.example.demo.spike;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
	
	String result = 
		"{\"id\":1,\"iname\":\"ball\",\"price\":10.99,\"quantity\":5}";
	@Test
	public void JsonAssert() throws JSONException {
		String expected="{\"id\":1,\"iname\":\"ball\"}";
		JSONAssert.assertEquals(expected, result, true);
	}

}
