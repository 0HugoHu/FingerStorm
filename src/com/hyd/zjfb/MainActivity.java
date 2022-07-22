package com.hyd.zjfb;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.avos.avoscloud.*;
import java.io.*;

public class MainActivity extends Activity
{
	private Button a,b,c;
	private View va,vb,vc,vd;
	private String e,f;
	private String id,user;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		va=findViewById(R.id.mainView1);
		vb=findViewById(R.id.mainView2);
		vc=findViewById(R.id.mainView3);
		vd=findViewById(R.id.mainView4);
	va.setAlpha(0);
		vb.setAlpha(0);
		vc.setAlpha(0);
		vd.setAlpha(0);
		ObjectAnimator animator11 = ObjectAnimator.ofFloat(va,"alpha",0,1);
		ObjectAnimator animator12 = ObjectAnimator.ofFloat(va,"scaleX",0,1);
		ObjectAnimator animator21 = ObjectAnimator.ofFloat(vb,"alpha",0,1);
		ObjectAnimator animator22 = ObjectAnimator.ofFloat(vb,"scaleX",0,1);
		ObjectAnimator animator31 = ObjectAnimator.ofFloat(vc,"alpha",0,1);
		ObjectAnimator animator32 = ObjectAnimator.ofFloat(vc,"scaleY",0,1);
		ObjectAnimator animator41 = ObjectAnimator.ofFloat(vd,"alpha",0,1);
		ObjectAnimator animator42 = ObjectAnimator.ofFloat(vd,"scaleY",0,1);
	
		final AnimatorSet setb= new AnimatorSet();
		setb.playTogether(animator11,animator12,animator21,animator22,animator31,
						  animator32,animator41,animator42);
		setb.setDuration(1250);
		setb.start();
	/*
		File file=new File("/mnt/sdcard/zjfb_BestRecord.txt");
		if(file.isFile() && file.exists()){}
		else {
			//正式版除去以下代码
			final AlertDialog Dialog;
			Dialog = new AlertDialog.Builder(MainActivity.this).create();
			Dialog.show();
			Dialog.getWindow().setContentView(R.layout.dialogx);
			Dialog.getWindow().findViewById(R.id.dialogupButton1)
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Dialog.dismiss();
					}
				});

			//**************
			
		}
		
		
		*/	
		
			
		/*LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);  
		 Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
		 double latitude = location.getLatitude();     //纬度   
		 double longitude = location.getLongitude(); //经度   
		 String g="纬度:" + latitude + "\t经度:" + longitude;
		 */
		
		AVAnalytics.trackAppOpened(getIntent());
		AVOSCloud.initialize(MainActivity.this, "li8gesgfo0c3xky7br5ziclfsnh5mpxk5c6og2e7sr8kt9au", "uxdxh7ctrq5v9ahvbox1h3tm0ra66p4822fsexx6lm8358ns");
		AVObject loginObject = new AVObject("login_data");
		e=android.os.Build.MODEL;
		f=android.os.Build.VERSION.RELEASE;
		loginObject.put("ID",e);
		loginObject.put("Android_Version",f);
		loginObject.put("Location","null");
		loginObject.saveInBackground();
	
		
		try{
			File fr=new File("/mnt/sdcard/zjfb_user.txt");
				if(fr.isFile() && fr.exists()){ //判断文件是否存在
					InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
					BufferedReader bufferedReader = new BufferedReader(read);
					id=bufferedReader.readLine();
					read.close();				
						}

			}catch (Exception g)
			{}	
			
