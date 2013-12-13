package com.cakewire.techumeapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Convert extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_convert);
		TextView convert = (TextView) findViewById(R.id.convert);
		convert.setText(getIntent().getStringExtra(SecondScreen.EXTRA_MESSAGE));
		String[] words = getIntent().getStringExtra(SecondScreen.EXTRA_MESSAGE).split(" ");
		String option = words[0];
		
		if (option.equalsIgnoreCase("factored")){
			hideText(R.id.numA_Field);
			hideText(R.id.numB_Field);
			hideText(R.id.numC_Field);
			
			showText(R.id.numX1_Field);
			showText(R.id.numX1_Field);
		}
		else if (option.equalsIgnoreCase("standard")){
			showText(R.id.numA_Field);
			showText(R.id.numB_Field);
			showText(R.id.numC_Field);
			
			hideText(R.id.numX1_Field);
			hideText(R.id.numX1_Field);
		}
		else if (option.equalsIgnoreCase("vertex")){
			
			
			
		}
	}

	private void hideText(int numField) {
		EditText text = (EditText) findViewById(numField);
		text.setVisibility(View.GONE);
	}
	
	private void showText(int numField) {
		EditText text = (EditText) findViewById(numField);
		text.setVisibility(View.VISIBLE);
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.convert, menu);
		return true;
	}

}
