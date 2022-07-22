package com.hyd.zjfb;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.io.*;

public class achivement extends Activity
{
	private Button a;
	private int level_code;
	private int num_r,num_y,num_b;
	private ProgressBar pro;
	private TextView p1,p2;
	private TextView a0,a1,a2,a3,a4,a5,a6,a7,a8,a9;
	private TextView b;
	private TextView c1,c2,c3;
	private TextView d1,d2,d3;
	private TextView e1,e2,e3;
	private TextView f1,f2,f3;
	private TextView g;
	private TextView h0,h1,h2,h3,h4,h5,h6,h7,h8,h9;
	private TextView i;
	private TextView j1,j2,j3;
	private TextView k1,k2,k3;
	private TextView l1,l2,l3;
	private TextView m1,m2,m3;
	private TextView n1,n2,n3;
	private TextView o1,o2,o3;
	private TextView q1,q2,q3;
	private TextView r;
	private TextView s1,s2,s3;
	private TextView t1,t2,t3;
	private TextView u1,u2,u3;
	private TextView v;
	private int all;
	
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achivement);
		all=0;
		p1=(TextView) findViewById(R.id.achivementTextViewox);
		p2=(TextView) findViewById(R.id.achivementTextViewot);
		a0=(TextView) findViewById(R.id.achivementTextView4);
		a1=(TextView) findViewById(R.id.achivementTextView2);
		a2=(TextView) findViewById(R.id.achivementTextView5);
		a3=(TextView) findViewById(R.id.achivementTextView7);
		a4=(TextView) findViewById(R.id.achivementTextView6);
		a5=(TextView) findViewById(R.id.achivementTextView8);//
		a6=(TextView) findViewById(R.id.achivementTextView13);
		a7=(TextView) findViewById(R.id.achivementTextView12);
		a8=(TextView) findViewById(R.id.achivementTextView14);//
		a9=(TextView) findViewById(R.id.achivementTextView19);
		b=(TextView) findViewById(R.id.achivementTextView18);
		c1=(TextView) findViewById(R.id.achivementTextView20);//
		c2=(TextView) findViewById(R.id.achivementTextView25);
		c3=(TextView) findViewById(R.id.achivementTextView24);
		d1=(TextView) findViewById(R.id.achivementTextView26);//
		d2=(TextView) findViewById(R.id.achivementTextView31);
		d3=(TextView) findViewById(R.id.achivementTextView30);
		e1=(TextView) findViewById(R.id.achivementTextView32);//
		e2=(TextView) findViewById(R.id.achivementTextView37);
		e3=(TextView) findViewById(R.id.achivementTextView36);
		f1=(TextView) findViewById(R.id.achivementTextView38);//
		f2=(TextView) findViewById(R.id.achivementTextView43);
		f3=(TextView) findViewById(R.id.achivementTextView42);
		g=(TextView) findViewById(R.id.achivementTextView44);
		h0=(TextView) findViewById(R.id.achivementTextView48_);
		h1=(TextView) findViewById(R.id.achivementTextView3);
		h2=(TextView) findViewById(R.id.achivementTextView49_);
		h3=(TextView) findViewById(R.id.achivementTextView10);
		h4=(TextView) findViewById(R.id.achivementTextView9);
		h5=(TextView) findViewById(R.id.achivementTextView11);//
		h6=(TextView) findViewById(R.id.achivementTextView16);
		h7=(TextView) findViewById(R.id.achivementTextView15);
		h8=(TextView) findViewById(R.id.achivementTextView17);//
		h9=(TextView) findViewById(R.id.achivementTextView22);
		i=(TextView) findViewById(R.id.achivementTextView21);
		j1=(TextView) findViewById(R.id.achivementTextView23);//
		j2=(TextView) findViewById(R.id.achivementTextView28);
		j3=(TextView) findViewById(R.id.achivementTextView27);
		k1=(TextView) findViewById(R.id.achivementTextView29);//
		k2=(TextView) findViewById(R.id.achivementTextView34);
		k3=(TextView) findViewById(R.id.achivementTextView33);
		l1=(TextView) findViewById(R.id.achivementTextView35);//
		l2=(TextView) findViewById(R.id.achivementTextView40);
		l3=(TextView) findViewById(R.id.achivementTextView39);
		m1=(TextView) findViewById(R.id.achivementTextView41);//
		m2=(TextView) findViewById(R.id.achivementTextView46);
		m3=(TextView) findViewById(R.id.achivementTextView45);
		n1=(TextView) findViewById(R.id.achivementTextView44);//
		n2=(TextView) findViewById(R.id.achivementTextView49);
		n3=(TextView) findViewById(R.id.achivementTextView48);
		o1=(TextView) findViewById(R.id.achivementTextView50);//
		o2=(TextView) findViewById(R.id.achivementTextView55);
		o3=(TextView) findViewById(R.id.achivementTextView54);
		q1=(TextView) findViewById(R.id.achivementTextView56);//
		q2=(TextView) findViewById(R.id.achivementTextView61);
		q3=(TextView) findViewById(R.id.achivementTextView60);
		r=(TextView) findViewById(R.id.achivementTextView62);//
		s1=(TextView) findViewById(R.id.achivementTextView47);//
		s2=(TextView) findViewById(R.id.achivementTextView52);
		s3=(TextView) findViewById(R.id.achivementTextView51);
		t1=(TextView) findViewById(R.id.achivementTextView53);//
		t2=(TextView) findViewById(R.id.achivementTextView58);
		t3=(TextView) findViewById(R.id.achivementTextView57);
		u1=(TextView) findViewById(R.id.achivementTextView59);//
		u2=(TextView) findViewById(R.id.achivementTextView64);
		u3=(TextView) findViewById(R.id.achivementTextView63);
		v=(TextView) findViewById(R.id.achivementTextView65);//
		
		try
		{
			File fr=new File("/mnt/sdcard/zjfb_whiteblocks.txt");
			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				num_b=Integer.parseInt( bufferedReader.readLine());
				read.close();
			}
			
			File fo=new File("/mnt/sdcard/zjfb_redstar.txt");
			if(fo.isFile() && fo.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fo),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				num_r=Integer.parseInt( bufferedReader.readLine());
				read.close();
			}
			
			
			File fq=new File("/mnt/sdcard/zjfb_yellowstar.txt");
			if(fq.isFile() && fq.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fq),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				num_y=Integer.parseInt( bufferedReader.readLine());
				read.close();
			}
			}
			catch (Exception e)
			{}
			
			
			
			
			
			
			try
		{
			File fr=new File("/mnt/sdcard/zjfb_level.txt");

			if(fr.isFile() && fr.exists()){ //判断文件是否存在
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				level_code =Integer.parseInt( bufferedReader.readLine());
				read.close();
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
		
		pro=(ProgressBar) findViewById(R.id.achivementProgressBar1);
		if(level_code<=100)
		{
			p1.setText("0级");
		pro.setMax(100);
		pro.setProgress(level_code);
		}
		else if(level_code>100&&level_code<=250)
		{
			
			File fu=new File("/mnt/sdcard/zjfb_achi.txt");
			if(fu.isFile() && fu.exists()){ }
			else{
				try
				{
					FileWriter fi=new FileWriter("/mnt/sdcard/zjfb_achi.txt");
				}
				catch (IOException e)
				{}		
				AlertDialog Dialog;
				Dialog = new AlertDialog.Builder(achivement.this).create();
				Dialog.show();
				Dialog.getWindow().setContentView(R.layout.dialog00);
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
			}
			p1.setText("1级");
			pro.setMax(150);
			pro.setProgress(level_code-100);
		}
		else if(level_code>250&&level_code<=450)
		{
			p1.setText("2级");
			pro.setMax(200);
			pro.setProgress(level_code-250);
		}
		else if(level_code>450&&level_code<=700)
		{
			p1.setText("3级");
			pro.setMax(250);
			pro.setProgress(level_code-450);
		}
		else if(level_code>700&&level_code<=1000)
		{
			p1.setText("4级");
			pro.setMax(300);
			pro.setProgress(level_code-700);
		}
		
		else if(level_code>1000&&level_code<=1350)
		{
			p1.setText("5级");
			pro.setMax(350);
			pro.setProgress(level_code-700);
		}
		
		else if(level_code>1350&&level_code<=1750)
		{
			p1.setText("6级");
			pro.setMax(400);
			pro.setProgress(level_code-700);
		}
		else if(level_code>1750&&level_code<=2200)
		{
			p1.setText("7级");
			pro.setMax(450);
			pro.setProgress(level_code-700);
		}
		
		a=(Button) findViewById(R.id.helpButton1);
		a.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(achivement.this,setting.class);
					startActivity(pp1);				
					finish();
				}
			});
			
			
			//点亮成就
			
			//末尾0-9:
		File fu=new File("/mnt/sdcard/zjfb_a_0.txt");
		if(fu.isFile() && fu.exists()){
			a0.setAlpha(1);
			h0.setAlpha(1);
			all=all+1;
			}
		File fu1=new File("/mnt/sdcard/zjfb_a_1.txt");
		if(fu1.isFile() && fu1.exists()){
			a1.setAlpha(1);
			h1.setAlpha(1);
			all=all+1;
		}
		File fu2=new File("/mnt/sdcard/zjfb_a_2.txt");
		if(fu2.isFile() && fu2.exists()){
			a2.setAlpha(1);
			h2.setAlpha(1);
			all=all+1;
		}
		File fu3=new File("/mnt/sdcard/zjfb_a_3.txt");
		if(fu3.isFile() && fu3.exists()){
			a3.setAlpha(1);
			h3.setAlpha(1);
			all=all+1;
		}
		File fu4=new File("/mnt/sdcard/zjfb_a_4.txt");
		if(fu4.isFile() && fu4.exists()){
			a4.setAlpha(1);
			h4.setAlpha(1);
			all=all+1;
		}
		File fu5=new File("/mnt/sdcard/zjfb_a_5.txt");
		if(fu5.isFile() && fu5.exists()){
			a5.setAlpha(1);
			h5.setAlpha(1);
			all=all+1;
		}
		File fu6=new File("/mnt/sdcard/zjfb_a_6.txt");
		if(fu6.isFile() && fu6.exists()){
			a6.setAlpha(1);
			h6.setAlpha(1);
			all=all+1;
		}
		File fu7=new File("/mnt/sdcard/zjfb_a_7.txt");
		if(fu7.isFile() && fu7.exists()){
			a7.setAlpha(1);
			h7.setAlpha(1);
			all=all+1;
		}
		File fu8=new File("/mnt/sdcard/zjfb_a_8.txt");
		if(fu8.isFile() && fu8.exists()){
			a8.setAlpha(1);
			h8.setAlpha(1);
			all=all+1;
		}
		File fu9=new File("/mnt/sdcard/zjfb_a_9.txt");
		if(fu9.isFile() && fu9.exists()){
			a9.setAlpha(1);
			h9.setAlpha(1);
			all=all+1;
		}
		
		//其他
		File fua=new File("/mnt/sdcard/zjfb_return_.txt");
		if(fua.isFile() && fua.exists()){
			b.setAlpha(1);
			i.setAlpha(1);
			all=all+1;
		}
		
		File fuc=new File("/mnt/sdcard/zjfb_a_gt.txt");
		if(fuc.isFile() && fuc.exists()){
		try{
		InputStreamReader read=new InputStreamReader(new  FileInputStream(fuc),"GBK");
		BufferedReader bufferedReader = new BufferedReader(read);
			int lineTxt = Integer.parseInt( bufferedReader.readLine());
		read.close();
		if(lineTxt>=100)
		{
			c3.setAlpha(1);
			j3.setAlpha(1);
			all=all+1;
		}
			if(lineTxt>=20)
			{
				j2.setAlpha(1);
				c2.setAlpha(1);
				all=all+1;
			}
			if(lineTxt>=3)
			{
				c1.setAlpha(1);
				j1.setAlpha(1);
				all=all+1;
			}
		}
		catch(Exception e){}
		}
		
		//
		File fud=new File("/mnt/sdcard/zjfb_a_fivet.txt");
		if(fud.isFile() && fud.exists()){
			d1.setAlpha(1);
			k1.setAlpha(1);
			all=all+1;
		}
		/* File fu=new File("/mnt/sdcard/zjfb_a_0.txt");
		if(fu.isFile() && fu.exists()){
			a0.setAlpha(1);
		 h1.setAlpha(1);
		 all=all+1;
		}
		File fu=new File("/mnt/sdcard/zjfb_a_0.txt");
		if(fu.isFile() && fu.exists()){
			a0.setAlpha(1);
		 h1.setAlpha(1);
		 all=all+1;
		}
		*/
		
		File fue=new File("/mnt/sdcard/zjfb_level.txt");
		if(fue.isFile() && fue.exists()){
			try{
			InputStreamReader read=new InputStreamReader(new  FileInputStream(fue),"GBK");
			BufferedReader bufferedReader = new BufferedReader(read);
			level_code =Integer.parseInt( bufferedReader.readLine());
			read.close();
			}
			catch(Exception e){}
			if(level_code>=1000)
			{
				e2.setAlpha(1);
				l2.setAlpha(1);
				all=all+1;
				}
			 else if(1000>level_code&&level_code>=100)
			{
			e1.setAlpha(1);
			l1.setAlpha(1);
			all=all+1;
			}
		}
			
		File fuf=new File("/mnt/sdcard/zjfb_a_spe1.txt");
		if(fuf.isFile() && fuf.exists()){
			f1.setAlpha(1);
			m1.setAlpha(1);
			all=all+1;
		}
			
		File fuf2=new File("/mnt/sdcard/zjfb_a_spe2.txt");
		if(fuf2.isFile() && fuf2.exists()){
			f2.setAlpha(1);
			m2.setAlpha(1);	
			all=all+1;
		}
			
		File fuf3=new File("/mnt/sdcard/zjfb_a_spe3.txt");
		if(fuf3.isFile() && fuf3.exists()){
			f3.setAlpha(1);
			m3.setAlpha(1);
			all=all+1;
		}	
		
		
		if(num_b>=50000){
			q3.setAlpha(1);
			u3.setAlpha(1);
			all=all+1;
		}
		if(num_b>=10000){
			q2.setAlpha(1);
			u2.setAlpha(1);
			all=all+1;
		}
		 if(num_b>=1000){
			q1.setAlpha(1);
			u1.setAlpha(1);
			all=all+1;
		}
		
		
		if(num_r>=100){
			n3.setAlpha(1);
			s3.setAlpha(1);
			all=all+1;
		}
		if(num_r>=20){
			n2.setAlpha(1);
			s2.setAlpha(1);
			all=all+1;
		}
		 if(num_r>=1){
			n1.setAlpha(1);
			s1.setAlpha(1);
			all=all+1;
		}
		
		
		if(num_y>=100){
			o3.setAlpha(1);
			t3.setAlpha(1);
			all=all+1;
		}
		 if(num_y>=20){
			o2.setAlpha(1);
			t2.setAlpha(1);
			all=all+1;
		}
		 if(num_y>=1){
			o1.setAlpha(1);
			t1.setAlpha(1);
			all=all+1;
		}
		p2.setText(all+"/30");
			
			
}
}
