package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.widget.PopupMenu;

import java.util.concurrent.TimeUnit;

public class StartTimer extends AppCompatActivity {
    timelistcontroller TimeController= new timelistcontroller();
    long before_reaction=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starttimeractivity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start_timer, menu);
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
    public void StartClicked(final View startbutton) throws InterruptedException {
        TextView targettextview = (TextView) this.findViewById(R.id.timetextView);
        final Button button = (Button) startbutton;
        int seconds = 10 + (int) (Math.random() * (4911));
        if (((Button) startbutton).getText()=="START") {
            TimeUnit.MILLISECONDS.sleep(seconds);
            ((Button) startbutton).setText("CLICK");
            before_reaction=System.nanoTime();

        }
        if (((Button) startbutton).getText()=="CLICK") {
            long after_reaction=System.nanoTime();
            long reaction_time=after_reaction-before_reaction;
            float finaltime=(float) (reaction_time/1000000000.0);
            TimeController.addtime(new reactiontime(finaltime));
            String timestring=String.format("%.5f",finaltime);
            targettextview.setText("Reaction time "+timestring+" Seconds");

            before_reaction=0;
            after_reaction=0;
            startbutton.setEnabled(true);
            ((Button) startbutton).setText("START AGAIN");
        }
        else {
            targettextview.setText("Wait for reaction");
            TimeUnit.MILLISECONDS.sleep(seconds);
            ((Button) startbutton).setText("CLICK");
            before_reaction=System.nanoTime();
        }
    }
    public void GoData(MenuItem menuItem) {
        Intent intent = new Intent(StartTimer.this, Listofrtime.class);
        startActivity(intent);
    }

}

