package Exercise8Test;

import Exercise8.Coordinates;

public class ChessPieceTest {
    protected boolean isMoveFoundInArray(Coordinates[] moves, Coordinates expectedMove){
        for(int x=0; x <moves.length; x++){
            if ( moves[x].equals(expectedMove)) return true;
        }
        return false;
    }

}
