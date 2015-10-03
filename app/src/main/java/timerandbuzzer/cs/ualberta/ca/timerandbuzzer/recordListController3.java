package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

/**
 * Created by xzhang9 on 10/3/15.
 */
public class recordListController3 {
    private static PlayRecordList3 playRecordList3 = null;
    // Warning: throws a runTimeException
    static public PlayRecordList3 getrecordList() {
        if (playRecordList3 == null) {
            playRecordList3=new PlayRecordList3();
        }
        return playRecordList3;
    }
    public void addrecord(playersRecord3 precord){
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
