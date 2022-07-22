package com.hyd.zjfb;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.hyd.zjfb.*;

public class section_1_5 extends Activity
{
	private Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
	private TextView q,r,s,t,u;
	private MyCount mc;
	private MyCount_2 mt;
	private boolean flag=true;
	private boolean flaga,flagb,flagc,flagd,flage,flagf,flagg,
	flagh,flagi,flagj,flagk,flagl,flagm,flagn,
	flago,flagp;
    private int score=0,if_wait=0,if_finish=0,sc=0,all=0;
	long score_e=0;
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_1);

		a=(Button) findViewById(R.id.startButton1);
		b=(Button) findViewById(R.id.startButton2);
		c=(Button) findViewById(R.id.startButton3);
		d=(Button) findViewById(R.id.startButton4);
		e=(Button) findViewById(R.id.startButton5);
		f=(Button) findViewById(R.id.startButton6);
		g=(Button) findViewById(R.id.startButton7);
		h=(Button) findViewById(R.id.startButton8);
		i=(Button) findViewById(R.id.startButton9);
		j=(Button) findViewById(R.id.startButton10);
		k=(Button) findViewById(R.id.startButton11);
		l=(Button) findViewById(R.id.startButton12);
		m=(Button) findViewById(R.id.startButton13);
		n=(Button) findViewById(R.id.startButton14);
		o=(Button) findViewById(R.id.startButton15);
		p=(Button) findViewById(R.id.startButton16);

		q=(TextView) findViewById(R.id.section1TextView1);
		r=(TextView) findViewById(R.id.section1TextView2);
		s=(TextView) findViewById(R.id.section1TextView3);
		t=(TextView) findViewById(R.id.section1TextView5);
		u=(TextView) findViewById(R.id.section1TextView6);

		Bundle bundle = this.getIntent().getExtras();
		score=bundle.getInt("result_s1");
		t.setText(""+score);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{}
		mc = new MyCount(10, 10);   
        mc.start(); 
		mt = new MyCount_2(1700,10);
		mt.start();

		//产生第一回合随机数
		int min=1;int max=16;int nn=9;	
		int[] result = new int[nn];  
		int count = 0;  
		while(count < nn) {  
			int num = (int) (Math.random() * (max - min)) + min;  
			boolean flag = true;  
			for (int jj = 0; jj < nn; jj++) {  
				if(num == result[jj]){  
					flag = false;  
					break;  
				}  
			}  
			if(flag){  
				result[count] = num;  
				count++;  
			}  
		}  

		flaga=flagb=flagc=flagd=flage=flagf=flagg=flagh=flagi=flagj=
			flagk=flagl=flagm=flagn=flago=flagp=false;

		if(result[1]==1||result[2]==1||result[3]==1||result[4]==1||
		   result[5]==1||result[6]==1||result[7]==1||result[0]==1)
		{
			flaga=true;
		}
		else 
		{
			a.setVisibility(View.INVISIBLE);
		}

		if(result[1]==2||result[2]==2||result[3]==2||result[4]==2||
		   result[5]==2||result[6]==2||result[7]==2||result[0]==2)
		{
			flagb=true;
		}
		else 
		{
			b.setVisibility(View.INVISIBLE);
		}
		if(result[1]==3||result[2]==3||result[3]==3||result[4]==3||
		   result[5]==3||result[6]==3||result[7]==3||result[0]==3)
		{
			flagc=true;
		}
		else 
		{
			c.setVisibility(View.INVISIBLE);
		}

		if(result[1]==4||result[2]==4||result[3]==4||result[4]==4||
		   result[5]==4||result[6]==4||result[7]==4||result[0]==4)
		{
			flagd=true;
		}
		else 
		{
			d.setVisibility(View.INVISIBLE);
		}


		if(result[1]==5||result[2]==5||result[3]==6||result[4]==7||
		   result[5]==5||result[6]==5||result[7]==6||result[0]==7)
		{
			flage=true;
		}
		else 
		{
			e.setVisibility(View.INVISIBLE);
		}

		if(result[1]==6||result[2]==6||result[3]==6||result[4]==6||
		   result[5]==6||result[6]==6||result[7]==6||result[0]==6)
		{
			flagf=true;
		}
		else 
		{
			f.setVisibility(View.INVISIBLE);
		}

		if(result[1]==7||result[2]==7||result[3]==7||result[4]==7||
		   result[5]==7||result[6]==7||result[7]==7||result[0]==7)
		{
			flagg=true;
		}
		else 
		{
			g.setVisibility(View.INVISIBLE);
		}

		if(result[1]==8||result[2]==8||result[3]==8||result[4]==8||
		   result[5]==8||result[6]==8||result[7]==8||result[0]==8)
		{
			flagh=true;
		}
		else 
		{
			h.setVisibility(View.INVISIBLE);
		}

		if(result[1]==9||result[2]==9||result[3]==9||result[4]==9||
		   result[5]==9||result[6]==9||result[7]==9||result[0]==9)
		{
			flagi=true;
		}
		else 
		{
			i.setVisibility(View.INVISIBLE);
		}

		if(result[1]==10||result[2]==10||result[3]==10||result[4]==10||
		   result[5]==10||result[6]==10||result[7]==10||result[0]==10)
		{
			flagj=true;
		}
		else 
		{
			j.setVisibility(View.INVISIBLE);
		}

		if(result[1]==11||result[2]==11||result[3]==11||result[4]==11||
		   result[5]==11||result[6]==11||result[7]==11||result[0]==11)
		{
			flagk=true;
		}
		else 
		{
			k.setVisibility(View.INVISIBLE);
		}

		if(result[1]==12||result[2]==12||result[3]==12||result[4]==12||
		   result[5]==12||result[6]==12||result[7]==12||result[0]==12)
		{
			flagl=true;
		}
		else 
		{
			l.setVisibility(View.INVISIBLE);
		}

		if(result[1]==13||result[2]==13||result[3]==13||result[4]==13||
		   result[5]==13||result[6]==13||result[7]==13||result[0]==13)
		{
			flagm=true;
		}
		else 
		{
			m.setVisibility(View.INVISIBLE);
		}

		if(result[1]==14||result[2]==14||result[3]==14||result[4]==14||
		   result[5]==14||result[6]==14||result[7]==14||result[0]==14)
		{
			flagn=true;
		}
		else 
		{
			n.setVisibility(View.INVISIBLE);
		}

		if(result[1]==15||result[2]==15||result[3]==15||result[4]==15||
		   result[5]==15||result[6]==15||result[7]==15||result[0]==15)
		{
			flago=true;
		}
		else 
		{
			o.setVisibility(View.INVISIBLE);
		}

		if(result[1]==16||result[2]==16||result[3]==16||result[4]==16||
		   result[5]==16||result[6]==16||result[7]==16||result[0]==16)
		{
			flagp=true;
		}
		else 
		{
			p.setVisibility(View.INVISIBLE);
		}

		a.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flaga==true && if_wait==1 && if_finish!=1)
					{
						score=score+490;
						flaga=false;
						a.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		b.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagb==true && if_wait==1 && if_finish!=1)
					{
						score=score+500;
						flagb=false;
						b.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		c.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagc==true && if_wait==1 && if_finish!=1)
					{
						score=score+600;
						flagc=false;
						c.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		d.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagd==true && if_wait==1 && if_finish!=1)
					{
						score=score+490;
						flagd=false;
						d.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		e.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flage==true && if_wait==1 && if_finish!=1)
					{
						score=score+470;
						flage=false;
						e.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		f.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagf==true && if_wait==1 && if_finish!=1)
					{
						score=score+500;
						flagf=false;
						f.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		g.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagg==true && if_wait==1 && if_finish!=1)
					{
						score=score+480;
						flagg=false;
						g.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		h.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagh==true && if_wait==1 && if_finish!=1)
					{
						score=score+510;
						flagh=false;	
						h.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		i.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagi==true && if_wait==1 && if_finish!=1)
					{
						score=score+550;
						flagi=false;
						i.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		j.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagj==true && if_wait==1 && if_finish!=1)
					{
						score=score+550;
						flagj=false;	
						j.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		k.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagk==true && if_wait==1 && if_finish!=1)
					{
						score=score+500;
						flagk=false;
						k.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		l.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagl==true && if_wait==1 && if_finish!=1)
					{
						score=score+490;
						flagl=false;
						l.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		m.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagm==true && if_wait==1 && if_finish!=1)
					{
						score=score+500;
						flagm=false;
						m.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		n.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagn==true && if_wait==1 && if_finish!=1)
					{
						score=score+460;
						flagn=false;
						n.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		o.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flago==true && if_wait==1 && if_finish!=1)
					{
						score=score+420;
						flago=false;
						o.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});

		p.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					if(flagp==true && if_wait==1 && if_finish!=1)
					{
						score=score+520;
						flagp=false;
						p.setVisibility(View.INVISIBLE);
						t.setText(score+"");
					}
				}
			});


    } 





    /*定义一个倒计时的内部类*/   
    class MyCount extends CountDownTimer {      
        public MyCount(long millisInFuture, long countDownInterval) {      
            super(millisInFuture, countDownInterval);      
        }      
        @Override      
        public void onFinish() {      
			q.setText("进度");
			u.setText("5/5");
			all=1;
			if_wait=1;

        }      
        @Override      
        public void onTick(long millisUntilFinished) {    
			int mllis =(int)millisUntilFinished/1000;
            u.setText(""+mllis);  
			q.setText("准备");
		}     
    }      

	class MyCount_2 extends CountDownTimer {      
        public MyCount_2(long millisInFuture, long countDownInterval) {      
            super(millisInFuture, countDownInterval);      
        }      
        @Override      
        public void onFinish() {  
		    if_finish=1;
            s.setText("结束"); 
			if(flag=true){
		Intent pp1=new Intent();
			pp1.setClass(section_1_5.this,section_1_result.class);
			Bundle bundle= new Bundle();
			bundle.putInt("result_s1",score);
			pp1.putExtras(bundle);	
			startActivity(pp1);				
			finish();
			}
        }      
        @Override      
        public void onTick(long millisUntilFinished) {    
			int mllis =(int)millisUntilFinished/1000;
			score_e=millisUntilFinished/1000*1500;
			if(all==1)
				s.setText(""+mllis); 
			if(flaga==false&&flagb==false&&flagc==false&&flagd==false
			   &&flage==false&&flagf==false&&flagg==false&&flagh==false&&
			   flagi==false&&flagj==false&&flagk==false&&flagl==false&&
			   flagm==false&&flagn==false&&flago==false&&flagp==false&&sc==0)
			{
				sc=1;
				score=(int)(score+score_e);
				t.setText(""+score);
			}

			
				
		}     
    }      
    /*定义结束*/

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		if (keyCode==KeyEvent.KEYCODE_BACK){
			flag=false;
			Intent pp1=new Intent();
			pp1.setClass(section_1_5.this,start.class);
			startActivity(pp1);				
			finish();
		}
		return true;

	}
	
}
