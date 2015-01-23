package com.example.e_pd_v2_tw_demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.efun.platform.bean.EfunPlatformParamsBean;
import com.efun.platform.entrance.EfunPlatformFloatViewManager;
import com.efun.platform.utils.Const.LoginPlatform;

public class MainActivity extends Activity {
	private Button btn1,btn2,btn3,btn4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		btn3 = (Button) findViewById(R.id.button3);
		btn4 = (Button) findViewById(R.id.button4);
		
		//preferredUrl result:{"code":"1000","message":"登陸成功","sign":"1CAF38DFF397623E22FA51A343003D4C","timestamp":"1418891807016","userid":1}
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EfunPlatformParamsBean bean = new EfunPlatformParamsBean();
				bean.setUid("1");
				bean.setUname("tink");
				bean.setServerCode("999");
				bean.setRoleId("2147583846");
				bean.setLoginType(LoginPlatform.EFUN);
				bean.setSign("1CAF38DFF397623E22FA51A343003D4C");
				bean.setTimestamp("1418891807016");
				
				EfunPlatformFloatViewManager.getInstance().setGameCode("mmzb");
				EfunPlatformFloatViewManager.getInstance().efunCreateFloatView(MainActivity.this, bean);	
				
			}
		});
		//preferredUrl response: {"code":"1000","message":"登陸成功","sign":"BB1990486CD3C2557DCFC5DBCF8144D4","timestamp":"1418892078892","userid":1}
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EfunPlatformParamsBean bean = new EfunPlatformParamsBean();
				bean.setUid("1");
				bean.setUname("tink");
				bean.setServerCode("dddhant0");
				bean.setRoleId("779");
				bean.setLoginType(LoginPlatform.EFUN);
				bean.setSign("BB1990486CD3C2557DCFC5DBCF8144D4");
				bean.setTimestamp("1418892078892");
				
				EfunPlatformFloatViewManager.getInstance().setGameCode("bmhk");
				EfunPlatformFloatViewManager.getInstance().efunCreateFloatView(MainActivity.this, bean);	
				
			}
		});
		//preferredUrl response: {"code":"1000","message":"登陸成功","sign":"9641BF67750084ACD1BB4EC09451922B","timestamp":"1418892632281","userid":11763439}
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EfunPlatformParamsBean bean = new EfunPlatformParamsBean();
				bean.setUid("6784190");
				bean.setUname("2013375");
				bean.setServerCode("1");
				bean.setRoleId("1007864");
				bean.setLoginType(LoginPlatform.EFUN);
				bean.setSign("DAB8E28C0E2944D025F8C9675DB1EFC3");
				bean.setTimestamp("1418975251482");
				
				EfunPlatformFloatViewManager.getInstance().setGameCode("tkfy");
				EfunPlatformFloatViewManager.getInstance().efunCreateFloatView(MainActivity.this, bean);	
				
			}
		});
		btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				EfunPlatformFloatViewManager.getInstance().efunDestoryFloatView(MainActivity.this);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("efun", "MainActivity:onDestroy()");
		super.onDestroy();
		EfunPlatformFloatViewManager.getInstance().efunDestoryFloatView(this);
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		EfunPlatformFloatViewManager.getInstance().efunPauseAndStopFloatView(this);
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		EfunPlatformFloatViewManager.getInstance().efunResumeFloatView(this);
	}

}
