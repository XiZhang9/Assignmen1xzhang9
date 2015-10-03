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

public class ThreePlayerLIst extends ThreePlayers {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_player_list);
        ListView listView3 = (ListView)findViewById(R.id.threePlayerslistview);
        Collection<playersRecord3> psrcd3= recordcontroller3.getrecordList().getPlayerRecordList();
        final ArrayList<playersRecord3> list3 = new ArrayList<playersRecord3>(psrcd3);
        ArrayAdapter<playersRecord3> recordAdapter3=new ArrayAdapter<playersRecord3>(this, android.R.layout.simple_list_item_1, list3);
        listView3.setAdapter(recordAdapter3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_three_player_list, menu);
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
    public void GoClear3(View view) {
        recordcontroller3.ClearrecordList();
        Toast.makeText(getApplicationContext(), "Data is cleared", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(ThreePlayerLIst.this, ThreePlayers.class);
        startActivity(intent);
    }
    public void Gobuzz3(MenuItem menuItem) {

        Intent intent = new Intent(ThreePlayerLIst.this, ThreeBuzzercounts.class);
        startActivity(intent);
    }
}
