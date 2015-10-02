package timerandbuzzer.cs.ualberta.ca.timerandbuzzer;

import java.util.ArrayList;

/**
 * Created by xzhang9 on 10/2/15.
 */
public class ReactionTimeList {
    protected ArrayList<reactiontime> reactionTimeList=null;

    public ReactionTimeList(){
        reactionTimeList=new ArrayList<reactiontime>();
    }
    public ArrayList<reactiontime> GetReactionTime(){
        return reactionTimeList;
    }
    public void addReactionTime(reactiontime Reactiontime){
        reactionTimeList.add(Reactiontime);
    }

    public int ListSize(){
        return reactionTimeList.size();
    }
}

