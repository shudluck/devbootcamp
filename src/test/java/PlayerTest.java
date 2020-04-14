import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void shouldReturnCooperateAlways(){
        MoveType moveType = new Player().getMoveType();

        assertEquals(MoveType.COOPERATE,moveType);
    }
}
