package com.yuefenxiang.activity;

import java.io.StringWriter;
import java.util.StringTokenizer;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.insthub.yuefenxiang.model.BussinessResponse;
import com.yuefenxiang.R;

/**
 * ��¼ҳ��
 * @version 0.01
 * @author alan
 * @time 2015.4.20
 */
public class SigninActivity extends Activity implements OnClickListener,BussinessResponse {

	private ImageView back = null; //����
	private Button login = null;  //��¼
	
	private EditText userName = null; //�û���
	private EditText password = null;//����
	private TextView register = null; //ע��
	
	private String name;
	private String pwd ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signin);
	}

	@Override
	public void OnMessageResponse(String url, JSONObject jo, Object status)
			throws JSONException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {
		
	}
	
	/**
	 * �ر������
	 */
	public void closeKeyBoard()
	{
		userName.clearFocus();
		InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(userName.getWindowToken(), 0);
	}

}
