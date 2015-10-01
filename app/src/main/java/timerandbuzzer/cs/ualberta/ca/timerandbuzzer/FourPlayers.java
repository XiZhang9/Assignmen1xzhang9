package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FourPlayers extends AppCompatActivity {
    int player1win=0;
    int player2win=0;
    int player3win=0;
    int player4win=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourplayersactivity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_four_players, menu);
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
    public void PlayeroneClicks(View playerbutton1) {
        if (player2win == 1) {
            playerbutton1.setEnabled(false);
            ((Button) playerbutton1).setText("TRY HARDER");
        }
        else if (player3win == 1) {
            playerbutton1.setEnabled(false);
            ((Button) playerbutton1).setText("TRY HARDER");
        }
        else if (player4win == 1) {
            playerbutton1.setEnabled(false);
            ((Button) playerbutton1).setText("TRY HARDER");
        } else {
            Button button = (Button) playerbutton1;
            ((Button) playerbutton1).setText("WINNER");
            ((Button) playerbutton1).setBackgroundColor(Color.RED);
            playerbutton1.setEnabled(false);
            player1win = 1;
        }

    }

    public void PlayertwoClicks(View playerbutton2) {
        if (player1win == 1) {
            playerbutton2.setEnabled(false);
            ((Button) playerbutton2).setText("TRY HARDER");
        }
        else if (player3win == 1) {
            playerbutton2.setEnabled(false);
            ((Button) playerbutton2).setText("TRY HARDER");
        }
        else if (player4win == 1) {
            playerbutton2.setEnabled(false);
            ((Button) playerbutton2).setText("TRY HARDER");
        } else {
            Button button = (Button) playerbutton2;
            ((Button) playerbutton2).setText("WINNER");
            ((Button) playerbutton2).setBackgroundColor(Color.RED);
            playerbutton2.setEnabled(false);
            player2win = 1;
        }

    }
    public void PlayerthreeClicks(View playerbutton3) {
        if (player1win == 1) {
            playerbutton3.setEnabled(false);
            ((Button) playerbutton3).setText("TRY HARDER");
        }
        else if (player2win == 1) {
            playerbutton3.setEnabled(false);
            ((Button) playerbutton3).setText("TRY HARDER");
        }
        else if (player4win == 1) {
            playerbutton3.setEnabled(false);
            ((Button) playerbutton3).setText("TRY HARDER");
        } else {
            Button button = (Button) playerbutton3;
            ((Button) playerbutton3).setText("WINNER");
            ((Button) playerbutton3).setBackgroundColor(Color.RED);
            playerbutton3.setEnabled(false);
            player3win = 1;
        }

    }
    public void PlayerfourClicks(View playerbutton4) {
        if (player1win == 1) {
            playerbutton4.setEnabled(false);
            ((Button) playerbutton4).setText("TRY HARDER");
        }
        else if (player2win == 1) {
            playerbutton4.setEnabled(false);
            ((Button) playerbutton4).setText("TRY HARDER");
        }
        else if (player3win == 1) {
            playerbutton4.setEnabled(false);
            ((Button) playerbutton4).setText("TRY HARDER");
        } else {
            Button button = (Button) playerbutton4;
            ((Button) playerbutton4).setText("WINNER");
            ((Button) playerbutton4).setBackgroundColor(Color.RED);
            playerbutton4.setEnabled(false);
            player4win = 1;
        }

    }
}
