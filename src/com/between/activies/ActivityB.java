package com.between.activies;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityB extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_b);
		
		  Intent intent = getIntent();
	      String name = intent.getStringExtra("name");
	      String job = intent.getStringExtra("job");
	      String bool = intent.getStringExtra("boolean");
	      String amount = intent.getStringExtra("amount");
	      
	      TextView tv = (TextView)findViewById(R.id.text);
	      TextView tv1 = (TextView)findViewById(R.id.textView1);
	      TextView tv2 = (TextView)findViewById(R.id.textView2);
	      TextView tv3 = (TextView)findViewById(R.id.textView3);
	      tv.setText("Name : " +name);
	      tv1.setText("Job Desc : " +job);
	      tv2.setText("Boolean : " +bool);
	      tv3.setText("Amount In Bank : " +amount);
		
//		Intent i = getIntent();
//		
//		String name = i.getStringExtra("Name");
//		String job = i.getStringExtra("Job");
//        boolean bool = i.getBooleanExtra("BooleanValue",false);
//        Integer amount = i.getIntExtra("AmoutInBank", 1000);
//        
//        
//        Toast.makeText(getApplicationContext(), "Name: " + name, Toast.LENGTH_LONG).show();
//        Toast.makeText(getApplicationContext(), "Job: " + job, Toast.LENGTH_LONG).show();
//        Toast.makeText(getApplicationContext(), "Random Boolean Value: " + bool, Toast.LENGTH_LONG).show();
//        Toast.makeText(getApplicationContext(), "Amount In Bank: " + amount, Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_b, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			//Toast.makeText(getApplicationContext(), "Thank You @Cc_Hub", Toast.LENGTH_LONG).show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
