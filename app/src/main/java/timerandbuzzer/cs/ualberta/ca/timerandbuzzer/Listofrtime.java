package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;

public class Listofrtime extends StartTimer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofrtime);
        ReactionTimeList reactionlist;
        ListView listView1 = (ListView)findViewById(R.id.TimerlistView);
        Collection<reactiontime> rtimes = timelistcontroller.getTimeList().GetReactionTime();
        final ArrayList<reactiontime> list = new ArrayList<reactiontime>(rtimes);
        ArrayAdapter<reactiontime> timeAdapter=new ArrayAdapter<reactiontime>(this, android.R.layout.simple_list_item_1, list);
        listView1.setAdapter(timeAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listofrtime, menu);
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
    public void Goaverage(MenuItem menuItem) {
        if (TimeController.getlistsize()==0){
            Intent intent = new Intent(Listofrtime.this, Nodata.class);
            startActivity(intent);

        }
        else {
            Intent intent = new Intent(Listofrtime.this, timeStatistics.class);
            startActivity(intent);
        }
    }
    public void GoClearTime(View view){
        TimeController.ClearList();
        Toast.makeText(getApplicationContext(), "Data is cleared", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Listofrtime.this, StartTimer.class);
        startActivity(intent);
    }
}
