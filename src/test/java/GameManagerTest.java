import org.javatuples.Pair;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GameManagerTest {

    //Game Manager name change
    private GameManager gameManager = null;
    int rounds=1;

    @Test
    public void shouldReturnScoreScoreForSingleRoundWhenBothPlayersCooperate(){
        gameManager = new GameManager(new Player(MoveType.COOPERATE),new Player(MoveType.COOPERATE));
        Pair gameScore = gameManager.playGame(rounds);
        assertEquals(new Pair<>(ConstantsScore.SCORE_TWO,ConstantsScore.SCORE_TWO),gameScore);
    }

    @Test
    public void shouldReturnCollectiveScoreForBothPlayersCooperate(){
        gameManager = new GameManager(new Player(MoveType.COOPERATE),new Player(MoveType.COOPERATE));
        Pair gameScore= gameManager.playGame(rounds);
        assertEquals(new Pair<>(ConstantsScore.SCORE_TWO*rounds,ConstantsScore.SCORE_TWO*rounds),gameScore);
    }
    @Test
    public void shouldReturnCorrectScoreForMultipleGames(){
        gameManager = new GameManager(new Player(MoveType.COOPERATE),new Player(MoveType.COOPERATE));
        Pair firstGame = gameManager.playGame(5);
        Pair secondGame = gameManager.playGame(3);

        assertEquals(new Pair<>(ConstantsScore.SCORE_TWO * 3,ConstantsScore.SCORE_TWO*3),secondGame);
    }
    @Test
    public void shouldReturnScoreWhenOneCooperateAnotherCheat(){
        gameManager = new GameManager(new Player(MoveType.COOPERATE),new Player(MoveType.CHEAT));
        Pair gameScore = gameManager.playGame(5);

        assertEquals(new Pair<>(ConstantsScore.SCORE_NEGATIVE_ONE * 5,ConstantsScore.SCORE_THREE*5),gameScore);
    }
}
