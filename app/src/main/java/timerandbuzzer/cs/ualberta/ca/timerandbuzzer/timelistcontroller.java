package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by xzhang9 on 10/2/15.
 */
public class timelistcontroller {
    private static ReactionTimeList reactionTimeList = null;
    // Warning: throws a runTimeException
    static public ReactionTimeList getTimeList() {
        if (reactionTimeList == null) {
            reactionTimeList=new ReactionTimeList();
        }
        return reactionTimeList;
    }
    public void addtime(reactiontime rtime){
        getTimeList().addReactionTime(rtime);
    }
    public String average(){
        ReactionTimeList overallList=timelistcontroller.getTimeList();
        float total=0;
        float averageTime;
        float size=(float)(timelistcontroller.getTimeList().ListSize());
        if (overallList!=null){
            for (int i=0;i<overallList.ListSize();i++){
                total+=overallList.GetReactionTime().get(i).GetreactionTime();
            }
            averageTime=total/size;
            String averageString=String.format("%.5f",averageTime);
            return averageString;
        }
        else{
            return "NO DATA TO SHOW";
        }
    }
    public String average10(){
        ReactionTimeList overall10List=timelistcontroller.getTimeList();
        float total10=0;
        float average10Time;
        float size=(float)(timelistcontroller.getTimeList().ListSize());
        if (size>10){
            for (int i=(int)(size-(float)(10));i<overall10List.ListSize();i++){
                total10+=overall10List.GetReactionTime().get(i).GetreactionTime();
            }
            average10Time=total10/10;
            String averageString10=String.format("%.5f",average10Time);
            return averageString10;
        }
        else{
            return "Not Enough Input";
        }
    }
    public String average100(){
        ReactionTimeList overall100List=timelistcontroller.getTimeList();
        float total100=0;
        float average100Time;
        float size=(float)(timelistcontroller.getTimeList().ListSize());
        if (size>10){
            for (int i=(int)(size-(float)(100));i<overall100List.ListSize();i++){
                total100+=overall100List.GetReactionTime().get(i).GetreactionTime();
            }
            average100Time=total100/100;
            String averageString100=String.format("%.5f",average100Time);
            return averageString100;
        }
        else{
            return "Not Enough Input";
        }
    }

    public String Maxtime() {
        ReactionTimeList findMaxlist = timelistcontroller.getTimeList();
        float maxt = findMaxlist.GetReactionTime().get(0).GetreactionTime();
        float size=(float)(timelistcontroller.getTimeList().ListSize());
        if (size != 0) {
            for (int i = 1; i < findMaxlist.ListSize(); i++) {
                if ((findMaxlist.GetReactionTime().get(i).GetreactionTime())>maxt){
                    maxt=findMaxlist.GetReactionTime().get(i).GetreactionTime();
                }
            }
            String Stringmax=String.format("%.5f",maxt);
            return Stringmax;
        }
        else {
            return "Not Enough Input";
        }
    }
    public String Mintime() {
        ReactionTimeList findMinlist = timelistcontroller.getTimeList();
        float mint = findMinlist.GetReactionTime().get(0).GetreactionTime();
        float size=(float)(timelistcontroller.getTimeList().ListSize());
        if (size!= 0) {
            for (int i = 1; i < findMinlist.ListSize(); i++) {
                if ((findMinlist.GetReactionTime().get(i).GetreactionTime())<mint){
                    mint=findMinlist.GetReactionTime().get(i).GetreactionTime();
                }
            }
            String Stringmin=String.format("%.5f",mint);
            return Stringmin;
        }
        else {
            return "Not Enough Input";
        }
    }





}
