package com.hyd.zjfb;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.animation.*;
import android.widget.*;
import java.io.*;

public class section_2 extends Activity
{
	
	private TextView t1,t2,t3,t4;
	private double b=0,px=1;
	private MyCount mc;
	private int height,width;
	private boolean flag=true;
	private RelativeLayout re;
	private MyCount_2 mt;
	private int red=0,yellow=0,whiteblocks=0;
	private int x;
	private int num1=0,num2=0,num3=0,num4=0,num5=0,num6;
	private int time=0,star_flag;
	
	//参数部分*************
	private int square_value=100,red_value=1800,square_finish=500,
	star_r_value,star_y_value;
	private int click_1=8;
	
	//********************
	private int k1_sec,k1_Xa,k1_Xb,k1_Ya,k1_Yb,k1_rol;
/*	private int shape,color,location=0,alpha;*/
	private Button a1,a2,a3,a4,a5,a6;
	/*private Button s1,s2,s3,s4;*/
	private int score;
	
		@Override
    public void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_2);
			
		t1=(TextView) findViewById(R.id.section2T1);
		t2=(TextView) findViewById(R.id.section2T3);
		t3=(TextView) findViewById(R.id.section2T5);
		t4=(TextView) findViewById(R.id.section2T6);
		re=(RelativeLayout) findViewById(R.id.re);
		    a1=(Button) findViewById(R.id.section2Button1);
			a2=(Button) findViewById(R.id.section2Button2);
			a3=(Button) findViewById(R.id.section2Button3);
			a4=(Button) findViewById(R.id.section2Button4);
			a5=(Button) findViewById(R.id.section2Button5);
			a6=(Button) findViewById(R.id.section2Button6);
			/*
			s1=(Button) findViewById(R.id.section2S1);
			s2=(Button) findViewById(R.id.section2S2);
			s3=(Button) findViewById(R.id.section2S3);
			s4=(Button) findViewById(R.id.section2S4);
		*/
	
			try
			{
				File fr=new File("/mnt/sdcard/zjfb_BestRecord2.txt");

				if(fr.isFile() && fr.exists()){ //判断文件是否存在

				}
				else{

					try
					{
						FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_BestRecord2.txt");
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

								}}
						}				
					}catch (IOException e)
					{}		
				}
			}
			catch (Exception e)
			{}		

			
		a6.setBackgroundResource(R.drawable.star);
		mc = new MyCount(4000, 10);   
        mc.start(); 
		mt = new MyCount_2(58000,10);//58000
		mt.start();
			
			new TimeThread().start();		
	   
	}
	
public void re(View view){
	score=score-150;
	if(score<0){
		score=0;
	}
}
	
