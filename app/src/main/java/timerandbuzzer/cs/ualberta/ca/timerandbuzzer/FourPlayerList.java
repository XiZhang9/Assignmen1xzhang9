package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;

public class FourPlayerList extends FourPlayers {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_player_list);
        ListView listView4 = (ListView)findViewById(R.id.fourPlayerslistView);
        Collection<playersRecord4> psrcd4= recordcontroller4.getrecordList().getPlayerRecordList();
        final ArrayList<playersRecord4> list4 = new ArrayList<playersRecord4>(psrcd4);
        ArrayAdapter<playersRecord4> recordAdapter4=new ArrayAdapter<playersRecord4>(this, android.R.layout.simple_list_item_1, list4);
        listView4.setAdapter(recordAdapter4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_four_player_list, menu);
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
    public void GoClear4(View view) {
        recordcontroller4.ClearrecordList();
        Toast.makeText(getApplicationContext(), "Data is cleared", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(FourPlayerList.this, FourPlayers.class);
        startActivity(intent);
    }
    public void Gobuzz4(MenuItem menuItem) {

        Intent intent = new Intent(FourPlayerList.this, FourBuzzercounts.class);
        startActivity(intent);
    }
}
