package com.example.parkme;
import android.support.v7.app.AppCompatActivity;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Login extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
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
	public void gotoVehicleType (View s){
		startActivity(new Intent(Login.this, VehicleType.class));
	}
	public void gotoPhoneRecovery (View p){
		startActivity(new Intent(Login.this, PhoneRecovery.class));
	}
	public void gotoRegister (View r){
		startActivity(new Intent(Login.this, Register.class));
	}
}
