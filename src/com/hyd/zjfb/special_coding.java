package com.hyd.zjfb;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.io.*;

public class special_coding extends Activity
{
	private Button a,b;
	private TextView c;
	private String d;
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_coding);
		a=(Button) findViewById(R.id.helpButton1);	
		a.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(special_coding.this,setting.class);
					startActivity(pp1);				
					finish();
				}
			});
			b=(Button) findViewById(R.id.returnButton1);
			c=(TextView) findViewById(R.id.returnEditText1);
		b.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{	
					d=c.getText().toString();	
					if(d.equals("652akd18s2"))
			{
				File fp=new File("/mnt/sdcard/zjfb_present_2.txt");
				if(fp.isFile() && fp.exists()){ //判断文件是否存在
					Toast.makeText(special_coding.this,"您已使用过该激活码！",Toast.LENGTH_SHORT).show();
					
				}
				else{
					final AlertDialog Dialog;
					Dialog = new AlertDialog.Builder(special_coding.this).create();
					Dialog.show();
					Dialog.getWindow().setContentView(R.layout.dialog3);
					Dialog.getWindow().findViewById(R.id.dialogupButton1)
						.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View v) {
								Dialog.dismiss();
							}
						});
					try
					{
						FileWriter fo=new FileWriter("/mnt/sdcard/zjfb_present_2.txt");
					}
					catch (IOException e)
					{}		
			}}
			
					else if(d.equals("p64hsbsi43"))
					{
						File fp=new File("/mnt/sdcard/zjfb_present_3.txt");
						if(fp.isFile() && fp.exists()){ //判断文件是否存在
							Toast.makeText(special_coding.this,"您已使用过该激活码！",Toast.LENGTH_SHORT).show();

						}
						else{
							final AlertDialog Dialog;
							Dialog = new AlertDialog.Builder(special_coding.this).create();
							Dialog.show();
							Dialog.getWindow().setContentView(R.layout.dialog4);
							Dialog.getWindow().findViewById(R.id.dialogupButton1)
								.setOnClickListener(new View.OnClickListener() {
									@Override
									public void onClick(View v) {
										Dialog.dismiss();
									}
								});
							try
							{
								FileWriter fo=new FileWriter("/mnt/sdcard/zjfb_present_3.txt");
							}
							catch (IOException e)
							{}		
						}}
					//**************	
					else if(d.equals("ak430wqoz5"))
					{
						File fp=new File("/mnt/sdcard/zjfb_a_spe1.txt");
						if(fp.isFile() && fp.exists()){ //判断文件是否存在
							Toast.makeText(special_coding.this,"您已使用过该激活码！",Toast.LENGTH_SHORT).show();

						}
						else{
							final AlertDialog Dialog;
							Dialog = new AlertDialog.Builder(special_coding.this).create();
							Dialog.show();
							Dialog.getWindow().setContentView(R.layout.dialogsp);
							Dialog.getWindow().findViewById(R.id.dialogupButton1)
								.setOnClickListener(new View.OnClickListener() {
									@Override
									public void onClick(View v) {
										Dialog.dismiss();
									}
								});	
							try
							{
								File fr=new File("/mnt/sdcard/zjfb_level.txt");

								if(fr.isFile() && fr.exists()){ //判断文件是否存在
									InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
									BufferedReader bufferedReader = new BufferedReader(read);
									 int level_code =Integer.parseInt( bufferedReader.readLine());
									read.close();
									level_code=level_code+100;
									try
									{
										FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_level.txt");
									}
									catch (IOException e)
									{}		  	
									BufferedWriter fw = null;
									try {
										File ft=new File("/mnt/sdcard/zjfb_level.txt");
										fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ft, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
										fw.append(level_code+"");
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
								}
							}catch (Exception e)
							{}
							try
							{
								FileWriter fo=new FileWriter("/mnt/sdcard/zjfb_a_spe1.txt");
							}
							catch (IOException e)
							{}		
						}}
					else if(d.equals("6ap4kjwh00"))
					{
						File fp=new File("/mnt/sdcard/zjfb_a_spe2.txt");
						if(fp.isFile() && fp.exists()){ //判断文件是否存在
							Toast.makeText(special_coding.this,"您已使用过该激活码！",Toast.LENGTH_SHORT).show();

						}
						else{
							final AlertDialog Dialog;
							Dialog = new AlertDialog.Builder(special_coding.this).create();
							Dialog.show();
							Dialog.getWindow().setContentView(R.layout.dialogsp);
							Dialog.getWindow().findViewById(R.id.dialogupButton1)
								.setOnClickListener(new View.OnClickListener() {
									@Override
									public void onClick(View v) {
										Dialog.dismiss();
									}
								});	
							try
							{
								File fr=new File("/mnt/sdcard/zjfb_level.txt");

								if(fr.isFile() && fr.exists()){ //判断文件是否存在
									InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
									BufferedReader bufferedReader = new BufferedReader(read);
									int level_code =Integer.parseInt( bufferedReader.readLine());
									read.close();
									level_code=level_code+100;
									try
									{
										FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_level.txt");
									}
									catch (IOException e)
									{}		  	
									BufferedWriter fw = null;
									try {
										File ft=new File("/mnt/sdcard/zjfb_level.txt");
										fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ft, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
										fw.append(level_code+"");
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
								}
							}catch (Exception e)
							{}
							try
							{
								FileWriter fo=new FileWriter("/mnt/sdcard/zjfb_a_spe2.txt");
							}
							catch (IOException e)
							{}		
						}}
					else if(d.equals("kajj48y343"))
					{
						File fp=new File("/mnt/sdcard/zjfb_a_spe3.txt");
						if(fp.isFile() && fp.exists()){ //判断文件是否存在
							Toast.makeText(special_coding.this,"您已使用过该激活码！",Toast.LENGTH_SHORT).show();

						}
						else{
							final AlertDialog Dialog;
							Dialog = new AlertDialog.Builder(special_coding.this).create();
							Dialog.show();
							Dialog.getWindow().setContentView(R.layout.dialogsp);
							Dialog.getWindow().findViewById(R.id.dialogupButton1)
								.setOnClickListener(new View.OnClickListener() {
									@Override
									public void onClick(View v) {
										Dialog.dismiss();
									}
								});
							try
							{
								File fr=new File("/mnt/sdcard/zjfb_level.txt");

								if(fr.isFile() && fr.exists()){ //判断文件是否存在
									InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
									BufferedReader bufferedReader = new BufferedReader(read);
									int level_code =Integer.parseInt( bufferedReader.readLine());
									read.close();
									level_code=level_code+100;
									try
									{
										FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_level.txt");
									}
									catch (IOException e)
									{}		  	
									BufferedWriter fw = null;
									try {
										File ft=new File("/mnt/sdcard/zjfb_level.txt");
										fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ft, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
										fw.append(level_code+"");
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
								}
							}catch (Exception e)
							{}
							try
							{
								FileWriter fo=new FileWriter("/mnt/sdcard/zjfb_a_spe3.txt");
							}
							catch (IOException e)
							{}		
						}}	
			else 
			{
				Toast.makeText(special_coding.this,"不存在该激活码！",Toast.LENGTH_SHORT).show();
			}
					}
					});
	}
	}

