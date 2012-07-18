package com.example.testactivities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class Button2Click extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.button2screen);
		
		ImageView goodjob = (ImageView) findViewById(R.id.imageView1);
		goodjob.setImageResource(R.drawable.good_job);
		
		
		
	}
	
	

}
