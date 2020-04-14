public class Player {

    private MoveType moveType;

    public Player(MoveType moveType){
        this.moveType = moveType;
    }

    public MoveType getMoveType(){
        return moveType;
    }
}
