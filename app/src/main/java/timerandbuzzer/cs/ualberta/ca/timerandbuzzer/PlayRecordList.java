package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import java.util.ArrayList;

/**
 * Created by xzhang9 on 10/2/15.
 */
public class PlayRecordList {
    int buzzer1=0;
    int buzzer2=0;
    int buzzer3=0;
    int buzzer4=0;
    protected ArrayList<playersRecord> playerRecordList=null;

    public PlayRecordList(){
        playerRecordList=new ArrayList<playersRecord>();
    }
    public ArrayList<playersRecord> getPlayerRecordList(){
        return playerRecordList;
    }
    public void addRecord(playersRecord buzzers){
        playerRecordList.add(buzzers);
        if (buzzers.GetRecord().toString()=="PLAYER 1"){
            buzzer1+=1;
        }
        else if (buzzers.GetRecord().toString()=="PLAYER 2"){
            buzzer2+=1;
        }
        else if (buzzers.GetRecord().toString()=="PLAYER 3"){
            buzzer3+=1;
        }
        else {
            buzzer4+=1;
        }
    }
    public int get1Buzzer1(){
        return buzzer1;
    }
    public int get2Buzzer2(){
        String buzzer2String=String.valueOf(buzzer2);
        return buzzer2;
    }
    public int get3Buzzer3(){
        String buzzer3String=String.valueOf(buzzer3);
        return buzzer3;
    }
    public int get4Buzzer4(){
        String buzzer4String=String.valueOf(buzzer4);
        return buzzer4;
    }

    public int ListSize(){
        return playerRecordList.size();
    }
    public void Listrecordclear(){
        playerRecordList.clear();
        buzzer1=0;
        buzzer2=0;
        buzzer3=0;
        buzzer4=0;
    }
}
