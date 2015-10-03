package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ThreePlayers extends AppCompatActivity {
    int player1wins=0;
    int player2wins=0;
    int player3wins=0;
    recordListController3 recordcontroller3= new recordListController3();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.threeplayersactivity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_three_players, menu);
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
    public void PlayeroneClicked(View playeronebutton) {
        if (player2wins == 1) {
            playeronebutton.setEnabled(false);
            ((Button) playeronebutton).setText("TRY HARDER");
        }
        else if (player3wins == 1) {
            playeronebutton.setEnabled(false);
            ((Button) playeronebutton).setText("TRY HARDER");
        } else {
            Button button = (Button) playeronebutton;
            recordcontroller3.addrecord(new playersRecord3("PLAYER 1"));
            ((Button) playeronebutton).setText("WINNER");
            ((Button) playeronebutton).setBackgroundColor(Color.RED);
            playeronebutton.setEnabled(false);
            player1wins = 1;
        }

    }
    public void PlayertwoClicked(View playertwobutton) {
        if (player1wins == 1) {
            playertwobutton.setEnabled(false);
            ((Button) playertwobutton).setText("TRY HARDER");
        }
        else if (player3wins == 1) {
            playertwobutton.setEnabled(false);
            ((Button) playertwobutton).setText("TRY HARDER");
        } else {
            Button button = (Button) playertwobutton;
            recordcontroller3.addrecord(new playersRecord3("PLAYER 2"));
            ((Button) playertwobutton).setText("WINNER");
            ((Button) playertwobutton).setBackgroundColor(Color.RED);
            playertwobutton.setEnabled(false);
            player2wins = 1;
        }

    }
    public void PlayerthreeClicked(View playerthreebutton) {
        if (player1wins == 1) {
            playerthreebutton.setEnabled(false);
            ((Button) playerthreebutton).setText("TRY HARDER");
        }
        else if (player2wins == 1) {
            playerthreebutton.setEnabled(false);
            ((Button) playerthreebutton).setText("TRY HARDER");
        } else {
            Button button = (Button) playerthreebutton;
            recordcontroller3.addrecord(new playersRecord3("PLAYER 3"));
            ((Button) playerthreebutton).setText("WINNER");
            ((Button) playerthreebutton).setBackgroundColor(Color.RED);
            playerthreebutton.setEnabled(false);
            player3wins = 1;
        }

    }
    public void GothreeData(MenuItem menuItem) {
        Intent intent = new Intent(ThreePlayers.this, ThreePlayerLIst.class);
        startActivity(intent);
    }
}
