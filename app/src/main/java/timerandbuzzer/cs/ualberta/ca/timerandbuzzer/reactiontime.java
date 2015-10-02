package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by xzhang9 on 10/2/15.
 */
public class reactiontime extends AppCompatActivity {
    protected Float ReactionTime;


    public reactiontime(Float ReactionTime){
        this.ReactionTime=ReactionTime;
    }

    public Float GetreactionTime(){
        return this.ReactionTime;
    }
    public String toString() {
        return GetreactionTime().toString();
    }

}

