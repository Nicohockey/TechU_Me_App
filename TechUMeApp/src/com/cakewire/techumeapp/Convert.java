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
		convert.setText(getIntent().getStringExtra(SecondScreen.choice));
		String[] words = getIntent().getStringExtra(SecondScreen.choice).split(" ");
		String option = words[0];
		
		if (option.equalsIgnoreCase("factored")){
			showText(R.id.numA_Field);
			hideText(R.id.numB_Field);
			hideText(R.id.numB_text);
			hideText(R.id.numC_Field);
			hideText(R.id.numC_text);
			
			showText(R.id.numX1_Field);
			showText(R.id.numX1_text);
			showText(R.id.numX1_textSUB);
			showText(R.id.numX2_Field);
			showText(R.id.numX2_text);
			showText(R.id.numX2_textSUB);
			
			hideText(R.id.numH_Field);
			hideText(R.id.numH_text);
			hideText(R.id.numK_Field);
			hideText(R.id.numK_text);
		}
		else if (option.equalsIgnoreCase("standard")){
			hideText(R.id.numA_Field);
			hideText(R.id.numA_text);
			hideText(R.id.numB_Field);
			hideText(R.id.numB_text);
			hideText(R.id.numC_Field);
			hideText(R.id.numC_text);
			
			hideText(R.id.numX1_Field);
			hideText(R.id.numX1_text);
			hideText(R.id.numX1_textSUB);
			hideText(R.id.numX2_Field);
			hideText(R.id.numX2_text);
			hideText(R.id.numX2_textSUB);
			
			hideText(R.id.numH_Field);
			hideText(R.id.numH_text);
			hideText(R.id.numK_Field);
			hideText(R.id.numK_text);
		}
		else if (option.equalsIgnoreCase("vertex")){
			showText(R.id.numA_Field);
			hideText(R.id.numB_Field);
			hideText(R.id.numB_text);
			hideText(R.id.numC_Field);
			hideText(R.id.numC_text);
			
			hideText(R.id.numX1_Field);
			hideText(R.id.numX1_text);
			hideText(R.id.numX1_textSUB);
			hideText(R.id.numX2_Field);
			hideText(R.id.numX2_text);
			hideText(R.id.numX2_textSUB);
			
			showText(R.id.numH_Field);
			showText(R.id.numH_text);
			showText(R.id.numK_Field);
			showText(R.id.numK_text);
			
		}
		convert.setText(getIntent().getStringExtra(SecondScreen.choice));
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
