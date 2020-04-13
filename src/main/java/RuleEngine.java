
public class RuleEngine {

    public enum MoveType{
        COOPERATE,
        CHEAT
    }

    public static final int SCORE_ZERO = 0;
    public static final int SCORE_NEGATIVE_ONE = -1;
    public static final int SCORE_TWO = 2;
    public static final int SCORE_THREE = 3;

    //Custom class instead of pair
    public int[] getScore(MoveType moveOne, MoveType moveTwo){

        if(moveOne==MoveType.COOPERATE && moveTwo==MoveType.COOPERATE){
            return new int[]{SCORE_TWO,SCORE_TWO};
        } else if(moveOne==MoveType.COOPERATE && moveTwo==MoveType.CHEAT){
            return new int[]{SCORE_NEGATIVE_ONE,SCORE_THREE};
        } else if(moveOne==MoveType.CHEAT && moveTwo==MoveType.COOPERATE){
            return new int[]{SCORE_THREE,SCORE_NEGATIVE_ONE};
        } else if(moveOne==MoveType.CHEAT && moveTwo==MoveType.CHEAT) {
            return new int[]{SCORE_ZERO, SCORE_ZERO};
        }
        return null;
    }
}

