package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

/**
 * Created by xzhang9 on 10/3/15.
 */
public class recordListController4 {
    private static PlayRecordList4 playRecordList4 = null;
    // Warning: throws a runTimeException
    static public PlayRecordList4 getrecordList() {
        if (playRecordList4 == null) {
            playRecordList4=new PlayRecordList4();
        }
        return playRecordList4;
    }
    public void addrecord(playersRecord4 precord){
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
