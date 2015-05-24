package com.insthub.yuefenxiang.model;

import com.insthub.yuefenxiang.protocal.STATUS;

import android.content.Context;
import android.content.SharedPreferences;

public class LoginModel extends Object{
	private SharedPreferences shared;
	private SharedPreferences.Editor edit;
	public STATUS mStatus;
	
	public LoginModel( Context context){
		super(context);
		this.shared = context.getSharedPreferences("userInfo", 0);
		this.edit = shared.edit();
	}
	
	public void login(String name, String password){
		
	}

}
