package com.example.testactivities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SetAmounts extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.set_amounts_layout);
		
		TextView title = (TextView) findViewById(R.id.textView1);
		title.setText("Set Amounts");
		
	}

}
