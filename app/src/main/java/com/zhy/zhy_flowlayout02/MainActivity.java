package com.zhy.zhy_flowlayout02;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity
{

	private FlowLayout mFlowLayout;
	String[] mvals ={"1123","123","123","11223","123","121233",
			"123","123","1231111","123","123","123",
			"123","12232333","11123","123","112323","123",};
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto);
		mFlowLayout = (FlowLayout) findViewById(R.id.fl);
		initData();
	}
	public void initData(){
//		for(int i=0;i<mvals.length;i++){
//			Button button = new Button(this);
//			ViewGroup.MarginLayoutParams mp=
//					new ViewGroup.MarginLayoutParams(
//							ViewGroup.LayoutParams.WRAP_CONTENT,
//							ViewGroup.LayoutParams.WRAP_CONTENT);
//			button.setText(mvals[i]);
//			button.setLayoutParams(mp);
//			mFlowLayout.addView(button);
//		}

		LayoutInflater layoutInflater = LayoutInflater.from(this);
		for (int i=0;i<mvals.length;i++){
			TextView tv = (TextView) layoutInflater.inflate(R.layout.tv,mFlowLayout,false);
			tv.setText(mvals[i]);
			mFlowLayout.addView(tv);
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
