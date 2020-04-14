import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void shouldReturnCooperateAlways(){
        MoveType moveType = new Player(MoveType.COOPERATE).getMoveType();

        assertEquals(MoveType.COOPERATE,moveType);
    }

    @Test
    public void shoudlReturnCheatAlways(){
        MoveType moveType = new Player(MoveType.CHEAT).getMoveType();

        assertEquals(MoveType.CHEAT,moveType);
    }
}
