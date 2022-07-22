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

public class upload2 extends Activity
{
	private Button btn;
	private TextView txv;
	private boolean flag=true,flag2=true;
	private String score,user;
	private int a=0,ut=0;
	private int score_;
	private String name1,name2,name3,name4,name5,name6,name7,name8,
	name9,name10,name11,name12,name13,name14,name15,name16,name17,name18
	,name19,name20;
	private int score1=0,score2=0,score3=0,score4=0,score5=0,score6=0,score7=0,
	score8=0,score9=0,score10=0,score11=0,score12=0,score13=0,score14=0,score15=0,score16=0,
	score17=0,score18=0,score19=0,score20=0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload);
		AVOSCloud.initialize(upload2.this, "li8gesgfo0c3xky7br5ziclfsnh5mpxk5c6og2e7sr8kt9au", "uxdxh7ctrq5v9ahvbox1h3tm0ra66p4822fsexx6lm8358ns");
		
		Bundle bundle = this.getIntent().getExtras();
		score=""+bundle.getInt("result_s2");	
		user=bundle.getString("player");	
		score_=	Integer.parseInt(score);
		btn=(Button) findViewById(R.id.helpButton1);
		txv=(TextView) findViewById(R.id.uploadTextView1);
		btn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(upload2.this,scorelist2.class);
					startActivity(pp1);				
					finish();
				}
			});
		File fl=new File("/mnt/sdcard/zjfb_a_ut.txt");
		try{
			if(fl.isFile() && fl.exists()){ //�ж��ļ��Ƿ����
				InputStreamReader read=new InputStreamReader(new  FileInputStream(fl),"GBK");
				BufferedReader bufferedReader = new BufferedReader(read);
				ut =Integer.parseInt( bufferedReader.readLine());
				read.close();
				FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_a_ut.txt");  	
				BufferedWriter fw = null;
				try {
					fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fl, true), "UTF-8")); // ָ�������ʽ�������ȡʱ�����ַ��쳣
					ut=ut+1;
					fw.append(ut+"");
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
				
					FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_a_ut.txt");
			  	
				BufferedWriter fw = null;
				try {
					File fa=new File("/mnt/sdcard/zjfb_a_ut.txt");
					fw= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fa, true), "UTF-8")); // ָ�������ʽ�������ȡʱ�����ַ��쳣
					fw.append("1");
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
		
			new Thread1().start();
			new TimeThread().start();
	
			
			
		}
		
		private class Thread1 extends Thread
		{
			@Override
			public void run(){
				Looper.prepare();
				//����������??				
				
    
				AVQuery<AVObject> query = new AVQuery<AVObject>("high_score2");
				query.getInBackground("55c8107460b26267207cb629", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name1 = post.getString("Player");
					score1 =Integer.parseInt(  post.getString("Value"));	
					a++;
								} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query2 = new AVQuery<AVObject>("high_score2");
				query2.getInBackground("55c8107e60b2f45c35e1dd72", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name2 = post.getString("Player");
					score2 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query3 = new AVQuery<AVObject>("high_score2");
				query3.getInBackground("55c8107f00b08448d87bb9a8", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name3 = post.getString("Player");
					score3=Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query4 = new AVQuery<AVObject>("high_score2");
				query4.getInBackground("55c8108000b099ad49826d4c", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name4 = post.getString("Player");
					score4 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query5 = new AVQuery<AVObject>("high_score2");
				query5.getInBackground("55c8108200b08448d87bb9e8", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name5= post.getString("Player");
					score5=Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query6 = new AVQuery<AVObject>("high_score2");
				query6.getInBackground("55c8108340acda2c9de072ab", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name6 = post.getString("Player");
					score6 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query7 = new AVQuery<AVObject>("high_score2");
				query7.getInBackground("55c8108360b215d6b78850f3", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name7 = post.getString("Player");
					score7 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query8 = new AVQuery<AVObject>("high_score2");
				query8.getInBackground("55c8108460b2f45c35e1de10", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name8 = post.getString("Player");
					score8 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});


				AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score2");
				query9.getInBackground("55c8108560b243ec955469f1", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name9 = post.getString("Player");
					score9 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
				query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name10 = post.getString("Player");
					score10 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
				query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name11 = post.getString("Player");
					score11 =Integer.parseInt(  post.getString("Value"));	
								a++;
                            } else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
				query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name12 = post.getString("Player");
					score12 =Integer.parseInt(  post.getString("Value"));	
				a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});


				AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
				query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name13 = post.getString("Player");
					score13 =Integer.parseInt(  post.getString("Value"));	
								a++;		
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
				query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name14 = post.getString("Player");
					score14 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
				query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name15 = post.getString("Player");
					score15 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
				query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name16 = post.getString("Player");
					score16 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});


				AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
				query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name17 = post.getString("Player");
					score17 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
				query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name18 = post.getString("Player");
					score18 =Integer.parseInt(  post.getString("Value"));	
								//Toast.makeText(upload2.this,"����ʹ�ù�ü�����??+score18,Toast.LENGTH_LONG).show();
								a++;
								
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
				query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name19 = post.getString("Player");
					score19 =Integer.parseInt(  post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});

				AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
				query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
						public void done(AVObject post, AVException e) {
							if (e == null) {
								name20 = post.getString("Player");
					score20 =Integer.parseInt( post.getString("Value"));	
								a++;
							} else {
								Log.e("����", "����: " + e.getMessage());
							}
						}
					});
			/*	
				if(score20!=0)
				{
					Toast.makeText(upload2.this,"����ʹ�ù�ü�����??+score20,Toast.LENGTH_LONG).show();
				
				try
				{File fr=new File("/mnt/sdcard/zjfb_hehe.txt");

					FileWriter ft=new FileWriter("/mnt/sdcard/zjfb_hehe.txt");

					BufferedWriter fw = null;
					try {
						fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fr, true), "UTF-8")); // ָ�������ʽ�������ȡʱ�����ַ��쳣
						fw.append(score20+"");
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
				catch (IOException e)
				{}		
				}
				
			*/
				
			}//run����
			
		}//Thread����
		
	private class Thread2 extends Thread
	{
		@Override
		public void run(){
			do{
			
			Looper.prepare();
			Toast.makeText(upload2.this,"��ĵ÷�:"+score_+"\n����??0�ĵ�??"+score20,Toast.LENGTH_LONG).show();
			
			if(score_>score20)
			{
					
			}	

			} while(flag2==false);
		}//run����	
		}//Thread2����
		
		
	class TimeThread extends Thread {
        @Override
        public void run() {
            do {
                try {
                    Thread.sleep(1000);
                    Message msg = new Message();
					if(flag==false)
					{
						if(flag2==true)
						msg.what=2;
						flag2=false;
					}
					else
					{
                    msg.what = 1;  //��Ϣ(һ������??
					}
                    mHandler.sendMessage(msg);// ÿ��1�뷢��һ��msg��mHandler
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (true);
        }
    }

	private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
				case 1:
					if(score1==0||score5==0||score10==0||score15==0||score20==0||
					   score2==0||score8==0||score14==0||score20==0||name10=="null"||
					   score3==0||score9==0||score16==0||name1=="null"||name12=="null"||
					   score4==0||score11==0||score17==0||name2=="null"||name14=="null"||
					   score6==0||score12==0||score18==0||name3=="null"||name17=="null"||
					   score7==0||score13==0||score19==0||name4=="null"||name20=="null"
					   )
					   {}
					   else{
						   
						  if(flag==true)
						   {
					
							   flag=false;
						   }
						   
					   }
					
					break;
				case 2:
					
					//�Ƚϣ����µ�??					
                            if(score_>score1)
		            {
                             AVQuery<AVObject> query = new AVQuery<AVObject>("high_score2");
		query.getInBackground("55c8107460b26267207cb629", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
						} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
		
		AVQuery<AVObject> query2 = new AVQuery<AVObject>("high_score2");
		query2.getInBackground("55c8107e60b2f45c35e1dd72", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name1);
						post.put("Value",score1+"");

                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
		
		AVQuery<AVObject> query3 = new AVQuery<AVObject>("high_score2");
		query3.getInBackground("55c8107f00b08448d87bb9a8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name2);
						post.put("Value",score2+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query4 = new AVQuery<AVObject>("high_score2");
		query4.getInBackground("55c8108000b099ad49826d4c", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name3);
						post.put("Value",score3+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
		AVQuery<AVObject> query5 = new AVQuery<AVObject>("high_score2");
		query5.getInBackground("55c8108200b08448d87bb9e8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name4);
						post.put("Value",score4+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query6 = new AVQuery<AVObject>("high_score2");
		query6.getInBackground("55c8108340acda2c9de072ab", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name5);
						post.put("Value",score5+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query7 = new AVQuery<AVObject>("high_score2");
		query7.getInBackground("55c8108360b215d6b78850f3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name6);
						post.put("Value",score6+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query8 = new AVQuery<AVObject>("high_score2");
		query8.getInBackground("55c8108460b2f45c35e1de10", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name7);
						post.put("Value",score7+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score2");
		query9.getInBackground("55c8108560b243ec955469f1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name8);
						post.put("Value",score8+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
		query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name9);
						post.put("Value",score9+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",name10);
						post.put("Value",score10+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
			     }	
			
			else  if(score_>score2)
		            {
                             
		
		AVQuery<AVObject> query2 = new AVQuery<AVObject>("high_score2");
		query2.getInBackground("55c8107e60b2f45c35e1dd72", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
		
		AVQuery<AVObject> query3 = new AVQuery<AVObject>("high_score2");
		query3.getInBackground("55c8107f00b08448d87bb9a8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name2);
						post.put("Value",score2+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query4 = new AVQuery<AVObject>("high_score2");
		query4.getInBackground("55c8108000b099ad49826d4c", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name3);
						post.put("Value",score3+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
		AVQuery<AVObject> query5 = new AVQuery<AVObject>("high_score2");
		query5.getInBackground("55c8108200b08448d87bb9e8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name4);
						post.put("Value",score4+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query6 = new AVQuery<AVObject>("high_score2");
		query6.getInBackground("55c8108340acda2c9de072ab", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name5);
						post.put("Value",score5+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query7 = new AVQuery<AVObject>("high_score2");
		query7.getInBackground("55c8108360b215d6b78850f3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name6);
						post.put("Value",score6+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query8 = new AVQuery<AVObject>("high_score2");
		query8.getInBackground("55c8108460b2f45c35e1de10", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name7);
						post.put("Value",score7+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score2");
		query9.getInBackground("55c8108560b243ec955469f1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name8);
						post.put("Value",score8+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
		query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name9);
						post.put("Value",score9+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",name10);
						post.put("Value",score10+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	
			



			else if(score_>score3)
		            {
                             
		
		AVQuery<AVObject> query3 = new AVQuery<AVObject>("high_score2");
		query3.getInBackground("55c8107f00b08448d87bb9a8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query4 = new AVQuery<AVObject>("high_score2");
		query4.getInBackground("55c8108000b099ad49826d4c", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name3);
						post.put("Value",score3+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
		AVQuery<AVObject> query5 = new AVQuery<AVObject>("high_score2");
		query5.getInBackground("55c8108200b08448d87bb9e8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name4);
						post.put("Value",score4+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query6 = new AVQuery<AVObject>("high_score2");
		query6.getInBackground("55c8108340acda2c9de072ab", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name5);
						post.put("Value",score5+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query7 = new AVQuery<AVObject>("high_score2");
		query7.getInBackground("55c8108360b215d6b78850f3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name6);
						post.put("Value",score6+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query8 = new AVQuery<AVObject>("high_score2");
		query8.getInBackground("55c8108460b2f45c35e1de10", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name7);
						post.put("Value",score7+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score2");
		query9.getInBackground("55c8108560b243ec955469f1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name8);
						post.put("Value",score8+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
		query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name9);
						post.put("Value",score9+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",name10);
						post.put("Value",score10+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	
			


            else   if(score_>score4)
		            {
                             
		
		
		AVQuery<AVObject> query4 = new AVQuery<AVObject>("high_score2");
		query4.getInBackground("55c8108000b099ad49826d4c", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
		AVQuery<AVObject> query5 = new AVQuery<AVObject>("high_score2");
		query5.getInBackground("55c8108200b08448d87bb9e8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name4);
						post.put("Value",score4+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query6 = new AVQuery<AVObject>("high_score2");
		query6.getInBackground("55c8108340acda2c9de072ab", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name5);
						post.put("Value",score5+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query7 = new AVQuery<AVObject>("high_score2");
		query7.getInBackground("55c8108360b215d6b78850f3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name6);
						post.put("Value",score6+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query8 = new AVQuery<AVObject>("high_score2");
		query8.getInBackground("55c8108460b2f45c35e1de10", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name7);
						post.put("Value",score7+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score2");
		query9.getInBackground("55c8108560b243ec955469f1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name8);
						post.put("Value",score8+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
		query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name9);
						post.put("Value",score9+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",name10);
						post.put("Value",score10+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	
			
			

 else if(score_>score5)
		            {
                             
		
		
			
		AVQuery<AVObject> query5 = new AVQuery<AVObject>("high_score2");
		query5.getInBackground("55c8108200b08448d87bb9e8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query6 = new AVQuery<AVObject>("high_score2");
		query6.getInBackground("55c8108340acda2c9de072ab", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name5);
						post.put("Value",score5+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query7 = new AVQuery<AVObject>("high_score2");
		query7.getInBackground("55c8108360b215d6b78850f3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name6);
						post.put("Value",score6+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query8 = new AVQuery<AVObject>("high_score2");
		query8.getInBackground("55c8108460b2f45c35e1de10", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name7);
						post.put("Value",score7+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score2");
		query9.getInBackground("55c8108560b243ec955469f1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name8);
						post.put("Value",score8+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
		query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name9);
						post.put("Value",score9+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",name10);
						post.put("Value",score10+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
			     }	
			



else if(score_>score6)
		            {
                             
		
		
		
		AVQuery<AVObject> query6 = new AVQuery<AVObject>("high_score2");
		query6.getInBackground("55c8108340acda2c9de072ab", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query7 = new AVQuery<AVObject>("high_score2");
		query7.getInBackground("55c8108360b215d6b78850f3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name6);
						post.put("Value",score6+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query8 = new AVQuery<AVObject>("high_score2");
		query8.getInBackground("55c8108460b2f45c35e1de10", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name7);
						post.put("Value",score7+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score2");
		query9.getInBackground("55c8108560b243ec955469f1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name8);
						post.put("Value",score8+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
		query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name9);
						post.put("Value",score9+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",name10);
						post.put("Value",score10+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
				
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();	
			     }	


else if(score_>score7)
		            {
                             
		
		
		AVQuery<AVObject> query7 = new AVQuery<AVObject>("high_score2");
		query7.getInBackground("55c8108360b215d6b78850f3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query8 = new AVQuery<AVObject>("high_score2");
		query8.getInBackground("55c8108460b2f45c35e1de10", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name7);
						post.put("Value",score7+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score2");
		query9.getInBackground("55c8108560b243ec955469f1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name8);
						post.put("Value",score8+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
		query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name9);
						post.put("Value",score9+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",name10);
						post.put("Value",score10+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	
else if(score_>score8)
		            {
                             
		
		

		AVQuery<AVObject> query8 = new AVQuery<AVObject>("high_score2");
		query8.getInBackground("55c8108460b2f45c35e1de10", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score2");
		query9.getInBackground("55c8108560b243ec955469f1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name8);
						post.put("Value",score8+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
		query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name9);
						post.put("Value",score9+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",name10);
						post.put("Value",score10+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	

else if(score_>score9)
		            {
                             
		
		
			
		AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score2");
		query9.getInBackground("55c8108560b243ec955469f1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
		query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name9);
						post.put("Value",score9+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",name10);
						post.put("Value",score10+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                              
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish(); 
					
			     }	

else if(score_>score10)
		            {
                             
		
		
		

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score2");
		query10.getInBackground("55c8108b60b26267207cb880", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",name10);
						post.put("Value",score10+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	


else if(score_>score11)
		            {
                             
				
		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score2");
		query11.getInBackground("55c8108c60b2f45c35e1dee2", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
                                                post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name11);
						post.put("Value",score11+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	

else if(score_>score12)
		            {
                             
		
		
		
		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score2");
		query12.getInBackground("55c8108e60b204d5a9d218fd", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name12);
						post.put("Value",score12+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	

else if(score_>score13)
		            {
                             
		
		
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score2");
		query13.getInBackground("55c8108f60b25b794b99ff8f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name13);
						post.put("Value",score13+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	


else if(score_>score14)
		            {
                             
		
		
		
		
		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score2");
		query14.getInBackground("55c8109060b2e41678568da3", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name14);
						post.put("Value",score14+"");
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
				
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();	
			     }	

else if(score_>score15)
		            {
                             
		
		
		

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score2");
		query15.getInBackground("55c8109140acda2c9de07427", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();

					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name15);
						post.put("Value",score15+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	


else if(score_>score16)
		            {
                             
		
		
		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score2");
		query16.getInBackground("55c8109e60b25b04dc915462", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name16);
						post.put("Value",score16+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	


else if(score_>score17)
		            {
              
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score2");
		query17.getInBackground("55c8109f60b2e41678568f17", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name17);
						post.put("Value",score17+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	

else if(score_>score18)
		            {
                             
		
		
		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score2");
		query18.getInBackground("55c810a060b204d5a9d21ad9", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name18);
						post.put("Value",score18+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	


else if(score_>score19)
		            {
                             
		

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score2");
		query19.getInBackground("55c810a260b2298f8dbf0ba8", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",name19);
						post.put("Value",score19+"");
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	


else if(score_>score20)
		            {
                             
		
		
		
		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score2");
		query20.getInBackground("55c810a360b215d6b788545b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						post.put("Player",user);
						post.put("Value",score);
                                                post.saveInBackground();
					} else {
						Log.e("????", "????: " + e.getMessage());
					}
				}
			});
                               
					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,MainActivity.class);
                                        startActivity(pp1);
                                        finish();
					
			     }	
else{
                 Toast.makeText(upload2.this,"????????????????101",Toast.LENGTH_SHORT).show();

					Intent pp1=new Intent();
                                        pp1.setClass(upload2.this,scorelist.class);
                                        startActivity(pp1);
                                        finish();
    }
					break;
					
					default:break;
					}
					}
					};
					
		
		}
