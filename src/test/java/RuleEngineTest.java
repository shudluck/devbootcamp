import org.javatuples.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuleEngineTest {

    RuleEngine ruleEngine = new RuleEngine();

    Pair scores;

    @Test
    public void getScoreWhenBothCooperated(){
        scores = ruleEngine.getScore(MoveType.COOPERATE, MoveType.COOPERATE);
        assertEquals(new Pair(ConstantsScore.SCORE_TWO, ConstantsScore.SCORE_TWO),scores);
    }

    @Test
    public void getScoreWhenPlayerCheatedMachineCooperated(){
        scores = ruleEngine.getScore(MoveType.CHEAT, MoveType.COOPERATE);

        assertEquals(new Pair(ConstantsScore.SCORE_THREE, ConstantsScore.SCORE_NEGATIVE_ONE),scores);
    }

    @Test
    public void getScoreWhenPlayerCooperatedMachineCheated(){
        scores = ruleEngine.getScore(MoveType.COOPERATE, MoveType.CHEAT);

        assertEquals(new Pair(ConstantsScore.SCORE_NEGATIVE_ONE, ConstantsScore.SCORE_THREE),scores);
    }

    @Test
    public void getScoreWhenBothCheated(){
        scores = ruleEngine.getScore(MoveType.CHEAT, MoveType.CHEAT);

        assertEquals(new Pair(ConstantsScore.SCORE_ZERO, ConstantsScore.SCORE_ZERO),scores);
    }
}
