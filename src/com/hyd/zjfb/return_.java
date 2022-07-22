package com.hyd.zjfb;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.io.*;

public class return_ extends Activity
{
	private Button a,b;
	private TextView c;
	private String d,e,f,g,h;
	private int level_code;
	private String i,j,k,l;
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.return_);
		a=(Button) findViewById(R.id.helpButton1);
		a.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(return_.this,setting.class);
					startActivity(pp1);				
					finish();
				}
			});
    b=(Button) findViewById(R.id.returnButton1);
	c=(TextView) findViewById(R.id.returnEditText1);
	
		DisplayMetrics metric = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metric);
        int width = metric.widthPixels;     // 屏幕宽度（像素）
        int height = metric.heightPixels;
		float density = metric.density;      // 屏幕密度（0.75 / 1.0 / 1.5）
        int densityDpi = metric.densityDpi;  // 屏幕密度DPI（120 / 160 / 240）
		i=width+"";
	    j=height+"";
		k=density+"";
		l=densityDpi+"";
		d=android.os.Build.VERSION.SDK;
		e=android.os.Build.MODEL;
		f=android.os.Build.VERSION.RELEASE;
		
		
	
		b.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{	
					h=c.getText().toString();
					g=h+"\n\nSDK:"+d+"\nPhone Brand:"+e+"\nAndroid Version:"+f
						+"\nWidth:"+i+"\nHeight:"+j+"\n"+"Density:"+k+";"+l;
		if(h.length()>=6)	
		{
			File fu=new File("/mnt/sdcard/zjfb_return_.txt");
			if(fu.isFile() && fu.exists()){ }
			else{
				AlertDialog Dialog;
			Dialog = new AlertDialog.Builder(return_.this).create();
			Dialog.show();
			Dialog.getWindow().setContentView(R.layout.dialog00);
			try
			{
				FileWriter fj=new FileWriter("/mnt/sdcard/zjfb_return_.txt");
				File fr=new File("/mnt/sdcard/zjfb_level.txt");

				if(fr.isFile() && fr.exists()){ //判断文件是否存在
					InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
					BufferedReader bufferedReader = new BufferedReader(read);
					level_code =Integer.parseInt( bufferedReader.readLine());
					read.close();
					level_code=level_code+20;
					try
					{
						FileWriter fi=new FileWriter("/mnt/sdcard/zjfb_level.txt");
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
			}
		Intent data=new Intent(Intent.ACTION_SENDTO);  
		data.setData(Uri.parse("mailto:huyd12345@qq.com"));  
		data.putExtra(Intent.EXTRA_SUBJECT, "♚意见反馈—指尖风暴");  
		data.putExtra(Intent.EXTRA_TEXT,g);  
		startActivity(data); 
		}
		else{
			Toast.makeText(return_.this,"请认真对待反馈信息！",Toast.LENGTH_SHORT).show();
		}
     }     
        });

		
		}
}
