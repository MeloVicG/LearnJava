package Exercise8Test;

import Exercise8.Coordinates;
import Exercise8.Pawn;
import org.junit.jupiter.api.Test;

import static Exercise8.ChessPiece.Color.WHITE;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PawnTest extends ChessPieceTest{

    @Test
    public void pawnCanMoveForward(){
        Pawn pawn = new Pawn(WHITE);
        pawn.setCoordinates(new Coordinates("a2"));
        Coordinates[] validMoves = pawn.getValidMoves();
        Coordinates expectedDestination = new Coordinates("a3");
//        assertEquals(expectedDestination, validMoves[0]);
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination), String.format("Move '%s' not found", expectedDestination));
    }

}
