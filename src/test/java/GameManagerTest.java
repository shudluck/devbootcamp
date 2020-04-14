import org.javatuples.Pair;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GameManagerTest {

    @Test
    public void shouldReturnScoreTwoForBothPlayers(){
        Pair scores = new GameManager().getScoreForBothPlayers();

        assertEquals(new Pair<>(ConstantsScore.SCORE_TWO,ConstantsScore.SCORE_TWO),scores);
    }
}
