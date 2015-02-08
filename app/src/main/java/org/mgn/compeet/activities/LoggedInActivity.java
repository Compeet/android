package org.mgn.compeet.activities;

import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.mgn.compeet.R;
import org.mgn.compeet.model.User;
import org.mgn.compeet.service.OurLocationListener;

public class LoggedInActivity extends ActionBarActivity {

    private LocationManager lm;
    private LocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

        TextView text = (TextView)findViewById(R.id.text);

        locationListener = new OurLocationListener(text) ;
        // every 2sec check for new location
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 2000, 0, locationListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_logged_in, menu);
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
     * Method called when button Login is clicked
     * @param v
     */
    public void clickLogout(View v) {
        //Intent myIntent = new Intent(v.getContext(), LoggedInActivity.class);
        //startActivityForResult(myIntent, 0);
        Toast.makeText(getApplicationContext(), "You are logged out!",
                Toast.LENGTH_LONG).show();

        cleanUp();
    }

    @Override
    protected void onDestroy() {
        super.onStop();

        cleanUp();
    }

    private void cleanUp(){
        lm.removeUpdates(locationListener);
        finish();
    }
}
