import org.javatuples.Pair;

public class RuleEngine {

    public Pair getScore(MoveType moveOne, MoveType moveTwo){
        if(moveOne==MoveType.COOPERATE && moveTwo==MoveType.COOPERATE){
            return new Pair(ConstantsScore.SCORE_TWO, ConstantsScore.SCORE_TWO);
        } else if(moveOne==MoveType.COOPERATE && moveTwo==MoveType.CHEAT){
            return new Pair(ConstantsScore.SCORE_NEGATIVE_ONE, ConstantsScore.SCORE_THREE);
        } else if(moveOne==MoveType.CHEAT && moveTwo==MoveType.COOPERATE){
            return new Pair(ConstantsScore.SCORE_THREE, ConstantsScore.SCORE_NEGATIVE_ONE);
        } else if(moveOne==MoveType.CHEAT && moveTwo==MoveType.CHEAT) {
            return new Pair(ConstantsScore.SCORE_ZERO, ConstantsScore.SCORE_ZERO);
        }
        return null;
    }
}

