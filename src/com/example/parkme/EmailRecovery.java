package com.example.parkme;

import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class EmailRecovery extends Activity {
	
	TextView CorrectEmail;
	String emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
	EditText email3;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_email_recovery);
		CorrectEmail= (TextView) findViewById(R.id.Cemail);
		CorrectEmail.setText("");
		email3= (EditText) findViewById(R.id.editText2);
		email3.setText("");
		
		email3.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
				if(email3.getText().toString().trim().matches(emailPattern)&& s.length()>0)
				{
					CorrectEmail.setText("");
				}
				else 
				{
					CorrectEmail.setText("Invalid Email Address");
					CorrectEmail.setTextColor(Color.RED);
				}
				
			}
		});


	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.email_recovery, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
