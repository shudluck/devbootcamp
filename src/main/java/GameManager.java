import org.javatuples.Pair;

public class GameManager {
    RuleEngine ruleEngine;
    Player mainPlayer,machine;

    public GameManager(){
        this.ruleEngine = new RuleEngine();
        this.mainPlayer = new Player();
        this.machine = new Player();
    }


    public Pair getScoreForBothPlayers() {
        return ruleEngine.getScore(mainPlayer.getMoveType(),machine.getMoveType());
    }
}
