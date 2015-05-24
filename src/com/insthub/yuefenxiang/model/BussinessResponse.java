package com.insthub.yuefenxiang.model;

import org.json.JSONException;
import org.json.JSONObject;


public interface BussinessResponse {
	public abstract void OnMessageResponse(String url, JSONObject jo, Object status) throws JSONException;

}
