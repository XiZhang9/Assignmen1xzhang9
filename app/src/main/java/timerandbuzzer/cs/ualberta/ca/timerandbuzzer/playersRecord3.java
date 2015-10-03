package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

/**
 * Created by xzhang9 on 10/3/15.
 */
public class playersRecord3 {
    protected String PlayersRecord3;
    public playersRecord3(String PlayersRecord){
        this.PlayersRecord3=PlayersRecord;
    }

    public String GetRecord(){
        return this.PlayersRecord3;
    }
    public String toString() {
        return GetRecord();
    }
}
