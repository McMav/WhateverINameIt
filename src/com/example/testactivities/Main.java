package com.example.testactivities;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_layout);
		
		
		EditText destination = (EditText) findViewById(R.id.editDestination);
		destination.getEditableText().toString();
				
		Button go = (Button) findViewById(R.id.destinationGo);
		go.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				startActivity(new Intent(Main.this, WhatToBudget.class));
				
			}
		});
		
		
		
		

	}
}
