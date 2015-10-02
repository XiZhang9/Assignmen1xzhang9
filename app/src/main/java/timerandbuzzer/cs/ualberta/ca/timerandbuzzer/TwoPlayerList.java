package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;

public class TwoPlayerList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player_list);
        ListView listView2 = (ListView)findViewById(R.id.twoPlayerslistView);
        Collection<playersRecord> psrcd= recordListController.getrecordList().getPlayerRecordList();
        final ArrayList<playersRecord> list = new ArrayList<playersRecord>(psrcd);
        ArrayAdapter<playersRecord> recordAdapter=new ArrayAdapter<playersRecord>(this, android.R.layout.simple_list_item_1, list);
        listView2.setAdapter(recordAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two_player_list, menu);
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
