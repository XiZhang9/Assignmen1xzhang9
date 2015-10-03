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

    public String getBuzzer1(){
        String buzzer1String=String.valueOf(getrecordList().get1Buzzer1());
        return buzzer1String;
    }
    public String getBuzzer2(){
        String buzzer2String=String.valueOf(getrecordList().get2Buzzer2());
        return buzzer2String;
    }
    public String getBuzzer3(){
        String buzzer3String=String.valueOf(getrecordList().get3Buzzer3());
        return buzzer3String;
    }
    public String getBuzzer4(){
        String buzzer4String=String.valueOf(getrecordList().get4Buzzer4());
        return buzzer4String;
    }
    public void ClearrecordList(){
        getrecordList().Listrecordclear();
    }


}