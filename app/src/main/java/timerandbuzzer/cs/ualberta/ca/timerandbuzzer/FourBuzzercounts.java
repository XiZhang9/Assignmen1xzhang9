package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class FourBuzzercounts extends FourPlayers {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_buzzercounts);
        String buzzcount1 = recordcontroller4.getBuzzer1();
        TextView buzzcount1textview = (TextView) this.findViewById(R.id.buzzer1textView);
        buzzcount1textview.setText("PLAYER 1 BUZZES: " + buzzcount1);
        String buzzcount2 = recordcontroller4.getBuzzer2();
        TextView buzzcount2textview = (TextView) this.findViewById(R.id.buzzer2textView);
        buzzcount2textview.setText("PLAYER 2 BUZZES: " + buzzcount2);
        String buzzcount3 = recordcontroller4.getBuzzer3();
        TextView buzzcount3textview = (TextView) this.findViewById(R.id.buzzer3textView);
        buzzcount3textview.setText("PLAYER 3 BUZZES: " + buzzcount3);
        String buzzcount4 = recordcontroller4.getBuzzer4();
        TextView buzzcount4textview = (TextView) this.findViewById(R.id.buzzer4textView);
        buzzcount4textview.setText("PLAYER 4 BUZZES: " + buzzcount4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_four_buzzercounts, menu);
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
