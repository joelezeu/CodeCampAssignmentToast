package com.between.activies;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	EditText textBox, textBox1, textBox2, textBox3;
	Button b;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b = (Button)findViewById(R.id.button);
		textBox = (EditText)findViewById(R.id.editText);
		textBox1 = (EditText)findViewById(R.id.editText1);
		textBox2 = (EditText)findViewById(R.id.editText2);
		textBox3 = (EditText)findViewById(R.id.editText3);
		//Int phoneNo = Int.parseLong(textBox3);
		
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, ActivityB.class);
				i.putExtra("name", textBox.getText().toString());
				i.putExtra("job", textBox1.getText().toString()); 
				i.putExtra("boolean", textBox2.getText().toString());
				i.putExtra("amount", textBox3.getText().toString());
				
			    startActivity(i);
			}
		});
	}
//	@Override
//	protected void onStart() {
//		// TODO Auto-generated method stub
//		//super.onStart();
//		Intent i = new Intent(MainActivity.this, ActivityB.class);
//		i.putExtra("Name", "Caleb");
//		i.putExtra("Job", "Software Developer");
//    	i.putExtra("BooleanValue", true);
//    	i.putExtra("AmoutInBank", 3000);
//    	startActivity(i);
//	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
