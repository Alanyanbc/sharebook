package com.yuefenxiang.activity;

import java.util.ArrayList;
import java.util.Map;

import com.yuefenxiang.R;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * register up model
 * @author alan
 *@time 2015.5.24 
 */
public class SiginUpActivity extends Activity implements OnClickListener  {

	private ImageView back;
	private Button register;
	
	private EditText userName;
	private EditText email;
	private EditText password;
	private EditText passwordRepeat;
	
	private String mUserName;
	private String mEmail;
	private String mPassword;
	private String mPasswordRepeat;
	
	private LinearLayout body;
	  
	private Object mRegisterModel;
	private ArrayList<String> itms = new ArrayList<String>();
	
	public static Map<Integer,EditText> edit;
	private ArrayList<Object> fields = new ArrayList<Object>();
	private boolean flag = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
		
		Resources res = getBaseContext().getResources();
		
		back = (ImageView) findViewById(R.id.register_back);
		register =(Button) findViewById(R.id.register_register);
		userName = (EditText) findViewById(R.id.register_name);
		email = (EditText) findViewById(R.id.register_email);
		password = (EditText) findViewById(R.id.register_password1);
		passwordRepeat = (EditText) findViewById(R.id.register_password2);
		
		body = (LinearLayout) findViewById(R.id.register_body);
		
		back.setOnClickListener(this);
		register.setOnClickListener(this);
		
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	
}
