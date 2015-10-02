package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

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


}
