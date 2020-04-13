
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuleEngineTest {

    RuleEngine ruleEngine = new RuleEngine();

    int[] scores;

    private static final int SCORE_ZERO = 0;
    private static final int SCORE_NEGATIVE_ONE = -1;
    private static final int SCORE_TWO = 2;
    private static final int SCORE_THREE = 3;

    @Test
    public void getScoreWhenBothCooperated(){
        scores = ruleEngine.getScore(RuleEngine.MoveType.COOPERATE, RuleEngine.MoveType.COOPERATE);
        assertEquals(SCORE_TWO,scores[0]);
        assertEquals(SCORE_TWO,scores[1]);
    }

    @Test
    public void getScoreWhenPlayerCheatedMachineCooperated(){
        scores = ruleEngine.getScore(RuleEngine.MoveType.CHEAT, RuleEngine.MoveType.COOPERATE);

        assertEquals(SCORE_THREE,scores[0]);
        assertEquals(SCORE_NEGATIVE_ONE,scores[1]);
    }

    @Test
    public void getScoreWhenPlayerCooperatedMachineCheated(){
        scores = ruleEngine.getScore(RuleEngine.MoveType.COOPERATE, RuleEngine.MoveType.CHEAT);

        assertEquals(SCORE_NEGATIVE_ONE,scores[0]);
        assertEquals(SCORE_THREE,scores[1]);
    }

    @Test
    public void getScoreWhenBothCheated(){
        scores = ruleEngine.getScore(RuleEngine.MoveType.CHEAT, RuleEngine.MoveType.CHEAT);

        assertEquals(SCORE_ZERO,scores[0]);
        assertEquals(SCORE_ZERO,scores[1]);
    }
}
