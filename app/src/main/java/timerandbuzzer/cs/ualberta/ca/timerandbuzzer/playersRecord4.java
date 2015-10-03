package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

/**
 * Created by xzhang9 on 10/3/15.
 */
public class playersRecord4 {
    protected String PlayersRecord4;
    public playersRecord4(String PlayersRecord){
        this.PlayersRecord4=PlayersRecord;
    }

    public String GetRecord(){
        return this.PlayersRecord4;
    }
    public String toString() {
        return GetRecord();
    }
}
