package com.example.parkme;

import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;

public class Register extends Activity {

	CheckBox agree;
	Button nextButton;
	EditText password1, password2;
	TextView pstatus;
	TextView estatus;
	EditText email1, email2;
	TextView correctemail;
	String emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		agree = (CheckBox) findViewById(R.id.checkBox1);
		nextButton=(Button) findViewById(R.id.button1);
		password1= (EditText) findViewById(R.id.editText6);
		password2= (EditText) findViewById(R.id.editText7);
		pstatus= (TextView) findViewById(R.id.textView9);
		email1= (EditText) findViewById(R.id.editText4);
		email2= (EditText) findViewById(R.id.editText5);
		pstatus.setText("");
		agree.setEnabled(false);
		nextButton.setEnabled(false);
		estatus= (TextView) findViewById(R.id.EmailC);
		estatus.setText("");
		correctemail= (TextView) findViewById(R.id.CEmail);
		correctemail.setText("");
		
		
		
		email1.addTextChangedListener(new TextWatcher() {
			
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
			public void afterTextChanged(Editable s) 
			{
				// TODO Auto-generated method stub
				if (email1.getText().toString().trim().matches(emailPattern) && s.length()> 0)
				{
					correctemail.setText("");
				}
				else
				{
					correctemail.setTextColor(Color.RED);
					correctemail.setText("Invalid Email Address");
				}
			}
		});
		
		email2.addTextChangedListener(new TextWatcher() {
			
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
				if (email1.getText().toString().equals(email2.getText().toString()))
				{
					estatus.setText("");
				}
				else {
					estatus.setText("Emails do not Match");
					estatus.setTextColor(Color.RED);;
				}
				
				
			}
		});
				
		nextButton.setEnabled(false);
		OnCheckedChangeListener agreeListener = new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked)
				{
					nextButton.setEnabled(true);;
				}
				else
				{
					nextButton.setEnabled(false);
				}
			}
		};
		agree.setOnCheckedChangeListener(agreeListener);
		password2.addTextChangedListener(new TextWatcher() {
			
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
			
				String p1=password1.getText().toString();
				String p2=password2.getText().toString();
				if (p1.equals(p2))
				{
					pstatus.setText("");
					agree.setEnabled(true);
				}
				else 
				{
					pstatus.setTextColor(Color.RED);
					pstatus.setText("Password do not match");
					agree.setEnabled(false);
					agree.setSelected(false);
					nextButton.setEnabled(false);
				}
			}
		});
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
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
