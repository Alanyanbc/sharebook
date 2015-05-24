package com.insthub.yuefenxiang.protocal;

import org.json.JSONException;
import org.json.JSONObject;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name="UserSignInRequest")
public class UserSignInRequest extends Model {
	
	@Column(name="name")
	public String name;
	
	@Column(name="password")
	public String password;
	
	public void formJson(JSONObject obj)throws JSONException{
		if(null == obj)
			return;
		
		this.name = obj.optString("name");
		this.password = obj.optString("password");
		return;
	}
	
	public JSONObject toJson() throws JSONException{
		JSONObject localJsonObject = new JSONObject();
		localJsonObject.put("name", name);
		localJsonObject.put("password", password);
		return localJsonObject;
		
	}
	

}
