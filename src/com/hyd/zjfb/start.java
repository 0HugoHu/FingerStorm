package com.hyd.zjfb;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.io.*;

public class start extends Activity
{
	private Button a,b,a0,help;
	private TextView c,d,e,f;
	private boolean s1=false,s2=false;
    private String lineTxt,lineTxt2;
	private int lineTxt_,lineTxt2_;
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
	/*	a=(Button) findViewById(R.id.startButton1);
		a=(Button) findViewById(R.id.startButton2);
		*/ 
		a=(Button) findViewById(R.id.startButton1);
		help=(Button) findViewById(R.id.startButtonhelp);
		b=(Button) findViewById(R.id.startButton2);
		c=(TextView) findViewById(R.id.startTextView1);
		d=(TextView) findViewById(R.id.startTextView2);
		a0=(Button) findViewById(R.id.startButton0);
		e=(TextView) findViewById(R.id.startTextView3);
		f=(TextView) findViewById(R.id.startTextView4);
		
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_BestRecord.txt");
			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				lineTxt = bufferedReader.readLine();
				read.close();
				 lineTxt_=Integer.parseInt(lineTxt);	
				 s1=true;
			}
		}
		catch (Exception e)
		{}
		
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_BestRecord2.txt");
			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				lineTxt2 = bufferedReader.readLine();
				read.close();
				lineTxt2_=Integer.parseInt(lineTxt2);	
				s2=true;
			}
			else{
				lineTxt2_=0;
			}
		}
		catch (Exception e)
		{}
		
		
		if(lineTxt_==0)
		{}
		else
		{
			c.setVisibility(View.VISIBLE);
			d.setVisibility(View.VISIBLE);
			
			c.setText(lineTxt_+" ");
			
			if(lineTxt_<6000)
			{
				d.setText("☆☆☆☆☆");
				
			}
			if(lineTxt_>=6000&&lineTxt_<7000)
			{
				d.setText("★☆☆☆☆");
				
			}
			if(lineTxt_>=7000&&lineTxt_<9500)
			{
				d.setText("★★☆☆☆");
			
			}
			if(lineTxt_>=9500&&lineTxt_<11000)
			{
				d.setText("★★★☆☆");
				
			}
			if(lineTxt_>=11000&&lineTxt_<13000)
			{
				d.setText("★★★★☆");
				
			}
			if(lineTxt_>=13000&&lineTxt_<14500)
			{
				d.setText("★★★★★");
			
			}
			
			
		}
		
		a.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(s1==false){
					final AlertDialog Dialog = new AlertDialog.Builder(start.this).create();
					Dialog.show();
					Dialog.getWindow().setContentView(R.layout.dialog_help1);
					Dialog.getWindow().findViewById(R.id.dialoghelp1Button1)
						.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View v) {
								try
								{
									FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_whiteblocks.txt");
								}
								catch (IOException e)
								{}		 
								BufferedWriter fw = null;
								try {
									File ft=new File("/mnt/sdcard/zjfb_whiteblocks.txt");
									fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ft, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
									fw.append("0");
									fw.newLine();
									fw.flush(); 
								} catch (Exception e) {
									e.printStackTrace();
								} finally {
									if (fw != null) {
										try {
											fw.close();
										} catch (IOException e) {
											e.printStackTrace();
										}
									}
								}		
								Intent pp1=new Intent();
								pp1.setClass(start.this,section_1.class);
								startActivity(pp1);				
								finish();
								Dialog.dismiss();
							}
						});
					}
					else{
						Intent pp1=new Intent();
						pp1.setClass(start.this,section_1.class);
						startActivity(pp1);				
						finish();
					}
				}
			});
		
		a0.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(start.this,MainActivity.class);
					startActivity(pp1);				
					finish();
				}
			});
		if(lineTxt_>=9500){
			b.setBackgroundResource(R.drawable.section2);
		
			if(lineTxt2_==0)
			{}
			else
			{
				e.setVisibility(View.VISIBLE);
				f.setVisibility(View.VISIBLE);

				e.setText(lineTxt2_+" ");

				if(lineTxt2_<7000)
				{
					f.setText("☆☆☆☆☆");

				}
				if(lineTxt2_>=7000&&lineTxt2_<11000)
				{
					f.setText("★☆☆☆☆");

				}
				if(lineTxt2_>=11000&&lineTxt2_<14000)
				{
					f.setText("★★☆☆☆");

				}
				if(lineTxt2_>=14000&&lineTxt2_<17000)
				{
					f.setText("★★★☆☆");

				}
				if(lineTxt2_>=17000&&lineTxt2_<20000)
				{
					f.setText("★★★★☆");

				}
				if(lineTxt2_>=20000&&lineTxt2_<30000)
				{
					f.setText("★★★★★");

				}


			}
			
			
			
		b.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(s2==false){
						final AlertDialog Dialog = new AlertDialog.Builder(start.this).create();
						Dialog.show();
						Dialog.getWindow().setContentView(R.layout.dialog_help2);
						Dialog.getWindow().findViewById(R.id.dialoghelp2Button1)
							.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									try
									{
										FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_redstar.txt");
									}
									catch (IOException e)
									{}	
									BufferedWriter fw = null;
									try {
										File ft=new File("/mnt/sdcard/zjfb_redstar.txt");
										fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ft, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
										fw.append("0");
										fw.newLine();
										fw.flush(); 
									} catch (Exception e) {
										e.printStackTrace();
									} finally {
										if (fw != null) {
											try {
												fw.close();
											} catch (IOException e) {
												e.printStackTrace();
											}
										}	
										}
									try
									{
										FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_yellowstar.txt");
									}
									catch (IOException e)
									{}	
									BufferedWriter fi = null;
									try {
										File ft=new File("/mnt/sdcard/zjfb_yellowstar.txt");
										fi = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ft, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
										fi.append("0");
										fi.newLine();
										fi.flush(); 
									} catch (Exception e) {
										e.printStackTrace();
									} finally {
										if (fi != null) {
											try {
												fi.close();
											} catch (IOException e) {
												e.printStackTrace();
											}
										}
										}
									Intent pp1=new Intent();
									pp1.setClass(start.this,section_2.class);
									startActivity(pp1);				
									finish();
									Dialog.dismiss();
								}
							});
					}
					else{
						Intent pp1=new Intent();
						pp1.setClass(start.this,section_2.class);
						startActivity(pp1);				
						finish();
					}
				}
			});
		}
		help.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(start.this,help.class);
					startActivity(pp1);				
					finish();
				}
			});
}
}
