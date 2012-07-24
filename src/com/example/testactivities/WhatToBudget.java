package com.example.testactivities;

import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;

public class WhatToBudget extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.whattobudget);
		

// START OF LIST VIEW
		ListView list = (ListView) findViewById(R.id.whatToShowList);		
		list.setAdapter(new SelectAdapter(this, 
				android.R.layout.simple_list_item_1,R.id.checkBox1,
				getResources().getStringArray(R.array.checkbox_item_text)));
		
// Go TO NEXT PAGE BUTTON
		Button goToNext = (Button) findViewById(R.id.GoToSetAmounts);
		goToNext.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				startActivity(new Intent(WhatToBudget.this, SetAmounts.class));
				
			}
// WHY AM I GETTING AN ERROR HERE (Apparently, the start of list view has to be in front of the go to next page button) ? 
		}); 	
		
		
		
	}		
	private class SelectAdapter extends ArrayAdapter<String> {

		public SelectAdapter(Context context, int resource,
				int textViewResourceId, String[] strings) {
			super(context, resource, textViewResourceId, strings);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			LayoutInflater Inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			
			View row = Inflater.inflate(R.layout.budget_select_list_layout, 
					//Why is root = parent?
					parent, 
					// What does this mean exactly?
					false);
			
			
			String[] items = getResources().getStringArray(R.array.checkbox_item_text);
			
//			Button onOff = (Button) row.findViewById(R.id.toggleListButtonOnOff);
			CheckBox checkable = (CheckBox) row.findViewById(R.id.checkBox1);
			
			checkable.setText(items[position]);
			
			
			return row;
				}
	
		
	}


}
