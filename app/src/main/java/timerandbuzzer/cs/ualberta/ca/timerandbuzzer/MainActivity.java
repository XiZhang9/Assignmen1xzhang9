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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void GoTimer(View view){
        AlertDialog hint = new AlertDialog.Builder(MainActivity.this).create();
        hint.setTitle("How to Play?");
        hint.setMessage("Press START then wait until the button tells you to CLICK ");
        hint.setButton(AlertDialog.BUTTON_NEUTRAL, "GOT IT",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Intent intent= new Intent(MainActivity.this,StartTimer.class);
                        startActivity(intent);
                    }
                });
        hint.show();
    }
    public void GoBuzzer(View view){
        Intent intent= new Intent(MainActivity.this,Players.class);
        startActivity(intent);
    }

}
