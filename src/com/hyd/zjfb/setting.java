package com.hyd.zjfb;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.widget.*;
import java.io.*;

public class setting extends Activity
{
	private Button a,b,c,d,e,f,g;
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
		a=(Button) findViewById(R.id.helpButton1);
		b=(Button) findViewById(R.id.settingButton4);
		c=(Button) findViewById(R.id.settingButton1);
		d=(Button) findViewById(R.id.settingButton2);
		e=(Button) findViewById(R.id.settingButton3);
		f=(Button) findViewById(R.id.settingButton5);
		g=(Button) findViewById(R.id.settingButton6);
		
		b.setAlpha(0);
		c.setAlpha(0);
		d.setAlpha(0);
		e.setAlpha(0);
		f.setAlpha(0);
		g.setAlpha(0);
		
		a.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(setting.this,MainActivity.class);
					startActivity(pp1);				
					finish();
				}
			});
		b.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Toast.makeText(setting.this,"再点击一次以确认删除所有数据", Toast.LENGTH_SHORT).show();
					b.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View p1)
							{
					File fu=new File("/mnt/sdcard/zjfb_a_0.txt");
					File fu1=new File("/mnt/sdcard/zjfb_a_1.txt");
					File fu2=new File("/mnt/sdcard/zjfb_a_2.txt");
					File fu3=new File("/mnt/sdcard/zjfb_a_3.txt");
					File fu4=new File("/mnt/sdcard/zjfb_a_4.txt");
					File fu5=new File("/mnt/sdcard/zjfb_a_5.txt");
					File fu6=new File("/mnt/sdcard/zjfb_a_6.txt");
					File fu7=new File("/mnt/sdcard/zjfb_a_7.txt");
					File fu8=new File("/mnt/sdcard/zjfb_a_8.txt");
					File fu9=new File("/mnt/sdcard/zjfb_a_9.txt");
					File fua=new File("/mnt/sdcard/zjfb_return_.txt");
					File fuc=new File("/mnt/sdcard/zjfb_a_gt.txt");
					File fud=new File("/mnt/sdcard/zjfb_a_fivet.txt");
					File fue=new File("/mnt/sdcard/zjfb_a_level.txt");
					File fuf=new File("/mnt/sdcard/zjfb_a_spe1.txt");
					File fuf2=new File("/mnt/sdcard/zjfb_a_spe2.txt");
					File fuf3=new File("/mnt/sdcard/zjfb_a_spe3.txt");
					
                                        File fpl=new File("/mnt/sdcard/zjfb_least2.txt");
                                        File fq=new File("/mnt/sdcard/zjfb_BestRecord2.txt");
                                        File fq1=new File("/mnt/sdcard/zjfb_redstar.txt");
                                        File fq2=new File("/mnt/sdcard/zjfb_yellowstar.txt");
                                        File fq3=new File("/mnt/sdcard/zjfb_whiteblocks.txt");
                                       if(fpl.exists())
						fpl.delete();	
                                       if(fq.exists())
						fq.delete();	
                                       if(fq1.exists())
						fq1.delete();	
                                       if(fq2.exists())
						fq2.delete();	
                                       if(fq3.exists())
						fq3.delete();	

					
					File g = new File("/mnt/sdcard/zjfb_present_0.txt");
					File h = new File("/mnt/sdcard/zjfb_present_1.txt");
					File fb = new File("/mnt/sdcard/zjfb_level.txt");
				        File fp=new File("/mnt/sdcard/zjfb_present_2.txt");
				        File fo=new File("/mnt/sdcard/zjfb_present_3.txt");		
					File f = new File("/mnt/sdcard/zjfb_BestRecord.txt"); // 输入要删除的文件位置
					File fl=new File("/mnt/sdcard/zjfb_least.txt");
					File fk=new File("/mnt/sdcard/zjfb_user.txt");		
							
								
								// 输入要删除的文件位置
								if(fl.exists())
									fl.delete();
									
								if(fk.exists())
									fk.delete();	
					if(f.exists())
						f.delete();
					if(fb.exists())
						fb.delete();		
					if(g.exists())
						g.delete();
					if(h.exists())
						h.delete();
					if(fp.exists())
						fp.delete();
					if(fo.exists())
						fo.delete();	
						
						
					if(fu.exists())
						fu.delete();
					if(fu1.exists())
						fu1.delete();		
					if(fu2.exists())
						fu2.delete();
					if(fu3.exists())
						fu3.delete();
					if(fu4.exists())
						fu4.delete();
					if(fu5.exists())
						fu5.delete();	
					if(fu6.exists())
						fu6.delete();
					if(fu7.exists())
						fu7.delete();		
					if(fu8.exists())
						fu8.delete();
					if(fu9.exists())
						fu9.delete();
					if(fua.exists())
						fua.delete();
					if(fuc.exists())
						fuc.delete();	
					if(fud.exists())
						fud.delete();
					if(fue.exists())
						fue.delete();		
					if(fuf.exists())
						fuf.delete();
					if(fuf2.exists())
						fuf2.delete();
					if(fuf3.exists())
						fuf3.delete();
					
					Toast.makeText(setting.this,"已清除所有数据", Toast.LENGTH_SHORT).show();
				}
			});
			}
			});
			c=(Button) findViewById(R.id.settingButton1);
			d=(Button) findViewById(R.id.settingButton2);
			e=(Button) findViewById(R.id.settingButton3);
			f=(Button) findViewById(R.id.settingButton5);
			g=(Button) findViewById(R.id.settingButton6);
		c.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					//关于
					Intent pp1=new Intent();
					pp1.setClass(setting.this,about.class);
					startActivity(pp1);				
					finish();
					}
			});
		d.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					//声音
					Toast.makeText(setting.this,"敬请期待", Toast.LENGTH_SHORT).show();
				}
			});	
		e.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					//反馈
					Intent pp1=new Intent();
					pp1.setClass(setting.this,return_.class);
					startActivity(pp1);				
					finish();
					}
			});	
			
		f.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					//成就
					Intent pp1=new Intent();
					pp1.setClass(setting.this,achivement.class);
					startActivity(pp1);				
					finish();
				}
			});	
		g.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					//激活码
					Intent pp1=new Intent();
					pp1.setClass(setting.this,special_coding.class);
					startActivity(pp1);				
					finish();
				}
			});	
			
		ObjectAnimator animatora1 = ObjectAnimator.ofFloat(d,"alpha",0,1);
		ObjectAnimator animatora2 = ObjectAnimator.ofFloat(c,"alpha",0,1);
		ObjectAnimator animatora3 = ObjectAnimator.ofFloat(f,"alpha",0,1);
		ObjectAnimator animatora4 = ObjectAnimator.ofFloat(b,"alpha",0,1);
		ObjectAnimator animatora5 = ObjectAnimator.ofFloat(e,"alpha",0,1);
		ObjectAnimator animatora6 = ObjectAnimator.ofFloat(g,"alpha",0,1);
		final AnimatorSet seta= new AnimatorSet();
		seta.playTogether(animatora1,animatora2,animatora3,animatora4,animatora5,animatora6);
		seta.setDuration(850);
		seta.start();

		
}
}
