package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TwoBuzzercounts extends TwoPlayers {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_buzzercounts);
        String b1 = recordcontroller.getBuzzer1();
        TextView b1textview = (TextView) this.findViewById(R.id.buzz1textView);
        b1textview.setText("PLAYER 1 BUZZES: " + b1);
        String b2 = recordcontroller.getBuzzer2();
        TextView b2textview = (TextView) this.findViewById(R.id.buzz2textView);
        b2textview.setText("PLAYER 2 BUZZES: " + b2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two_buzzercounts, menu);
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
