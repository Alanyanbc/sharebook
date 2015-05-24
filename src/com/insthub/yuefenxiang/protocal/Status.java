package com.insthub.yuefenxiang.protocal;

import org.json.JSONException;
import org.json.JSONObject;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name ="STATUS")
public class STATUS {
	
	@Column(name = "succeed")
	public int succeed;
	
	@Column(name="error_code")
	public int err_code;
	
	@Column(name="error_desc")
	public String error_desc;
	
	/**
	 * get result status
	 * @param obj json status object
	 * @throws JSONException JSon exception
	 */
	public void formJson(JSONObject obj) throws JSONException{
		if( null == obj)
			return;
		
		//get status
		this.succeed = obj.optInt("succeed");
		this.err_code = obj.optInt("error_code");
		this.error_desc = obj.optString("error_desc");
		return;
		
	}
	
	/**
	 * get local status to JSON
	 * @return JSON OBJECT
	 * @throws JSONException something case error 
	 */
	public JSONObject toJson() throws JSONException{
		JSONObject localItemObj = new JSONObject();
		localItemObj.put("succeed", succeed);
		localItemObj.put("err_code", err_code);
		localItemObj.put("error_desc", error_desc);
		return localItemObj;
	}
	
}
