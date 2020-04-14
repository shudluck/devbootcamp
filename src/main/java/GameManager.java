import org.javatuples.Pair;

public class GameManager {

    RuleEngine ruleEngine;
    Player mainPlayer,machine;

    public GameManager(Player mainPlayer,Player machine){
        this.ruleEngine = new RuleEngine();
        this.mainPlayer=mainPlayer;
        this.machine=machine;
    }

    public Pair playGame(int rounds) {

        Pair collectiveScore;
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.println("Round\tPlayer1\tPlayer2");

        for(int i=1;i<=rounds;i++){
            collectiveScore = ruleEngine.getScore(mainPlayer.getMoveType(),machine.getMoveType());
            scoreBoard.updateScores(Integer.parseInt(collectiveScore.getValue0().toString()),Integer.parseInt(collectiveScore.getValue1().toString()));
            System.out.println(i+"\t\t"+scoreBoard.getScores().getValue0()+"\t\t"+scoreBoard.getScores().getValue1());
        }

        return scoreBoard.getScores();
    }
}
