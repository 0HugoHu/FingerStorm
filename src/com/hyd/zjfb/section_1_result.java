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

public class section_1_result extends Activity
{
	private int score,score_;
	private TextView a,b,c,d,g;
	private int extra;
	private String lineTxt ;
	private int level_code;
	private int whiteblocks=0,num;
	private Button e,f;
	private int gt,fivet;
	
	private String user;
	private File fd=new File("/mnt/sdcard/zjfb_present_0.txt");
	private File fs=new File("/mnt/sdcard/zjfb_present_1.txt");
	private File fp=new File("/mnt/sdcard/zjfb_present_2.txt");
	private File fo=new File("/mnt/sdcard/zjfb_present_3.txt");
	
	 
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_1_result);
		
		
		AVOSCloud.initialize(this, "li8gesgfo0c3xky7br5ziclfsnh5mpxk5c6og2e7sr8kt9au", "uxdxh7ctrq5v9ahvbox1h3tm0ra66p4822fsexx6lm8358ns");
		
		Bundle bundle = this.getIntent().getExtras();
		score=bundle.getInt("result_s1");
		extra= (int) (Math.random() * (98)) + 0;  
		score=score+extra;
		a=(TextView) findViewById(R.id.section1resultTextView3);
		b=(TextView) findViewById(R.id.section1resultTextView5);
		c=(TextView) findViewById(R.id.section1resultTextView6);
		d=(TextView) findViewById(R.id.section1resultTextView7);
		e=(Button) findViewById(R.id.section1resultButton1);
		f=(Button) findViewById(R.id.section1resultButton2);
		g=(TextView) findViewById(R.id.section1resultTextView8);
	
		
		
		
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_BestRecord.txt");
			
			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				lineTxt = bufferedReader.readLine();
				read.close();
				
				}
				else{
					
					lineTxt=0+"";
					try
					{
						FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_BestRecord.txt");
						if(fr.isFile() && fr.exists()){ 	
							BufferedWriter fw = null;
							try {
								fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fr, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
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
					catch (IOException e)
					{}		
					
					
					
					//第一次游戏(成就)
					
					try
					{
						FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_a_gt.txt");
					}
					catch (IOException e)
					{}		  	
					BufferedWriter fw = null;
					try {
						File ft=new File("/mnt/sdcard/zjfb_a_gt.txt");
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
		int lineTxt_=Integer.parseInt(lineTxt);
		
          if(score> lineTxt_)
			  
		  {
			  d.setVisibility(View.VISIBLE);
		try
		{
			FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_BestRecord.txt");
		}
		catch (IOException e)
		{}		  
		File file=new File("/mnt/sdcard/zjfb_BestRecord.txt");
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
		if(score<6000)
		{
			b.setText("☆☆☆☆☆");
			c.setText("你逗我玩呢是吧→_→");
			whiteblocks=whiteblocks+20;
		}
		if(score>=6000&&score<7000)
		{
			b.setText("★☆☆☆☆");
			c.setText("我对你的手速真是醉了=_=");
			whiteblocks=whiteblocks+25;
		}
		if(score>=7000&&score<9500)
		{
			b.setText("★★☆☆☆");
			whiteblocks=whiteblocks+30;
			c.setText("还不错，再接再厉哦!O(∩_∩)O");
		}
		if(score>=9500&&score<11000)
		{
			b.setText("★★★☆☆");
			whiteblocks=whiteblocks+35;
			c.setText("很厉害啦!再试一次吧？(^_^)");
		}
		if(score>=11000&&score<13000)
		{
			b.setText("★★★★☆");
			whiteblocks=whiteblocks+40;
			c.setText("手速王!膜拜中~\\(≧▽≦)/~");
		}
		if(score>=13000&&score<14500)
		{
			whiteblocks=whiteblocks+40;
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
			Dialog = new AlertDialog.Builder(section_1_result.this).create();
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
					
			}
			b.setText("★★★★★");
			c.setText("传奇!看来单手抓苍蝇不是神话!（☆_☆）");
		}
		if(score>=14500)
		{
			b.setText("卍卍卍卍卍");
			c.setText("我对您本次成绩表示疑惑，请不要使用外挂等工具，如有下次必将重罚。＠(￣-￣)＠\n如有意见请反馈。");
		}
		
		e.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(section_1_result.this,start.class);
					startActivity(pp1);				
					finish();
				}
			});
		f.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(section_1_result.this,section_1.class);
					startActivity(pp1);				
					finish();
				}
			});
		
			score_=score;
			
		
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
		//上传数据

		
		
		
		
	
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_user.txt");
			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				user=bufferedReader.readLine();
				read.close();						 

			}
			else{
				try
				{
					FileWriter fi=new FileWriter("/mnt/sdcard/zjfb_user.txt");
				}
				catch (IOException e)
				{}		
				Intent pp1=new Intent();
				pp1.setClass(section_1_result.this,creat_user.class);
				startActivity(pp1);				
				finish();

			}
		}catch (Exception e)
		{}	

		if(user!="null")
		{
			AVAnalytics.trackAppOpened(getIntent());
			AVOSCloud.initialize(section_1_result.this, "li8gesgfo0c3xky7br5ziclfsnh5mpxk5c6og2e7sr8kt9au", "uxdxh7ctrq5v9ahvbox1h3tm0ra66p4822fsexx6lm8358ns");
			AVObject score = new AVObject("high_score");
			score.put("Value",score_+"");
			score.put("Player",user+"");
			score.saveInBackground();
		}	
			
		int num = (int) (Math.random() * 99) + 1;  
		//num=10;
		if(num==10)
		{
			File fd=new File("/mnt/sdcard/zjfb_present_0.txt");
			if(fd.isFile() && fd.exists()){ //判断文件是否存在
			}
			else{
				final AlertDialog Dialog;
				Dialog = new AlertDialog.Builder(section_1_result.this).create();
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
				Dialog = new AlertDialog.Builder(section_1_result.this).create();
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
				Dialog = new AlertDialog.Builder(section_1_result.this).create();
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
				Dialog = new AlertDialog.Builder(section_1_result.this).create();
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
			File fr=new File("/mnt/sdcard/zjfb_least.txt");

			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				int least =Integer.parseInt( bufferedReader.readLine());
				read.close();
				if(least<score_)
				{
				
					final AlertDialog Dialog = new AlertDialog.Builder(section_1_result.this).create();
					Dialog.show();
					Dialog.getWindow().setContentView(R.layout.dialogup);
								
								Dialog.getWindow().findViewById(R.id.dialogupButton1)
									.setOnClickListener(new View.OnClickListener() {
										@Override
										public void onClick(View v) {
											Intent pp1=new Intent();
											pp1.setClass(section_1_result.this,upload.class);
											Bundle bundle= new Bundle();
											bundle.putInt("result_s1",score_);
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
											pp.setClass(section_1_result.this,start.class);
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
		
}
}
