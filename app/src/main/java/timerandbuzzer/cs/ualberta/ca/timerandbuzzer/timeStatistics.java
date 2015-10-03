package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class timeStatistics extends StartTimer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_statistics);
        String average = TimeController.average();
        TextView targettextview = (TextView) this.findViewById(R.id.averagetextView);
        targettextview.setText("Overall Average: " + average);
        String average10 = TimeController.average10();
        TextView target10textview = (TextView) this.findViewById(R.id.average10textView);
        target10textview.setText("Last 10 Average: " + average10);
        String average100 = TimeController.average100();
        TextView target100textview = (TextView) this.findViewById(R.id.average100textView);
        target100textview.setText("Last 100 Average: " + average100);
        String maxtime = TimeController.Maxtime();
        TextView maxtextview = (TextView) this.findViewById(R.id.maxtextView);
        maxtextview.setText("The Max Reaction time: " + maxtime);
        String max10time = TimeController.Max10time();
        TextView max10textview = (TextView) this.findViewById(R.id.max10textView);
        max10textview.setText("Last 10 Maximum: " + max10time);
        String max100time = TimeController.Max100time();
        TextView max100textview = (TextView) this.findViewById(R.id.max100textView);
        max100textview.setText("Last 100 Maximum: " + max100time);
        String mintime = TimeController.Mintime();
        TextView mintextview = (TextView) this.findViewById(R.id.mintextView);
        mintextview.setText("The Min Reaction time: " + mintime);
        String min10time = TimeController.Min10time();
        TextView min10textview = (TextView) this.findViewById(R.id.min10textView);
        min10textview.setText("Last 10 Minimum: " + min10time);
        String min100time = TimeController.Min100time();
        TextView min100textview = (TextView) this.findViewById(R.id.min100textView);
        min100textview.setText("Last 100 Minimum: " + min100time);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_time_statistics, menu);
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
}
