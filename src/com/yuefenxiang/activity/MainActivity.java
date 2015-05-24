package com.yuefenxiang.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

import com.yuefenxiang.R;

@SuppressWarnings("deprecation")
public class MainActivity extends Activity {

	TabHost tabHost = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signin);
		//tabHost = getTabHost();
		
	}

	

}
