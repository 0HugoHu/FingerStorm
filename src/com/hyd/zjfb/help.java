package com.hyd.zjfb;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.io.*;

public class help extends Activity
{
	private Button a,b,c,d;
		/** Called when the activity is first created. */
		@Override
		public void onCreate(Bundle savedInstanceState)
		{
			requestWindowFeature(Window.FEATURE_NO_TITLE);
			super.onCreate(savedInstanceState);
			setContentView(R.layout.help);
			a=(Button) findViewById(R.id.help0Button1);
			b=(Button) findViewById(R.id.helpButton1);
			c=(Button) findViewById(R.id.helpButton2);
			d=(Button) findViewById(R.id.helpButton3);
			a.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View p1)
					{
						Intent pp1=new Intent();
						pp1.setClass(help.this,start.class);
						startActivity(pp1);				
						finish();
					}
				});
				
			b.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View p1)
					{
						Intent pp1=new Intent();
						pp1.setClass(help.this,help_q.class);
						startActivity(pp1);				
						finish();
					}
				});
			c.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View p1)
					{
						Intent pp1=new Intent();
						pp1.setClass(help.this,help_1.class);
						startActivity(pp1);				
						finish();
					}
				});
			
			d.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View p1)
					{
						try
						{
							File fr=new File("/mnt/sdcard/zjfb_BestRecord2.txt");
							if(fr.isFile() && fr.exists()){ //判断文件是否存在
								Intent pp1=new Intent();
								pp1.setClass(help.this,help_2.class);
								startActivity(pp1);				
								finish();
							}
							else{
								final AlertDialog Dialog = new AlertDialog.Builder(help.this).create();
								Dialog.show();
								Dialog.getWindow().setContentView(R.layout.dialog_help);
								Dialog.getWindow().findViewById(R.id.dialogupButton1)
									.setOnClickListener(new View.OnClickListener() {
										@Override
										public void onClick(View v) {
											Dialog.dismiss();
										}
									});
							}
						}
						catch (Exception e)
						{}
						
					}
				});
}
}
