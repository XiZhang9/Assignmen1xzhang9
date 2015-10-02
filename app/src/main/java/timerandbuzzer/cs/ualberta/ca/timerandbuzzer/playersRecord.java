package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by xzhang9 on 10/2/15.
 */
public class playersRecord extends AppCompatActivity {
    protected String PlayersRecord;
    public playersRecord(String PlayersRecord){
        this.PlayersRecord=PlayersRecord;
    }

    public String GetRecord(){
        return this.PlayersRecord;
    }
    public String toString() {
        return GetRecord();
    }



}
