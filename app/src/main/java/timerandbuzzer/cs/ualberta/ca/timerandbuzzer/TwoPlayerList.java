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

public class TwoPlayerList extends TwoPlayers {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player_list);
        ListView listView2 = (ListView)findViewById(R.id.twoPlayerslistView);
        Collection<playersRecord> psrcd= recordcontroller.getrecordList().getPlayerRecordList();
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
    public void GoClear2(View view) {
        recordcontroller.ClearrecordList();
        Toast.makeText(getApplicationContext(), "Data is cleared", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(TwoPlayerList.this, TwoPlayers.class);
        startActivity(intent);
    }
    public void Gobuzz(MenuItem menuItem) {

        Intent intent = new Intent(TwoPlayerList.this, TwoBuzzercounts.class);
        startActivity(intent);
    }
}
