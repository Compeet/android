package org.mgn.compeet.activities;

import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.mgn.compeet.R;
import org.mgn.compeet.model.User;
import org.mgn.compeet.service.OurLocationListener;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Method called when button Register is clicked
     * @param v
     */
    public void clickRegister(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://compeet-wiki.mgn.cz/"));
        startActivity(browserIntent);
    }

    /**
     * Method called when button Login is clicked
     * @param v
     */
    public void clickLogin(View v) {
        EditText email = (EditText)findViewById(R.id.email);
        EditText pass = (EditText)findViewById(R.id.password);
        User u = new User();
        if(u.login(email.getText().toString(),pass.getText().toString())){
            Intent myIntent = new Intent(v.getContext(), LoggedInActivity.class);
            startActivityForResult(myIntent, 0);
            Toast.makeText(getApplicationContext(), "You are logged in!",
                    Toast.LENGTH_LONG).show();
            return;
        }else{
            Toast.makeText(getApplicationContext(), "There was a problem logging in!",
                Toast.LENGTH_LONG).show();
        }
    }
}
