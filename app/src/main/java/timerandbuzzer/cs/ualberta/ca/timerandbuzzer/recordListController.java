package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

/**
 * Created by xzhang9 on 10/2/15.
 */
public class recordListController {
    private static PlayRecordList playRecordList = null;
    // Warning: throws a runTimeException
    static public PlayRecordList getrecordList() {
        if (playRecordList == null) {
            playRecordList=new PlayRecordList();
        }
        return playRecordList;
    }
    public void addrecord(playersRecord precord){
        getrecordList().addRecord(precord);
    }
}