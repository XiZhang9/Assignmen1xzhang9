package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ThreeBuzzercounts extends ThreePlayers {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_buzzercounts);
        String a1 = recordcontroller3.getBuzzer1();
        TextView a1textview = (TextView) this.findViewById(R.id.buzzc1textView);
        a1textview.setText("PLAYER 1 BUZZES: " + a1);
        String a2 = recordcontroller3.getBuzzer2();
        TextView a2textview = (TextView) this.findViewById(R.id.buzzc2textView);
        a2textview.setText("PLAYER 2 BUZZES: " + a2);
        String a3 = recordcontroller3.getBuzzer3();
        TextView a3textview = (TextView) this.findViewById(R.id.buzzc3textView);
        a3textview.setText("PLAYER 3 BUZZES: " + a3);    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_three_buzzercounts, menu);
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
