package com.hyd.zjfb;

import android.app.*;
import android.content.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.avos.avoscloud.*;
import com.hyd.zjfb.*;

public class scorelist extends Activity
{
	private Button g;
	private String name1,name2,name3,name4,name5,name6,name7,name8,
	name9,name10,name11,name12,name13,name14,name15,name16,name17,name18
	,name19,name20,score1,score2,score3,score4,score5,score6,score7,
	score8,score9,score10,score11,score12,score13,score14,score15,score16,
	score17,score18,score19,score20;
    private TextView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,
    a16,a17,a18,a19,a20,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,
    b15,b16,b17,b18,b19,b20;
	private Button a;
	private TextView d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15
	,d16,d17,d18,d19,d20;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.scorelist);
		g=(Button) findViewById(R.id.scorelistButton1);
		
		d1=(TextView) findViewById(R.id.scorelistTextView1);
		d2=(TextView) findViewById(R.id.scorelistTextView2);
		d3=(TextView) findViewById(R.id.scorelistTextView3);
		d4=(TextView) findViewById(R.id.scorelistTextView4);
		d5=(TextView) findViewById(R.id.scorelistTextView5);
		d6=(TextView) findViewById(R.id.scorelistTextView6);
		d7=(TextView) findViewById(R.id.scorelistTextView7);
		d8=(TextView) findViewById(R.id.scorelistTextView8);
		d9=(TextView) findViewById(R.id.scorelistTextView9);
		d10=(TextView) findViewById(R.id.scorelistTextView10);
		d11=(TextView) findViewById(R.id.scorelistTextView11);
		d12=(TextView) findViewById(R.id.scorelistTextView12);
		d13=(TextView) findViewById(R.id.scorelistTextView13);
		d14=(TextView) findViewById(R.id.scorelistTextView14);
		d15=(TextView) findViewById(R.id.scorelistTextView15);
		d16=(TextView) findViewById(R.id.scorelistTextView16);
		d17=(TextView) findViewById(R.id.scorelistTextView17);
		d18=(TextView) findViewById(R.id.scorelistTextView18);
		d19=(TextView) findViewById(R.id.scorelistTextView19);
		d20=(TextView) findViewById(R.id.scorelistTextView20);


        a1=(TextView) findViewById(R.id.scorelistTextViewa1);
		a2=(TextView) findViewById(R.id.scorelistTextViewa2);
		a3=(TextView) findViewById(R.id.scorelistTextViewa3);
		a4=(TextView) findViewById(R.id.scorelistTextViewa4);
		a5=(TextView) findViewById(R.id.scorelistTextViewa5);
		a6=(TextView) findViewById(R.id.scorelistTextViewa6);
		a7=(TextView) findViewById(R.id.scorelistTextViewa7);
		a8=(TextView) findViewById(R.id.scorelistTextViewa8);
		a9=(TextView) findViewById(R.id.scorelistTextViewa9);
		a10=(TextView) findViewById(R.id.scorelistTextViewa10);
		a11=(TextView) findViewById(R.id.scorelistTextViewa11);
		a12=(TextView) findViewById(R.id.scorelistTextViewa12);
		a13=(TextView) findViewById(R.id.scorelistTextViewa13);
		a14=(TextView) findViewById(R.id.scorelistTextViewa14);
		a15=(TextView) findViewById(R.id.scorelistTextViewa15);
		a16=(TextView) findViewById(R.id.scorelistTextViewa16);
		a17=(TextView) findViewById(R.id.scorelistTextViewa17);
		a18=(TextView) findViewById(R.id.scorelistTextViewa18);
		a19=(TextView) findViewById(R.id.scorelistTextViewa19);
		a20=(TextView) findViewById(R.id.scorelistTextViewa20);
		

        b1=(TextView) findViewById(R.id.scorelistTextViewb1);
		b2=(TextView) findViewById(R.id.scorelistTextViewb2);
		b3=(TextView) findViewById(R.id.scorelistTextViewb3);
		b4=(TextView) findViewById(R.id.scorelistTextViewb4);
		b5=(TextView) findViewById(R.id.scorelistTextViewb5);
		b6=(TextView) findViewById(R.id.scorelistTextViewb6);
		b7=(TextView) findViewById(R.id.scorelistTextViewb7);
		b8=(TextView) findViewById(R.id.scorelistTextViewb8);
		b9=(TextView) findViewById(R.id.scorelistTextViewb9);
		b10=(TextView) findViewById(R.id.scorelistTextViewb10);
		b11=(TextView) findViewById(R.id.scorelistTextViewb11);
		b12=(TextView) findViewById(R.id.scorelistTextViewb12);
		b13=(TextView) findViewById(R.id.scorelistTextViewb13);
		b14=(TextView) findViewById(R.id.scorelistTextViewb14);
		b15=(TextView) findViewById(R.id.scorelistTextViewb15);
		b16=(TextView) findViewById(R.id.scorelistTextViewb16);
		b17=(TextView) findViewById(R.id.scorelistTextViewb17);
		b18=(TextView) findViewById(R.id.scorelistTextViewb18);
		b19=(TextView) findViewById(R.id.scorelistTextViewb19);
		b20=(TextView) findViewById(R.id.scorelistTextViewb20);
		
		a=(Button) findViewById(R.id.helpButton1);
		
		
		AVOSCloud.initialize(this, "li8gesgfo0c3xky7br5ziclfsnh5mpxk5c6og2e7sr8kt9au", "uxdxh7ctrq5v9ahvbox1h3tm0ra66p4822fsexx6lm8358ns");
		AVQuery<AVObject> query = new AVQuery<AVObject>("high_score");
		query.getInBackground("55aa3b65e4b0c78cf62e7c32", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name1 = post.getString("Player");
						score1 = post.getString("Value");	
						d1.setText(name1);
                                                a1.setText("01");
						b1.setText(score1);
						} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});
		
		AVQuery<AVObject> query2 = new AVQuery<AVObject>("high_score");
		query2.getInBackground("55aa3b61e4b0c78cf62e7bc0", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name2 = post.getString("Player");
						score2 = post.getString("Value");	
						d2.setText(name2);

                                                a2.setText("02");
						b2.setText(score2);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});
		
		AVQuery<AVObject> query3 = new AVQuery<AVObject>("high_score");
		query3.getInBackground("55aa3b5ce4b0169685c28db0", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name3 = post.getString("Player");
						score3= post.getString("Value");	
						d3.setText(name3);

                                                a3.setText("03");
						b3.setText(score3);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query4 = new AVQuery<AVObject>("high_score");
		query4.getInBackground("55aa3ae1e4b0169685c27f4f", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name4 = post.getString("Player");
						score4 = post.getString("Value");	
						d4.setText(name4);

                                                a4.setText("04");
						b4.setText(score4);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});
			
		AVQuery<AVObject> query5 = new AVQuery<AVObject>("high_score");
		query5.getInBackground("55aa3b4ce4b086039df124a1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name5= post.getString("Player");
						score5= post.getString("Value");	
						d5.setText(name5);

                                                a5.setText("05");
						b5.setText(score5);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query6 = new AVQuery<AVObject>("high_score");
		query6.getInBackground("55aa3b4fe4b0169685c28c30", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name6 = post.getString("Player");
						score6 = post.getString("Value");	
						d6.setText(name6);

                                                a6.setText("06");
						b6.setText(score6);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query7 = new AVQuery<AVObject>("high_score");
		query7.getInBackground("55aa3b54e4b04ab1bb8d1467", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name7 = post.getString("Player");
						score7 = post.getString("Value");	
						d7.setText(name7);

                                                a7.setText("07");
						b7.setText(score7);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query8 = new AVQuery<AVObject>("high_score");
		query8.getInBackground("55aa3b58e4b05e0d58af3332", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name8 = post.getString("Player");
						score8 = post.getString("Value");	
						d8.setText(name8);

                                                a8.setText("08");
						b8.setText(score8);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query9 = new AVQuery<AVObject>("high_score");
		query9.getInBackground("55aa3b6ae4b0fdb84a7038b1", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name9 = post.getString("Player");
						score9 = post.getString("Value");	
						d9.setText(name9);

                                                a9.setText("09");
						b9.setText(score9);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query10 = new AVQuery<AVObject>("high_score");
		query10.getInBackground("55aa3b76e4b05e0d58af364d", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name10 = post.getString("Player");
						score10 = post.getString("Value");	
						d10.setText(name10);

                                                a10.setText("10");
						b10.setText(score10);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query11 = new AVQuery<AVObject>("high_score");
		query11.getInBackground("55aa3b78e4b0c78cf62e7e66", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name11 = post.getString("Player");
						score11 = post.getString("Value");	
						d11.setText(name11);

                                                a11.setText("11");
						b11.setText(score11);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query12 = new AVQuery<AVObject>("high_score");
		query12.getInBackground("55aa3b7be4b0169685c29101", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name12 = post.getString("Player");
						score12 = post.getString("Value");	
						d12.setText(name12);

                                                a12.setText("12");
						b12.setText(score12);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query13 = new AVQuery<AVObject>("high_score");
		query13.getInBackground("55aa3b7ee4b086039df12a4d", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name13 = post.getString("Player");
						score13 = post.getString("Value");	
						d13.setText(name13);

                                                a13.setText("13");
						b13.setText(score13);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query14 = new AVQuery<AVObject>("high_score");
		query14.getInBackground("55aa3b81e4b0c78cf62e7f4b", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name14 = post.getString("Player");
						score14 = post.getString("Value");	
						d14.setText(name14);

                                                a14.setText("14");
						b14.setText(score14);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query15 = new AVQuery<AVObject>("high_score");
		query15.getInBackground("55aa3b84e4b0c78cf62e7f94", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name15 = post.getString("Player");
						score15 = post.getString("Value");	
						d15.setText(name15);

                                                a15.setText("15");
						b15.setText(score15);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query16= new AVQuery<AVObject>("high_score");
		query16.getInBackground("55aa3b88e4b04ab1bb8d1a62", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name16 = post.getString("Player");
						score16 = post.getString("Value");	
						d16.setText(name16);

                                                a16.setText("16");
						b16.setText(score16);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});
			
			
		AVQuery<AVObject> query17 = new AVQuery<AVObject>("high_score");
		query17.getInBackground("55aa3b8ce4b086039df12bcb", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name17 = post.getString("Player");
						score17 = post.getString("Value");	
						d17.setText(name17);


                                                a17.setText("17");
						b17.setText(score17);
					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query18 = new AVQuery<AVObject>("high_score");
		query18.getInBackground("55aa3b8ee4b04ab1bb8d1b10", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name18 = post.getString("Player");
						score18 = post.getString("Value");	
						d18.setText(name18);

                                                a18.setText("18");
						b18.setText(score18);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query19 = new AVQuery<AVObject>("high_score");
		query19.getInBackground("55aa3b91e4b05e0d58af3905", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name19 = post.getString("Player");
						score19 = post.getString("Value");	
						d19.setText(name19);

                                                a19.setText("19");
						b19.setText(score19);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});

		AVQuery<AVObject> query20 = new AVQuery<AVObject>("high_score");
		query20.getInBackground("55aa3b95e4b0169685c293f6", new GetCallback<AVObject>() {
				public void done(AVObject post, AVException e) {
					if (e == null) {
						name20 = post.getString("Player");
						score20 = post.getString("Value");	
						d20.setText(name20);

                                                a20.setText("20");
						b20.setText(score20);

					} else {
						Log.e("错误", "错误: " + e.getMessage());
					}
				}
			});
	   
		a.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(scorelist.this,MainActivity.class);
					startActivity(pp1);				
					finish();
				}
			});
			
			
		g.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent pp1=new Intent();
					pp1.setClass(scorelist.this,scorelist2.class);
					startActivity(pp1);				
					finish();
				}		
			});
			
		}
		}
