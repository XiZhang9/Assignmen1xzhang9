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
    public int getlistsize(){
        return getTimeList().ListSize();
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
        if (size>=10){
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
        if (size>=100){
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
        float size=(float)(timelistcontroller.getTimeList().ListSize());
        if (size >= 0) {
            float maxt = findMaxlist.GetReactionTime().get(0).GetreactionTime();
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
    public String Max10time() {
        ReactionTimeList findMax10list = timelistcontroller.getTimeList();
        float size=(float)(timelistcontroller.getTimeList().ListSize());
        if (size >=10) {
            float maxt10 = findMax10list.GetReactionTime().get((int)(size-10)).GetreactionTime();
            for (int i = (int)(size-9); i < size; i++) {
                if ((findMax10list.GetReactionTime().get(i).GetreactionTime())>maxt10){
                    maxt10=findMax10list.GetReactionTime().get(i).GetreactionTime();
                }
            }
            String Stringmax10=String.format("%.5f",maxt10);
            return Stringmax10;
        }
        else {
            return "Not Enough Input";
        }
    }

    public String Max100time() {
        ReactionTimeList findMax100list = timelistcontroller.getTimeList();
        float size=(float)(timelistcontroller.getTimeList().ListSize());
        if (size >=100) {
            float maxt100 = findMax100list.GetReactionTime().get((int)(size-100)).GetreactionTime();
            for (int i = (int)(size-99); i < size; i++) {
                if ((findMax100list.GetReactionTime().get(i).GetreactionTime())>maxt100){
                    maxt100=findMax100list.GetReactionTime().get(i).GetreactionTime();
                }
            }
            String Stringmax100=String.format("%.5f",maxt100);
            return Stringmax100;
        }
        else {
            return "Not Enough Input";
        }
    }
    public String Mintime() {
        ReactionTimeList findMinlist = timelistcontroller.getTimeList();
        float size=(float)(timelistcontroller.getTimeList().ListSize());
        if (size!= 0) {
            float mint = findMinlist.GetReactionTime().get(0).GetreactionTime();
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
    public String Min10time() {
        ReactionTimeList findMin10list = timelistcontroller.getTimeList();
        float size=(float)(timelistcontroller.getTimeList().ListSize());
        if (size>= 10) {
            float mint10 = findMin10list.GetReactionTime().get((int) (size - 10)).GetreactionTime();
            for (int i = (int)(size-9); i < findMin10list.ListSize(); i++) {
                if ((findMin10list.GetReactionTime().get(i).GetreactionTime())<mint10){
                    mint10=findMin10list.GetReactionTime().get(i).GetreactionTime();
                }
            }
            String Stringmin10=String.format("%.5f",mint10);
            return Stringmin10;
        }
        else {
            return "Not Enough Input";
        }
    }
    public String Min100time() {
        ReactionTimeList findMin100list = timelistcontroller.getTimeList();
        float size = (float) (timelistcontroller.getTimeList().ListSize());
        if (size >= 100) {
            float mint100 = findMin100list.GetReactionTime().get((int)(size-100)).GetreactionTime();
            for (int i = (int) (size - 99); i < findMin100list.ListSize(); i++) {
                if ((findMin100list.GetReactionTime().get(i).GetreactionTime()) < mint100) {
                    mint100 = findMin100list.GetReactionTime().get(i).GetreactionTime();
                }
            }
            String Stringmin100 = String.format("%.5f", mint100);
            return Stringmin100;
        } else {
            return "Not Enough Input";
        }
    }
    public void ClearList(){
        getTimeList().Listclear();
    }






}