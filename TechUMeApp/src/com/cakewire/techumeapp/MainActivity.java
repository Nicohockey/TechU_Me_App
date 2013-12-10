package com.cakewire.techumeapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void switchToCalculations(View view){
		Intent intent = new Intent(this, SecondScreen.class);
		startActivity(intent);
	}
	
	public void switchToInstructions(View view){
		Intent intent = new Intent(this, Instructions.class);
		startActivity(intent);
	}
	public void switchToAboutUs(View view){
		Intent intent = new Intent(this, AboutUs.class);
		startActivity(intent);
	}
}
