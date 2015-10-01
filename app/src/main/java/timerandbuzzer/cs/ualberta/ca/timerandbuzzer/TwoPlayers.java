package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class TwoPlayers extends AppCompatActivity {
    int playeronewins=0;
    int playertwowins=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoplayersactivity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two_players, menu);
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

    public void Player1Clicked(View player1button){
        if (playertwowins==1){
            player1button.setEnabled(false);
            ((Button) player1button).setText("TRY HARDER");
        }
        else {
            Button button = (Button) player1button;
            ((Button) player1button).setText("WINNER");
            ((Button) player1button).setBackgroundColor(Color.RED);
            player1button.setEnabled(false);
            playeronewins = 1;
        }

    }
    public void Player2Clicked(View player2button){
        if (playeronewins==1){
            player2button.setEnabled(false);
            ((Button) player2button).setText("TRY HARDER");
        }
        else {
            Button button = (Button) player2button;
            ((Button) player2button).setText("WINNER");
            ((Button) player2button).setBackgroundColor(Color.RED);
            player2button.setEnabled(false);
            playertwowins=1;
        }
    }

}
