import org.javatuples.Pair;

public class ScoreBoard {
    private int mainPlayerScore , machinePlayerScore;

    public void updateScores(int mainPlayerScore,int machinePlayerScore){
        this.machinePlayerScore += machinePlayerScore;
        this.mainPlayerScore += mainPlayerScore;
    }

    public Pair getScores(){
        return new Pair<>(this.mainPlayerScore,this.machinePlayerScore);
    }
}
