package com.hyd.zjfb;

import android.app.*;
import android.content.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.avos.avoscloud.*;
import java.io.*;

public class section_2_result extends Activity
{
	private int score,score_,lineTxt_,gt;
	private Button e,f;
	private int level_code;
	private TextView b,c,d,g;
	private TextView a;
	private int whiteblocks=0,num,red,yellow;
	private String lineTxt,user;
	private File fd=new File("/mnt/sdcard/zjfb_present_0.txt");
	private File fs=new File("/mnt/sdcard/zjfb_present_1.txt");
	private File fp=new File("/mnt/sdcard/zjfb_present_2.txt");
	private File fo=new File("/mnt/sdcard/zjfb_present_3.txt");
	
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_2_result);
	//	AVOSCloud.initialize(this, "li8gesgfo0c3xky7br5ziclfsnh5mpxk5c6og2e7sr8kt9au", "uxdxh7ctrq5v9ahvbox1h3tm0ra66p4822fsexx6lm8358ns");
		Bundle bundle = this.getIntent().getExtras();
		score=bundle.getInt("result_s2");
		red=bundle.getInt("red");
		yellow=bundle.getInt("yellow");
		whiteblocks=bundle.getInt("whiteblocks");
		int extra= (int) (Math.random() * (98)) + 0;  
		score_=score+extra;
		e=(Button) findViewById(R.id.section1resultButton1);
		f=(Button) findViewById(R.id.section1resultButton2);
		a=(TextView) findViewById(R.id.section1resultTextView3);
		
		
		b=(TextView) findViewById(R.id.section1resultTextView5);
		c=(TextView) findViewById(R.id.section1resultTextView6);
		d=(TextView) findViewById(R.id.section1resultTextView7);
		g=(TextView) findViewById(R.id.section1resultTextView8);

		try
		{
			File fr=new File("/mnt/sdcard/zjfb_level.txt");

			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				level_code =Integer.parseInt( bufferedReader.readLine());
				read.close();
				}}catch (Exception e){}

	
		
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_BestRecord2.txt");

			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				lineTxt = bufferedReader.readLine();
				read.close();
			}		
				}
				catch (IOException e)
				{}		

		 lineTxt_=Integer.parseInt(lineTxt);

		if(score> lineTxt_)

		{
			d.setVisibility(View.VISIBLE);
			try
			{
				FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_BestRecord2.txt");
			}
			catch (IOException e)
			{}		  
			File file=new File("/mnt/sdcard/zjfb_BestRecord2.txt");
			if(file.isFile() && file.exists()){ 	
				BufferedWriter fw = null;
				try {
					fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
					fw.append(""+score);
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
		}
		
		
		
		
		try
		{

			if(fd.isFile() && fd.exists()){ //判断文件是否存在
				g.setVisibility(View.VISIBLE);
				g.setText("加成10％");
				score_=(int)(score*1.1);
			}

		}
		catch (Exception e)
		{}

		try
		{

			if(fs.isFile() && fs.exists()){ //判断文件是否存在
				g.setVisibility(View.VISIBLE);
				g.setText("加成3％");
				score_=(int)(score*1.03);
			}

		}
		catch (Exception e)
		{}

		try
		{

			if(fp.isFile() && fp.exists()){ //判断文件是否存在
				g.setVisibility(View.VISIBLE);
				g.setText("加成5％");
				score_=(int)(score*1.05);
			}

		}
		catch (Exception e)
		{}

		try
		{

			if(fo.isFile() && fo.exists()){ //判断文件是否存在
				g.setVisibility(View.VISIBLE);
				g.setText("加成20％");
				score_=(int)(score*1.2);
			}

		}
		catch (Exception e)
		{}


		//2

		if(fd.isFile() && fd.exists()&&fs.isFile() && fs.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成13％");
			score_=(int)(score*1.13);
		}
		if(fd.isFile() && fd.exists()&&fp.isFile() && fp.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成15％");
			score_=(int)(score*1.15);
		}
		if(fd.isFile() && fd.exists()&&fo.isFile() && fo.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成30％");
			score_=(int)(score*1.3);
		}
		if(fs.isFile() && fs.exists()&&fp.isFile() && fp.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成18％");
			score_=(int)(score*1.18);
		}
		if(fs.isFile() && fs.exists()&&fo.isFile() && fo.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成23％");
			score_=(int)(score*1.23);
		}
		if(fo.isFile() && fo.exists()&&fp.isFile() && fp.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成25％");
			score_=(int)(score*1.25);
		}


		//3
		if(fd.isFile() && fd.exists()&&fp.isFile() && fp.exists()&&fs.isFile() && fs.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成18％");
			score_=(int)(score*1.18);
		}
		if(fd.isFile() && fd.exists()&&fo.isFile() && fo.exists()&&fs.isFile() && fs.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成33％");
			score_=(int)(score*1.33);
		}
		if(fd.isFile() && fd.exists()&&fp.isFile() && fp.exists()&&fo.isFile() && fo.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成35％");
			score_=(int)(score*1.35);
		}
		if(fo.isFile() && fo.exists()&&fp.isFile() && fp.exists()&&fs.isFile() && fs.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成28％");
			score_=(int)(score*1.28);
		}

		//4
		if(fd.isFile() && fd.exists()&&fp.isFile() && fp.exists()
		   &&fs.isFile() && fs.exists()&&fo.isFile() && fo.exists()){ //判断文件是否存在
			g.setVisibility(View.VISIBLE);
			g.setText("加成38％");
			score_=(int)(score*1.38);
		}
		
		
		
		
		
		
		//得分
	a.setText(score_+"");
		
   //   a.setText(whiteblocks+"");
		
		
		
		
		if(score<7000)
		{
			b.setText("☆☆☆☆☆");
			c.setText("你逗我玩呢是吧→_→");
		}
		if(score>=7000&&score<11000)
		{
			b.setText("★☆☆☆☆");
			c.setText("我对你的手速真是醉了=_=");
		}
		if(score>=11000&&score<14000)
		{
			b.setText("★★☆☆☆");
			c.setText("还要再接再厉哦!O(∩_∩)O");
		}
		if(score>=14000&&score<17000)
		{
			b.setText("★★★☆☆");
			c.setText("就差一点点啦!再试一次吧？(^_^)");
		}
		if(score>=17000&&score<20000)
		{
			b.setText("★★★★☆");
			c.setText("手速不错!厉害！\\(≧▽≦)/~");
		}
		if(score>=20000&&score<23000)
		{
			File fz=new File("/mnt/sdcard/zjfb_a_fivet.txt");
			if(fz.isFile() && fz.exists()){}
			else{
				try
				{
					FileWriter fh=new FileWriter("/mnt/sdcard/zjfb_a_fivet.txt");
				}
				catch (IOException e)
				{}		
				final AlertDialog Dialog;
				Dialog = new AlertDialog.Builder(section_2_result.this).create();
				Dialog.show();
				Dialog.getWindow().setContentView(R.layout.dialog00);
				Dialog.getWindow().findViewById(R.id.dialogupButton1)
					.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							Dialog.dismiss();
						}
					});
						level_code=level_code+20;
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
			b.setText("★★★★★");
			c.setText("你已超越凡人！快去看看排行榜上的世界纪录吧！");
		}
		if(score>=30000)
		{
			b.setText("卍卍卍卍卍");
			c.setText("我对您本次成绩表示疑惑，请不要使用外挂等工具，如有下次必将重罚。＠(￣-￣)＠\n如有意见请反馈。");
		}
            

				

				
		
		e.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(section_2_result.this,start.class);
					startActivity(pp1);				
					finish();
				}
			});
		f.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(section_2_result.this,section_2.class);
					startActivity(pp1);				
					finish();
				}
			});
		
			
			
			
			
			
		int num = (int) (Math.random() * 99) + 1;  
		//num=10;
		if(num==10)
		{
			File fd=new File("/mnt/sdcard/zjfb_present_0.txt");
			if(fd.isFile() && fd.exists()){ //判断文件是否存在
			}
			else{
				final AlertDialog Dialog;
				Dialog = new AlertDialog.Builder(section_2_result.this).create();
				Dialog.show();
				Dialog.getWindow().setContentView(R.layout.dialog1);
				Dialog.getWindow().findViewById(R.id.dialogupButton1)
					.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							Dialog.dismiss();
						}
					});	
				try
				{
					FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_present_0.txt");
				}
				catch (IOException e)
				{}		  	
			}	
		}

		if(num>10&&num<18)
		{
			File fd=new File("/mnt/sdcard/zjfb_present_1.txt");
			if(fd.isFile() && fd.exists()){ //判断文件是否存在
			}
			else{
				final AlertDialog Dialog;
				Dialog = new AlertDialog.Builder(section_2_result.this).create();
				Dialog.show();
				Dialog.getWindow().setContentView(R.layout.dialog2);
				Dialog.getWindow().findViewById(R.id.dialogupButton1)
					.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View v) {
							Dialog.dismiss();
						}
					});
				try
				{
					FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_present_1.txt");
				}
				catch (IOException e)
				{}		
			}


		}

		//经验值增加
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_level.txt");

			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				level_code =Integer.parseInt( bufferedReader.readLine());
				read.close();
				level_code=level_code+3;
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
			else{
				level_code=0;
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
			}
		}
		catch (Exception e)
		{}


		//判断是否达成成就
		File fl=new File("/mnt/sdcard/zjfb_a_gt.txt");
		try{
			if(fl.isFile() && fl.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fl),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				gt =Integer.parseInt( bufferedReader.readLine());
				read.close();
				FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_a_gt.txt");  	
				BufferedWriter fw = null;
				try {
					fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fl, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
					gt=gt+1;
					if(gt==3||gt==20||gt==100)
					{
						final AlertDialog Dialog;
						Dialog = new AlertDialog.Builder(section_2_result.this).create();
						Dialog.show();
						Dialog.getWindow().setContentView(R.layout.dialog00);
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
								InputStreamReader read2=new InputStreamReader(new  FileInputStream(fr),"GBK");
								BufferedReader bufferedReader2 = new BufferedReader(read2);
								level_code =Integer.parseInt( bufferedReader2.readLine());
								read2.close();
								if(gt==3)
									level_code=level_code+20;
								if(gt==20)
									level_code=level_code+50;
								if(gt==100)
									level_code=level_code+200;
								try
								{
									FileWriter fg=new FileWriter("/mnt/sdcard/zjfb_level.txt");
								}
								catch (IOException e)
								{}		  	
								BufferedWriter fy = null;
								try {
									File fg=new File("/mnt/sdcard/zjfb_level.txt");
									fy = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fg, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
									fy.append(level_code+"");
									fy.newLine();
									fy.flush(); 
								} catch (Exception e) {
									e.printStackTrace();
								} finally {
									if (fy != null) {
										try {
											fy.close();
										} catch (IOException e) {
											e.printStackTrace();
										}
									}
								}	
							}
						}catch (Exception e)
						{}
					}
					fw.append(gt+"");
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


			}}
		catch (IOException e)
		{}



		int weishu=score_%10;

		File fd=new File("/mnt/sdcard/zjfb_a_"+weishu+".txt");
		if(fd.isFile() && fd.exists()){ //判断文件是否存在
		}
		else{
			final AlertDialog Dialog;
			Dialog = new AlertDialog.Builder(section_2_result.this).create();
			Dialog.show();
			Dialog.getWindow().setContentView(R.layout.dialog00);
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
			try
			{
				FileWriter fk=new FileWriter("/mnt/sdcard/zjfb_a_"+weishu+".txt");
			}
			catch (IOException e)
			{}		  	
		}	
		
		
		
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_user.txt");
			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				user=bufferedReader.readLine();
				read.close();						 

			}
			
		}catch (Exception e)
		{}	

		if(user!="null")
		{
			AVAnalytics.trackAppOpened(getIntent());
			AVOSCloud.initialize(section_2_result.this, "li8gesgfo0c3xky7br5ziclfsnh5mpxk5c6og2e7sr8kt9au", "uxdxh7ctrq5v9ahvbox1h3tm0ra66p4822fsexx6lm8358ns");
			AVObject score = new AVObject("high_score2");
			score.put("Value",score_+"");
			score.put("Player",user+"");
			score.saveInBackground();
		}	
		
			
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_least2.txt");

			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				int least =Integer.parseInt( bufferedReader.readLine());
				read.close();
				if(least<score_)
				{

					final AlertDialog Dialog = new AlertDialog.Builder(section_2_result.this).create();
					Dialog.show();
					Dialog.getWindow().setContentView(R.layout.dialogup);

					Dialog.getWindow().findViewById(R.id.dialogupButton1)
						.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent pp1=new Intent();
								pp1.setClass(section_2_result.this,upload2.class);
								Bundle bundle= new Bundle();
								bundle.putInt("result_s2",score_);
								Bundle bundle2= new Bundle();
								bundle.putString("player",user);
								pp1.putExtras(bundle);		
								pp1.putExtras(bundle2);			
								startActivity(pp1);
								finish();
								Dialog.dismiss();
							}
						});

					Dialog.getWindow().findViewById(R.id.dialogupButton2)
						.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View v) {
								Intent pp=new Intent();
								pp.setClass(section_2_result.this,start.class);
								startActivity(pp);
								Dialog.dismiss();
								finish();

							}
						});



				}
			}



		} catch (Exception e) {
			e.printStackTrace();


		}
		
		
		
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_whiteblocks.txt");

			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				num =Integer.parseInt( bufferedReader.readLine());
				read.close();
				whiteblocks=num+whiteblocks;
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
					fw.append(whiteblocks+"");
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
		}
		catch (Exception e)
		{}
		
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_redstar.txt");

			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				num =Integer.parseInt( bufferedReader.readLine());
				read.close();
				red=num+red;
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
					fw.append(red+"");
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
		}
		catch (Exception e)
		{}
		
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_yellowstar.txt");

			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				num =Integer.parseInt( bufferedReader.readLine());
				read.close();
				yellow=num+yellow;
				try
				{
					FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_yellowstar.txt");
				}
				catch (IOException e)
				{}		  	
				BufferedWriter fw = null;
				try {
					File ft=new File("/mnt/sdcard/zjfb_yellowstar.txt");
					fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ft, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
					fw.append(yellow+"");
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
		}
		catch (Exception e)
		{}
		}
		
		}
