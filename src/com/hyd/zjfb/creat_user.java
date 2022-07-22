package com.hyd.zjfb;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.avos.avoscloud.*;
import com.hyd.zjfb.*;
import java.io.*;

public class creat_user extends Activity
{
	private Button a,b;
	private TextView c;
	private String d;
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creat_user);
		a=(Button) findViewById(R.id.helpButton1);	
		a.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(creat_user.this,setting.class);
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
					File fk=new File("/mnt/sdcard/zjfb_user.txt");
					if(fk.exists())
						fk.delete();	
					BufferedWriter fw = null;
					try {
						File ft=new File("/mnt/sdcard/zjfb_user.txt");
						fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ft, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
						fw.append(d+"");
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
				
					
					AVOSCloud.initialize(creat_user.this, "li8gesgfo0c3xky7br5ziclfsnh5mpxk5c6og2e7sr8kt9au", "uxdxh7ctrq5v9ahvbox1h3tm0ra66p4822fsexx6lm8358ns");
					AVObject loginObject = new AVObject("id_state");
					loginObject.put(d,"0");
					loginObject.saveInBackground();
					
				
				
				
				
					Intent pp1=new Intent();
					pp1.setClass(creat_user.this,start.class);
					startActivity(pp1);				
					finish();
					}
				});
				
				
				
				
				
}
}
					
