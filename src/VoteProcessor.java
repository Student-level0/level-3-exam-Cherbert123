import java.util.ArrayList;

public class VoteProcessor {
	
	public Object calculateElectionWinner(ArrayList<String> votes) {
		int votePope = 0;
		int voteEdward = 0;
		String returner = "";
		for(int i = 0;i < votes.size();i++) {
			if(votes.get(i).equalsIgnoreCase("Pope Francis")) {
				votePope = votePope + 1;	
			}else {
				voteEdward = voteEdward + 1;
			}
		}
		if(votePope > voteEdward) {
		returner = "pope francis";
		} else if(voteEdward > votePope) {
		returner = "edward Snowden";	
		} else {
		returner = "TIE";	
		}
		return returner;
	}

}
