package com.hyd.zjfb;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.hyd.zjfb.*;

public class about extends Activity
{
	private Button a;
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
		a=(Button) findViewById(R.id.helpButton1);
		a.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(about.this,setting.class);
					startActivity(pp1);				
					finish();
				}
			});
}
}