		//更新云端数据样例:
		/*
		AVQuery<AVObject> query = new AVQuery<AVObject>("high_score");

		query.getInBackground("55aa3b78e4b0c78cf62e7e66", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player", ""+"Hu Yadong");
						post.put("Value" , ""+"10000");
						post.saveInBackground();
						
					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});
	
			
			*/
			if(id!="null"){				
		Toast.makeText(MainActivity.this,"欢迎回来\t "+id,Toast.LENGTH_SHORT).show();
		}
		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score");
		query20.getInBackground("55aa3b95e4b0169685c293f6", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException i) {
					if (i == null) {
					String 	score20 = post.getString("Value");
						try
						{
							FileWriter fk=new FileWriter("/mnt/sdcard/zjfb_least.txt");			
							File fr=new File("/mnt/sdcard/zjfb_least.txt");

							InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
								BufferedReader bufferedReader = new BufferedReader(read);
								
								BufferedWriter fw = null;
								try {
									File ft=new File("/mnt/sdcard/zjfb_least.txt");
									fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ft, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
									fw.append(score20);
									fw.newLine();
									fw.flush(); 
								} catch (Exception f) {
									f.printStackTrace();
								} finally {
									if (fw != null) {
										try {
											fw.close();
										} catch (IOException e) {
											e.printStackTrace();
										}
									}
								}	
							
							
								
							
						}catch (Exception g)
						{}	
						
					
					} else {
						Log.i("错误", "错误: " + i.getMessage());
					}
				}
			});
			
			
			
		 AVQuery<AVObject> query220 = new AVQuery<AVObject>("high_score2");
		 query220.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
		 public void done(AVObject post, AVException i) {
		 if (i == null) {
		 String 	score220 = post.getString("Value");
		 try
		 {
		 FileWriter fk=new FileWriter("/mnt/sdcard/zjfb_least2.txt");			
		 File fr=new File("/mnt/sdcard/zjfb_least2.txt");

		 InputStreamReader read=new InputStreamReader(new  FileInputStream(fr),"GBK");
		 BufferedReader bufferedReader = new BufferedReader(read);

		 BufferedWriter fw = null;
		 try {
		 File ft=new File("/mnt/sdcard/zjfb_least2.txt");
		 fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ft, true), "UTF-8")); // 指定编码格式，以免读取时中文字符异常
		 fw.append(score220);
		 fw.newLine();
		 fw.flush(); 
		 } catch (Exception f) {
		 f.printStackTrace();
		 } finally {
		 if (fw != null) {
		 try {
		 fw.close();
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 }
		 }	




		 }catch (Exception g)
		 {}	


		 } else {
		 Log.i("错误", "错误: " + i.getMessage());
		 }
		 }
		 });
		
			AVQuery<AVObject> query = new AVQuery<AVObject>("id_state");
			query.getInBackground("55b3737900b078803793e2fc", new GetCallback<AVObject>() {
					public void done(AVObject post, AVException i) {
						if (i == null) {	
							int state=post.getInt(id);
		                 if(state==1)
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
							File fq=new File("/mnt/sdcard/zjfb_BestRecord2.txt");		
								 File fpl=new File("/mnt/sdcard/zjfb_least2.txt");
                                        
                                        File fq1=new File("/mnt/sdcard/zjfb_redstar.txt");
                                        File fq2=new File("/mnt/sdcard/zjfb_yellowstar.txt");
                                        File fq3=new File("/mnt/sdcard/zjfb_whiteblocks.txt");
                                       if(fpl.exists())
						fpl.delete();	
                                      
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
							File f = new File("/mnt/sdcard/zjfb_BestRecord.txt"); 
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
							if(fq.exists())
									fq.delete();	

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
							
							
							
						}
					 
					 
					 }}});
			
			
		a=(Button) findViewById(R.id.mainButton1);
		b=(Button) findViewById(R.id.mainButton2);
		c=(Button) findViewById(R.id.mainButton3);

		b.setAlpha(0);
		c.setAlpha(0);
		a.setAlpha(0);
		ObjectAnimator animatora1 = ObjectAnimator.ofFloat(a,"alpha",0,1);
		ObjectAnimator animatora2 = ObjectAnimator.ofFloat(b,"alpha",0,1);
		ObjectAnimator animatora3 = ObjectAnimator.ofFloat(c,"alpha",0,1);
		final AnimatorSet seta= new AnimatorSet();
		seta.playTogether(animatora1,animatora2,animatora3);
		seta.setDuration(850);
		seta.start();


		a.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(MainActivity.this,start.class);
					startActivity(pp1);				
					finish();
				}
			});
		b.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(MainActivity.this,scorelist.class);
					startActivity(pp1);				
					finish();
				}
			});
		c.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(MainActivity.this,setting.class);
					startActivity(pp1);				
					finish();
				}
			});
			
	
			}
			}
	//
	
	
			