public void a1(View view){
   num1=num1+1;
	whiteblocks=whiteblocks+1;
	if(num1<click_1){
		score=score+square_value;
	}
	else if(num1==click_1){
		score=score+square_finish;
		a1.setBackgroundColor(0xffff0000);
	}
	else if(num1==click_1+2){
		score=score-red_value;
		if(score<0)
			score=0;
	}
	
	}

	public void a2(View view){
		num2=num2+1;
		whiteblocks=whiteblocks+1;
			if(num2<click_1){
				score=score+square_value;
			}
			else if(num2==click_1){
				score=score+square_finish;
				a2.setBackgroundColor(0xffff0000);
			}
			else if(num2==click_1+2){
				score=score-red_value;
				if(score<0)
					score=0;
			}
		
	}
	
	public void a3(View view){
		num3=num3+1;
		whiteblocks=whiteblocks+1;
		if(num3<click_1){
			score=score+square_value;
		}
		else if(num3==click_1){
			score=score+square_finish;
			a3.setBackgroundColor(0xffff0000);
		}
		else if(num3==click_1+2){
			score=score-red_value;
			if(score<0)
				score=0;
		}

	}
	
	public void a4(View view){
		num4=num4+1;
		whiteblocks=whiteblocks+1;
		if(num4<click_1){
			score=score+square_value;
		}
		else if(num4==click_1){
			score=score+square_finish;
			a4.setBackgroundColor(0xffff0000);
		}
		else if(num4==click_1+2){
			score=score-red_value;
			if(score<0)
				score=0;
		}
	}
	
	public void a5(View view){
		num5=num5+1;
		whiteblocks=whiteblocks+1;
		if(num5<click_1){
			score=score+square_value;
		}
		else if(num5==click_1){
			score=score+square_finish;
			a5.setBackgroundColor(0xffff0000);
		}
		else if(num5==click_1+2){
			score=score-red_value;
			if(score<0)
				score=0;
		}
	}
	
	
	public void a6(View view){
		num6=num6+1;
		if(num6==1){
      if(x<20){
		 int y= (int) (Math.random() * 299) +1;  
		 yellow=yellow+1;
		  if(y<50)
			  score=score+1000;
			  if(y>=50&&y<100)
				  score=score+2000;
				  if(y>=100&&y<150)
					  score=score+3000;
		  if(y>=150&&y<240)
			  px=px+0.05;
		  if(y>=240)
			  px=px+0.1; 
	  }
	  }
	  else if(x>=50&&x<90){
		  red=red+1;
		  int y= (int) (Math.random() * 299) +1;  
		  if(y<100)
			  px=1;
		else  if(y>=100&&y<200){
			  score=score-5000;
			 if(score<0){
		score=0;
	} 
	}
		else if(y>=200) {
			flag=false;
			  Intent pp1=new Intent();
			  pp1.setClass(section_2.this,section_2_result.class);
			  Bundle bundle= new Bundle();
			  score=(int)(score*px);
			  bundle.putInt("result_s2",score);
			  pp1.putExtras(bundle);	
			  startActivity(pp1);				
			  finish();  
		  } 
			  
	  }
		

	}

	/*
	public void s1(View view){
		b=b+1;
		score=b*100;

	}

	public void s2(View view){
		b=b+1;
		score=b*100;

	}

	public void s3(View view){
		b=b+1;
		score=b*100;

	}

	public void s4(View view){
		b=b+1;
		score=b*100;

	}
	
	*/
	
	class MyCount extends CountDownTimer {      
        public MyCount(long millisInFuture, long countDownInterval) {      
            super(millisInFuture, countDownInterval);      
        }      
        @Override      
        public void onFinish() { 
			t2.setText("54");
		    t1.setText("加成");
			t4.setText(px+"x");
			
        }      
        @Override      
        public void onTick(long millisUntilFinished) {    
			int mllis =(int)millisUntilFinished/1000;
            t4.setText(""+mllis);  
		    t1.setText("等待");
		}     
    }      

	class MyCount_2 extends CountDownTimer {      
        public MyCount_2(long millisInFuture, long countDownInterval) {      
            super(millisInFuture, countDownInterval);      
        }      
        @Override      
        public void onFinish() {      
            t2.setText("结束");   
			if(flag==true){
			Intent pp1=new Intent();
			pp1.setClass(section_2.this,section_2_result.class);
			Bundle bundle= new Bundle();
			score=(int)(score*px);
			bundle.putInt("result_s2",score);
			bundle.putInt("red",red);
			bundle.putInt("yellow",yellow);
			bundle.putInt("whiteblocks",whiteblocks);
			pp1.putExtras(bundle);	
			startActivity(pp1);				
			finish();
			}
        }      
        @Override      
        public void onTick(long millisUntilFinished) {    
			int mllis =(int)millisUntilFinished/1000;
			if(mllis<54)
			{
			t2.setText(""+mllis);  
				t4.setText(px+"x");
			}
			t3.setText(""+score);
			
		}     
    }      
	
	
	
	Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
			width=re.getWidth();
			height=re.getHeight();
			k1_Xa = (int) (Math.random() * 99) +1;    
			k1_rol = (int) (Math.random() * 360) + 180;  
			if (k1_Xa<50){
				k1_Xb=(int) (Math.random() * width/1.1)+100 ;
			    k1_Xa=(int) (Math.random() * width/1.1)+100 ;
				if(Math.abs(k1_Xa-k1_Xb)<=400)
					if(k1_Ya>=k1_Yb)
					{
						k1_Xa=k1_Xa+150;
						k1_Xb=k1_Xb-150;
					}
					else{
						k1_Xa=k1_Xa-150;
						k1_Xb=k1_Xb+150;
					}
				k1_Yb = (int) (Math.random() * 99) +1;    		
				if(k1_Yb%2==0)
				{	
					k1_Ya=(int)(-height/5.55);
					k1_Yb=(int)(height+height/5.55);
				}
				else{
					k1_Yb=(int)(-height/5.55);
					k1_Ya=(int)(height+height/5.55);
				}			
			}
			else{
				k1_Ya=(int) (Math.random() * width*1.15)+100 ;
				k1_Yb=(int) (Math.random() * width*1.15)+100 ;
				if(Math.abs(k1_Ya-k1_Yb)<=400)
					if(k1_Ya>=k1_Yb)
					{
						k1_Ya=k1_Ya+200;
						k1_Yb=k1_Yb-200;
					}
					else{
						k1_Ya=k1_Ya-200;
						k1_Yb=k1_Yb+200;
					}
				k1_Xb = (int) (Math.random() * 99) +1;    			
				if(k1_Yb%2==0)
				{
					k1_Xa=(int)(-height/6.57);
					k1_Xb=(int)(height-height/6.57);
				}
				else{
					k1_Xb=(int)(-height/6.57);
					k1_Xa=(int)(height-height/6.57);
				}
			}
			x = (int) (Math.random() * 99) + 1; 
			
			if(x<20){
				k1_sec =2000;
				a6.setVisibility(View.VISIBLE);
				a6.setBackgroundResource(R.drawable.star);
				ObjectAnimator animatora1 = ObjectAnimator.ofFloat(a6,"rotation",0,720);
				ObjectAnimator animatora2 = ObjectAnimator.ofFloat(a6,"translationX",k1_Xa,k1_Xb);
				ObjectAnimator animatora3 = ObjectAnimator.ofFloat(a6,"translationY",k1_Ya,k1_Yb);
				final AnimatorSet seta= new AnimatorSet();
				seta.playTogether(animatora1,animatora2,animatora3);
				seta.setDuration(k1_sec);
				seta.setInterpolator(new LinearInterpolator());
				seta.start();
			}
			else if(x>=50&&x<90){
				num6=0;
				k1_sec =4200; 
				a6.setVisibility(View.VISIBLE);
				a6.setBackgroundResource(R.drawable.star_red);
				ObjectAnimator animatora1 = ObjectAnimator.ofFloat(a6,"rotation",0,360);
				ObjectAnimator animatorb2 = ObjectAnimator.ofFloat(a6,"translationX",k1_Xa,k1_Xb);
				ObjectAnimator animatorb3 = ObjectAnimator.ofFloat(a6,"translationY",k1_Ya,k1_Yb);
				final AnimatorSet setb= new AnimatorSet();
				setb.playTogether(animatora1,animatorb2,animatorb3);
				setb.setDuration(k1_sec);
				setb.setInterpolator(new DecelerateInterpolator());
				setb.start();
			}
			
			
		
			 k1_Xa = (int) (Math.random() * 99) +1;    
			k1_rol = (int) (Math.random() * 360) + 180;  
			if (k1_Xa<50){
				k1_Xb=(int) (Math.random() * width/1.1)+100 ;
			    k1_Xa=(int) (Math.random() * width/1.1)+100 ;
				if(Math.abs(k1_Xa-k1_Xb)<=400)
					if(k1_Ya>=k1_Yb)
					{
						k1_Xa=k1_Xa+150;
						k1_Xb=k1_Xb-150;
					}
					else{
						k1_Xa=k1_Xa-150;
						k1_Xb=k1_Xb+150;
					}
				k1_Yb = (int) (Math.random() * 99) +1;    		
				if(k1_Yb%2==0)
				{	
				k1_Ya=(int)(-height/5.55);
				k1_Yb=(int)(height+height/5.55);
				}
				else{
					k1_Yb=(int)(-height/5.55);
					k1_Ya=(int)(height+height/5.55);
				}			
				}
				else{
					k1_Ya=(int) (Math.random() * width*1.15)+100 ;
					k1_Yb=(int) (Math.random() * width*1.15)+100 ;
					if(Math.abs(k1_Ya-k1_Yb)<=400)
						if(k1_Ya>=k1_Yb)
						{
							k1_Ya=k1_Ya+200;
							k1_Yb=k1_Yb-200;
						}
						else{
							k1_Ya=k1_Ya-200;
							k1_Yb=k1_Yb+200;
						}
					k1_Xb = (int) (Math.random() * 99) +1;    			
						if(k1_Yb%2==0)
						{
					k1_Xa=(int)(-height/6.57);
					k1_Xb=(int)(height-height/6.57);
					}
					else{
						k1_Xb=(int)(-height/6.57);
						k1_Xa=(int)(height-height/6.57);
					}
				}
				/*
			switch(location){
				case 0: break;
				case 1: s1.setVisibility(View.INVISIBLE);break;
				case 2: s2.setVisibility(View.INVISIBLE);break;
				case 3: s3.setVisibility(View.INVISIBLE);break;
				case 4: s4.setVisibility(View.INVISIBLE);break;
			}
			location= (int) (Math.random() * 4) + 1;
			switch(location){
				case 1:
					s1.setVisibility(View.VISIBLE);
					s1.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorb1 = ObjectAnimator.ofFloat(s1,"alpha",0,0.8F);
					final AnimatorSet setb= new AnimatorSet();
					setb.playTogether(animatorb1);
					setb.setDuration(1000);
					setb.start();
					break;
				case 2:
					s2.setVisibility(View.VISIBLE);		
					s2.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorb2 = ObjectAnimator.ofFloat(s2,"alpha",0,0.8F);
					final AnimatorSet setb2= new AnimatorSet();
					setb2.playTogether(animatorb2);
					setb2.setDuration(1000);
					setb2.start();
					break;
				case 3:
					s3.setVisibility(View.VISIBLE);		
					s3.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorb3 = ObjectAnimator.ofFloat(s3,"alpha",0,0.8F);
					final AnimatorSet setb3= new AnimatorSet();
					setb3.playTogether(animatorb3);
					setb3.setDuration(1000);
					setb3.start();
					break;
				case 4:
					s4.setVisibility(View.VISIBLE);		
					s4.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorb4 = ObjectAnimator.ofFloat(s4,"alpha",0,0.8F);
					final AnimatorSet setb4= new AnimatorSet();
					setb4.playTogether(animatorb4);
					setb4.setDuration(1000);
					setb4.start();			
					break;
				default:break;
			}
			
				*/
            switch (msg.what) {
				case 1:
					
					k1_sec =5000;  
					a1.setVisibility(View.VISIBLE);
					a1.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatora1 = ObjectAnimator.ofFloat(a1,"rotation",0,k1_rol);
					ObjectAnimator animatora2 = ObjectAnimator.ofFloat(a1,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatora3 = ObjectAnimator.ofFloat(a1,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet seta= new AnimatorSet();
					seta.playTogether(animatora1,animatora2,animatora3);
					seta.setDuration(k1_sec);
					seta.setInterpolator(new LinearInterpolator());
					seta.start();
					break;
					
					
					case 2:
					k1_sec =4200;  
					a1.setVisibility(View.INVISIBLE);
					a2.setVisibility(View.VISIBLE);
					a2.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorb1 = ObjectAnimator.ofFloat(a2,"rotation",0,k1_rol);
					ObjectAnimator animatorb2 = ObjectAnimator.ofFloat(a2,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorb3 = ObjectAnimator.ofFloat(a2,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setb= new AnimatorSet();
					setb.playTogether(animatorb1,animatorb2,animatorb3);
					setb.setDuration(k1_sec);
					setb.setInterpolator(new LinearInterpolator());
					setb.start();
					break;
					
					
				case 3:
					k1_sec =3200;  
					a2.setVisibility(View.INVISIBLE);
					a3.setVisibility(View.VISIBLE);
					a3.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorc1 = ObjectAnimator.ofFloat(a3,"rotation",0,k1_rol);
					ObjectAnimator animatorc2 = ObjectAnimator.ofFloat(a3,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorc3 = ObjectAnimator.ofFloat(a3,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setc= new AnimatorSet();
					setc.playTogether(animatorc1,animatorc2,animatorc3);
					setc.setDuration(k1_sec);
					setc.setInterpolator(new LinearInterpolator());
					setc.start();
					break;
					
					
				case 4:
					num1=0;
					k1_sec =4200;  
					a3.setVisibility(View.INVISIBLE);
					a1.setVisibility(View.VISIBLE);
					a1.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatord1 = ObjectAnimator.ofFloat(a1,"rotation",0,k1_rol);
					ObjectAnimator animatord2 = ObjectAnimator.ofFloat(a1,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatord3 = ObjectAnimator.ofFloat(a1,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setd1= new AnimatorSet();
					setd1.playTogether(animatord1,animatord2,animatord3);
					setd1.setDuration(k1_sec);
					setd1.setInterpolator(new LinearInterpolator());
					setd1.start();
					
					k1_Xa = (int) (Math.random() * 99) +1;    
					k1_rol = (int) (Math.random() * 360) + 180;  
					if (k1_Xa<50){
						k1_Xb=(int) (Math.random() * width/1.1)+100 ;
						k1_Xa=(int) (Math.random() * width/1.1)+100 ;
						if(Math.abs(k1_Xa-k1_Xb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Xa=k1_Xa+150;
								k1_Xb=k1_Xb-150;
							}
							else{
								k1_Xa=k1_Xa-150;
								k1_Xb=k1_Xb+150;
							}
						k1_Yb = (int) (Math.random() * 99) +1;    		
						if(k1_Yb%2==0)
						{	
							k1_Ya=(int)(-height/5.55);
							k1_Yb=(int)(height+height/5.55);
						}
						else{
							k1_Yb=(int)(-height/5.55);
							k1_Ya=(int)(height+height/5.55);
						}			
					}
					else{
						k1_Ya=(int) (Math.random() * width*1.15)+100 ;
						k1_Yb=(int) (Math.random() * width*1.15)+100 ;
						if(Math.abs(k1_Ya-k1_Yb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Ya=k1_Ya+200;
								k1_Yb=k1_Yb-200;
							}
							else{
								k1_Ya=k1_Ya-200;
								k1_Yb=k1_Yb+200;
							}
						k1_Xb = (int) (Math.random() * 99) +1;    			
						if(k1_Yb%2==0)
						{
							k1_Xa=(int)(-height/6.57);
							k1_Xb=(int)(height-height/6.57);
						}
						else{
							k1_Xb=(int)(-height/6.57);
							k1_Xa=(int)(height-height/6.57);
						}
					}
					
					k1_sec =4200;  
					a4.setVisibility(View.VISIBLE);
					a4.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatord4 = ObjectAnimator.ofFloat(a4,"rotation",0,k1_rol);
					ObjectAnimator animatord5 = ObjectAnimator.ofFloat(a4,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatord6 = ObjectAnimator.ofFloat(a4,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setd2= new AnimatorSet();
					setd2.playTogether(animatord4,animatord5,animatord6);
					setd2.setDuration(k1_sec);
					setd2.setInterpolator(new LinearInterpolator());
					setd2.start();
					break;
					
					
				case 5:
					num2=0;num3=0;
					k1_sec =3700;  
					a1.setVisibility(View.INVISIBLE);
					a4.setVisibility(View.INVISIBLE);
					a2.setVisibility(View.VISIBLE);
					a3.setVisibility(View.VISIBLE);
					a2.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatore1 = ObjectAnimator.ofFloat(a2,"rotation",0,k1_rol);
					ObjectAnimator animatore2 = ObjectAnimator.ofFloat(a2,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatore3 = ObjectAnimator.ofFloat(a2,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet sete1= new AnimatorSet();
					sete1.playTogether(animatore1,animatore2,animatore3);
					sete1.setDuration(k1_sec);
					sete1.setInterpolator(new LinearInterpolator());
					sete1.start();

					k1_Xa = (int) (Math.random() * 99) +1;    
					k1_rol = (int) (Math.random() * 360) + 180;  
					if (k1_Xa<50){
						k1_Xb=(int) (Math.random() * width/1.1)+100 ;
						k1_Xa=(int) (Math.random() * width/1.1)+100 ;
						if(Math.abs(k1_Xa-k1_Xb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Xa=k1_Xa+150;
								k1_Xb=k1_Xb-150;
							}
							else{
								k1_Xa=k1_Xa-150;
								k1_Xb=k1_Xb+150;
							}
						k1_Yb = (int) (Math.random() * 99) +1;    		
						if(k1_Yb%2==0)
						{	
							k1_Ya=(int)(-height/5.55);
							k1_Yb=(int)(height+height/5.55);
						}
						else{
							k1_Yb=(int)(-height/5.55);
							k1_Ya=(int)(height+height/5.55);
						}			
					}
					else{
						k1_Ya=(int) (Math.random() * width*1.15)+100 ;
						k1_Yb=(int) (Math.random() * width*1.15)+100 ;
						if(Math.abs(k1_Ya-k1_Yb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Ya=k1_Ya+200;
								k1_Yb=k1_Yb-200;
							}
							else{
								k1_Ya=k1_Ya-200;
								k1_Yb=k1_Yb+200;
							}
						k1_Xb = (int) (Math.random() * 99) +1;    			
						if(k1_Yb%2==0)
						{
							k1_Xa=(int)(-height/6.57);
							k1_Xb=(int)(height-height/6.57);
						}
						else{
							k1_Xb=(int)(-height/6.57);
							k1_Xa=(int)(height-height/6.57);
						}
					}
					k1_sec =3800;  
					
					a3.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatore4 = ObjectAnimator.ofFloat(a3,"rotation",0,k1_rol);
					ObjectAnimator animatore5 = ObjectAnimator.ofFloat(a3,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatore6 = ObjectAnimator.ofFloat(a3,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet sete2= new AnimatorSet();
					sete2.playTogether(animatore4,animatore5,animatore6);
					sete2.setDuration(k1_sec);
					sete2.setInterpolator(new LinearInterpolator());
					sete2.start();
					break;	
					
					
				case 6:
					k1_sec =2400;  
					a1.setVisibility(View.INVISIBLE);
					a2.setVisibility(View.INVISIBLE);
					a3.setVisibility(View.INVISIBLE);
					a4.setVisibility(View.INVISIBLE);
					a5.setVisibility(View.VISIBLE);
					a5.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorf1 = ObjectAnimator.ofFloat(a5,"rotation",0,k1_rol);
					ObjectAnimator animatorf2 = ObjectAnimator.ofFloat(a5,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorf3 = ObjectAnimator.ofFloat(a5,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setf= new AnimatorSet();
					setf.playTogether(animatorf1,animatorf2,animatorf3);
					setf.setDuration(k1_sec);
					setf.setInterpolator(new DecelerateInterpolator());
					setf.start();
					break;
					
					
				case 7:
			     	num1=0;num2=0;num3=0;num4=0;num5=0;
					k1_sec =3700;  
					a2.setVisibility(View.INVISIBLE);
					a3.setVisibility(View.INVISIBLE);
					a5.setVisibility(View.INVISIBLE);
					a1.setVisibility(View.VISIBLE);
					a4.setVisibility(View.VISIBLE);
					a1.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorg1 = ObjectAnimator.ofFloat(a1,"rotation",0,k1_rol);
					ObjectAnimator animatorg2 = ObjectAnimator.ofFloat(a1,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorg3 = ObjectAnimator.ofFloat(a1,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setg1= new AnimatorSet();
					setg1.playTogether(animatorg1,animatorg2,animatorg3);
					setg1.setDuration(k1_sec);
					setg1.setInterpolator(new LinearInterpolator());
					setg1.start();

					k1_Xa = (int) (Math.random() * 99) +1;    
					k1_rol = (int) (Math.random() * 360) + 180;  
					if (k1_Xa<50){
						k1_Xb=(int) (Math.random() * width/1.1)+100 ;
						k1_Xa=(int) (Math.random() * width/1.1)+100 ;
						if(Math.abs(k1_Xa-k1_Xb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Xa=k1_Xa+150;
								k1_Xb=k1_Xb-150;
							}
							else{
								k1_Xa=k1_Xa-150;
								k1_Xb=k1_Xb+150;
							}
						k1_Yb = (int) (Math.random() * 99) +1;    		
						if(k1_Yb%2==0)
						{	
							k1_Ya=(int)(-height/5.55);
							k1_Yb=(int)(height+height/5.55);
						}
						else{
							k1_Yb=(int)(-height/5.55);
							k1_Ya=(int)(height+height/5.55);
						}			
					}
					else{
						k1_Ya=(int) (Math.random() * width*1.15)+100 ;
						k1_Yb=(int) (Math.random() * width*1.15)+100 ;
						if(Math.abs(k1_Ya-k1_Yb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Ya=k1_Ya+200;
								k1_Yb=k1_Yb-200;
							}
							else{
								k1_Ya=k1_Ya-200;
								k1_Yb=k1_Yb+200;
							}
						k1_Xb = (int) (Math.random() * 99) +1;    			
						if(k1_Yb%2==0)
						{
							k1_Xa=(int)(-height/6.57);
							k1_Xb=(int)(height-height/6.57);
						}
						else{
							k1_Xb=(int)(-height/6.57);
							k1_Xa=(int)(height-height/6.57);
						}
					}

					k1_sec =3800;  

					a4.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorg4 = ObjectAnimator.ofFloat(a4,"rotation",0,k1_rol);
					ObjectAnimator animatorg5 = ObjectAnimator.ofFloat(a4,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorg6 = ObjectAnimator.ofFloat(a4,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setg2= new AnimatorSet();
					setg2.playTogether(animatorg4,animatorg5,animatorg6);
					setg2.setDuration(k1_sec);
					setg2.setInterpolator(new LinearInterpolator());
					setg2.start();
					break;
					
					case 8:
					k1_sec =3200;
					a2.setVisibility(View.VISIBLE);
					a2.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorg9 = ObjectAnimator.ofFloat(a2,"rotation",0,k1_rol);
					ObjectAnimator animatorg10 = ObjectAnimator.ofFloat(a2,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorg11 = ObjectAnimator.ofFloat(a2,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setg5= new AnimatorSet();
					setg5.playTogether(animatorg9,animatorg10,animatorg11);
					setg5.setDuration(k1_sec);
					setg5.setInterpolator(new LinearInterpolator());
					setg5.start();
					break;	
					
					
					case 9:
					k1_sec =3200;
					a3.setVisibility(View.VISIBLE);
					a3.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorg12 = ObjectAnimator.ofFloat(a3,"rotation",0,k1_rol);
					ObjectAnimator animatorg13 = ObjectAnimator.ofFloat(a3,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorg14 = ObjectAnimator.ofFloat(a3,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setg6= new AnimatorSet();
					setg6.playTogether(animatorg12,animatorg13,animatorg14);
					setg6.setDuration(k1_sec);
					setg6.setInterpolator(new LinearInterpolator());
					setg6.start();
					break;	
				
					
				case 10:
			     	num1=0;num2=0;num3=0;num4=0;num5=0;
					k1_sec =3200;  
					a2.setVisibility(View.INVISIBLE);
					a3.setVisibility(View.INVISIBLE);
					a5.setVisibility(View.INVISIBLE);
					a1.setVisibility(View.VISIBLE);
					a4.setVisibility(View.VISIBLE);
					a1.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorh1 = ObjectAnimator.ofFloat(a1,"rotation",0,k1_rol);
					ObjectAnimator animatorh2 = ObjectAnimator.ofFloat(a1,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorh3 = ObjectAnimator.ofFloat(a1,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet seth1= new AnimatorSet();
					seth1.playTogether(animatorh1,animatorh2,animatorh3);
					seth1.setDuration(k1_sec);
					seth1.setInterpolator(new LinearInterpolator());
					seth1.start();

					k1_Xa = (int) (Math.random() * 99) +1;    
					k1_rol = (int) (Math.random() * 360) + 180;  
					if (k1_Xa<50){
						k1_Xb=(int) (Math.random() * width/1.1)+100 ;
						k1_Xa=(int) (Math.random() * width/1.1)+100 ;
						if(Math.abs(k1_Xa-k1_Xb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Xa=k1_Xa+150;
								k1_Xb=k1_Xb-150;
							}
							else{
								k1_Xa=k1_Xa-150;
								k1_Xb=k1_Xb+150;
							}
						k1_Yb = (int) (Math.random() * 99) +1;    		
						if(k1_Yb%2==0)
						{	
							k1_Ya=(int)(-height/5.55);
							k1_Yb=(int)(height+height/5.55);
						}
						else{
							k1_Yb=(int)(-height/5.55);
							k1_Ya=(int)(height+height/5.55);
						}			
					}
					else{
						k1_Ya=(int) (Math.random() * width*1.15)+100 ;
						k1_Yb=(int) (Math.random() * width*1.15)+100 ;
						if(Math.abs(k1_Ya-k1_Yb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Ya=k1_Ya+200;
								k1_Yb=k1_Yb-200;
							}
							else{
								k1_Ya=k1_Ya-200;
								k1_Yb=k1_Yb+200;
							}
						k1_Xb = (int) (Math.random() * 99) +1;    			
						if(k1_Yb%2==0)
						{
							k1_Xa=(int)(-height/6.57);
							k1_Xb=(int)(height-height/6.57);
						}
						else{
							k1_Xb=(int)(-height/6.57);
							k1_Xa=(int)(height-height/6.57);
						}
					}
					k1_sec =3300;  

					a4.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorh4 = ObjectAnimator.ofFloat(a4,"rotation",0,k1_rol);
					ObjectAnimator animatorh5 = ObjectAnimator.ofFloat(a4,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorh6 = ObjectAnimator.ofFloat(a4,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet seth2= new AnimatorSet();
					seth2.playTogether(animatorh4,animatorh5,animatorh6);
					seth2.setDuration(k1_sec);
					seth2.setInterpolator(new LinearInterpolator());
					seth2.start();
					break;
					
					
				case 11:
					num1=0;num2=0;num3=0;num4=0;num5=0;
					k1_sec =2200;
					a2.setVisibility(View.VISIBLE);
					a2.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorh9 = ObjectAnimator.ofFloat(a2,"rotation",0,k1_rol);
					ObjectAnimator animatorh10 = ObjectAnimator.ofFloat(a2,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorh11 = ObjectAnimator.ofFloat(a2,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet seth5= new AnimatorSet();
					seth5.playTogether(animatorh9,animatorh10,animatorh11);
					seth5.setDuration(k1_sec);
					seth5.setInterpolator(new LinearInterpolator());
					seth5.start();
					break;	
					
					
				case 12:
					a2.setVisibility(View.INVISIBLE);
					a4.setVisibility(View.INVISIBLE);
					a1.setVisibility(View.INVISIBLE);
					a3.setVisibility(View.INVISIBLE);
					k1_sec =4200;
					a5.setVisibility(View.VISIBLE);
					a5.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatori1 = ObjectAnimator.ofFloat(a5,"rotation",0,k1_rol);
					ObjectAnimator animatori2 = ObjectAnimator.ofFloat(a5,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatori3 = ObjectAnimator.ofFloat(a5,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet seti= new AnimatorSet();
					seti.playTogether(animatori1,animatori2,animatori3);
					seti.setDuration(k1_sec);
					seti.setInterpolator(new LinearInterpolator());
					seti.start();
					break;	
					
					
				case 13:
					a2.setVisibility(View.VISIBLE);
					a4.setVisibility(View.VISIBLE);
					a1.setVisibility(View.VISIBLE);
					a3.setVisibility(View.VISIBLE);
					k1_sec =4500;
					a5.setVisibility(View.INVISIBLE);
					a1.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorj1 = ObjectAnimator.ofFloat(a1,"rotation",0,k1_rol);
					ObjectAnimator animatorj2 = ObjectAnimator.ofFloat(a1,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorj3 = ObjectAnimator.ofFloat(a1,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setj1= new AnimatorSet();
					setj1.playTogether(animatorj1,animatorj2,animatorj3);
					setj1.setDuration(k1_sec);
					setj1.setInterpolator(new LinearInterpolator());
					setj1.start();
					
					k1_Xa = (int) (Math.random() * 99) +1;    
					k1_rol = (int) (Math.random() * 1000) + 180;  
					if (k1_Xa<50){
						k1_Xb=(int) (Math.random() * width/1.1)+100 ;
						k1_Xa=(int) (Math.random() * width/1.1)+100 ;
						if(Math.abs(k1_Xa-k1_Xb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Xa=k1_Xa+150;
								k1_Xb=k1_Xb-150;
							}
							else{
								k1_Xa=k1_Xa-150;
								k1_Xb=k1_Xb+150;
							}
						k1_Yb = (int) (Math.random() * 99) +1;    		
						if(k1_Yb%2==0)
						{	
							k1_Ya=(int)(-height/5.55);
							k1_Yb=(int)(height+height/5.55);
						}
						else{
							k1_Yb=(int)(-height/5.55);
							k1_Ya=(int)(height+height/5.55);
						}			
					}
					else{
						k1_Ya=(int) (Math.random() * width*1.15)+100 ;
						k1_Yb=(int) (Math.random() * width*1.15)+100 ;
						if(Math.abs(k1_Ya-k1_Yb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Ya=k1_Ya+200;
								k1_Yb=k1_Yb-200;
							}
							else{
								k1_Ya=k1_Ya-200;
								k1_Yb=k1_Yb+200;
							}
						k1_Xb = (int) (Math.random() * 99) +1;    			
						if(k1_Yb%2==0)
						{
							k1_Xa=(int)(-height/6.57);
							k1_Xb=(int)(height-height/6.57);
						}
						else{
							k1_Xb=(int)(-height/6.57);
							k1_Xa=(int)(height-height/6.57);
						}
					}
					
					k1_sec =4500;	
					a2.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorj4 = ObjectAnimator.ofFloat(a2,"rotation",0,k1_rol);
					ObjectAnimator animatorj5 = ObjectAnimator.ofFloat(a2,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorj6 = ObjectAnimator.ofFloat(a2,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setj2= new AnimatorSet();
					setj2.playTogether(animatorj4,animatorj5,animatorj6);
					setj2.setDuration(k1_sec);
					setj2.setInterpolator(new LinearInterpolator());
					setj2.start();
					
					k1_Xa = (int) (Math.random() * 99) +1;    
					k1_rol = (int) (Math.random() * 1000) + 180;  
					if (k1_Xa<50){
						k1_Xb=(int) (Math.random() * width/1.1)+100 ;
						k1_Xa=(int) (Math.random() * width/1.1)+100 ;
						if(Math.abs(k1_Xa-k1_Xb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Xa=k1_Xa+150;
								k1_Xb=k1_Xb-150;
							}
							else{
								k1_Xa=k1_Xa-150;
								k1_Xb=k1_Xb+150;
							}
						k1_Yb = (int) (Math.random() * 99) +1;    		
						if(k1_Yb%2==0)
						{	
							k1_Ya=(int)(-height/5.55);
							k1_Yb=(int)(height+height/5.55);
						}
						else{
							k1_Yb=(int)(-height/5.55);
							k1_Ya=(int)(height+height/5.55);
						}			
					}
					else{
						k1_Ya=(int) (Math.random() * width*1.15)+100 ;
						k1_Yb=(int) (Math.random() * width*1.15)+100 ;
						if(Math.abs(k1_Ya-k1_Yb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Ya=k1_Ya+200;
								k1_Yb=k1_Yb-200;
							}
							else{
								k1_Ya=k1_Ya-200;
								k1_Yb=k1_Yb+200;
							}
						k1_Xb = (int) (Math.random() * 99) +1;    			
						if(k1_Yb%2==0)
						{
							k1_Xa=(int)(-height/6.57);
							k1_Xb=(int)(height-height/6.57);
						}
						else{
							k1_Xb=(int)(-height/6.57);
							k1_Xa=(int)(height-height/6.57);
						}
					}

					k1_sec =4600;	
					a3.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorj7 = ObjectAnimator.ofFloat(a3,"rotation",0,k1_rol);
					ObjectAnimator animatorj8 = ObjectAnimator.ofFloat(a3,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorj9 = ObjectAnimator.ofFloat(a3,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setj3= new AnimatorSet();
					setj3.playTogether(animatorj7,animatorj8,animatorj9);
					setj3.setDuration(k1_sec);
					setj3.setInterpolator(new LinearInterpolator());
					setj3.start();
					
					k1_Xa = (int) (Math.random() * 99) +1;    
					k1_rol = (int) (Math.random() * 1000) + 180;  
					if (k1_Xa<50){
						k1_Xb=(int) (Math.random() * width/1.1)+100 ;
						k1_Xa=(int) (Math.random() * width/1.1)+100 ;
						if(Math.abs(k1_Xa-k1_Xb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Xa=k1_Xa+150;
								k1_Xb=k1_Xb-150;
							}
							else{
								k1_Xa=k1_Xa-150;
								k1_Xb=k1_Xb+150;
							}
						k1_Yb = (int) (Math.random() * 99) +1;    		
						if(k1_Yb%2==0)
						{	
							k1_Ya=(int)(-height/5.55);
							k1_Yb=(int)(height+height/5.55);
						}
						else{
							k1_Yb=(int)(-height/5.55);
							k1_Ya=(int)(height+height/5.55);
						}			
					}
					else{
						k1_Ya=(int) (Math.random() * width*1.15)+100 ;
						k1_Yb=(int) (Math.random() * width*1.15)+100 ;
						if(Math.abs(k1_Ya-k1_Yb)<=400)
							if(k1_Ya>=k1_Yb)
							{
								k1_Ya=k1_Ya+200;
								k1_Yb=k1_Yb-200;
							}
							else{
								k1_Ya=k1_Ya-200;
								k1_Yb=k1_Yb+200;
							}
						k1_Xb = (int) (Math.random() * 99) +1;    			
						if(k1_Yb%2==0)
						{
							k1_Xa=(int)(-height/6.57);
							k1_Xb=(int)(height-height/6.57);
						}
						else{
							k1_Xb=(int)(-height/6.57);
							k1_Xa=(int)(height-height/6.57);
						}
					}

					k1_sec =4600;	
					a4.setBackgroundColor(0xfff1f1f1);
					ObjectAnimator animatorj10 = ObjectAnimator.ofFloat(a4,"rotation",0,k1_rol);
					ObjectAnimator animatorj11 = ObjectAnimator.ofFloat(a4,"translationX",k1_Xa,k1_Xb);
					ObjectAnimator animatorj12 = ObjectAnimator.ofFloat(a4,"translationY",k1_Ya,k1_Yb);
					final AnimatorSet setj4= new AnimatorSet();
					setj4.playTogether(animatorj10,animatorj11,animatorj12);
					setj4.setDuration(k1_sec);
					setj4.setInterpolator(new LinearInterpolator());
					setj4.start();
					break;	
      				default:break;
					}
				}
				
				};
	
	private class TimeThread extends Thread
	{
		@Override
		public void run(){
			Looper.prepare();	
			do{
				if(time!=0){
					try
					{
						Thread.sleep(990);
					}
					catch (InterruptedException e)
					{}
				}
				
			Message msg = new Message();
			         if(time==4){
			msg.what = 1; 
			mHandler.sendMessage(msg);
			     }
				else if(time==10){
					msg.what = 2; 
					mHandler.sendMessage(msg);
				}
				else if(time==15){
					msg.what = 3; 
					mHandler.sendMessage(msg);
				}//stop(1000)
				else if(time==20){
					msg.what = 4; 
					mHandler.sendMessage(msg);
				}
				else if(time==25){
					msg.what = 5; 
					mHandler.sendMessage(msg);
				}//sleep(1000)
				else if(time==31){
					msg.what = 6; 
					mHandler.sendMessage(msg);
				}//sleep(1000)
				else if(time==35){
					msg.what = 7; 
					mHandler.sendMessage(msg);
				}
				else if(time==36){
					msg.what = 8; 
					mHandler.sendMessage(msg);
				}
				else if(time==38){
					msg.what = 9; 
					mHandler.sendMessage(msg);
				}//⑦
				else if(time==43){
					msg.what = 10; 
					mHandler.sendMessage(msg);
				}
				else if(time==45){
					msg.what = 11; 
					mHandler.sendMessage(msg);
				}//sleep(1000)   ⑧
				else if(time==48){
					msg.what = 12; 
					mHandler.sendMessage(msg);
				}
				else if(time==53){
					msg.what = 13; 
					mHandler.sendMessage(msg);
				}	
				else if(time>53){
					Thread.interrupted();
				}
				time=time+1;
			}while(true);
			}
			
			}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		if (keyCode==KeyEvent.KEYCODE_BACK){
			Intent pp1=new Intent();
			pp1.setClass(section_2.this,start.class);
			startActivity(pp1);				
			finish();
		}
		return true;

		
		
		
		
	}
}
