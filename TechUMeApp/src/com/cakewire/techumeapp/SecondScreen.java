package com.cakewire.techumeapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SecondScreen extends Activity {

	public final static String choice = "com.cakewire.techumeapp.MESSAGE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondscreen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second_screen, menu);
		return true;
	}
	
	public void Calculate (View view) {
		Intent intent = new Intent(this, Convert.class);
		RadioGroup selectGroup = (RadioGroup)findViewById(R.id.radioGroup0);
		int selected = selectGroup.getCheckedRadioButtonId();
		RadioButton selectButton = (RadioButton)findViewById(selected);
		String selectText = (String) selectButton.getText();
		intent.putExtra(choice, selectText);
		startActivity(intent);
	}

}
