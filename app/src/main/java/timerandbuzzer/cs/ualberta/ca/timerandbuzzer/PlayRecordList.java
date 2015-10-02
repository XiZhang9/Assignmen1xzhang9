package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import java.util.ArrayList;

/**
 * Created by xzhang9 on 10/2/15.
 */
public class PlayRecordList {
    protected ArrayList<playersRecord> playerRecordList=null;

    public PlayRecordList(){
        playerRecordList=new ArrayList<playersRecord>();
    }
    public ArrayList<playersRecord> getPlayerRecordList(){
        return playerRecordList;
    }
    public void addRecord(playersRecord buzzers){
        playerRecordList.add(buzzers);
    }

    public int ListSize(){
        return playerRecordList.size();
    }
}