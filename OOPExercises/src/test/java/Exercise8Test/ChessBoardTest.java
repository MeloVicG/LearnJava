package Exercise8Test;

import Exercise8.ChessBoard;
import Exercise8.Coordinates;
import Exercise8.Knight;
import Exercise8.Pawn;
import org.junit.jupiter.api.Test;

import static Exercise8.ChessPiece.Color.BLACK;
import static Exercise8.ChessPiece.Color.WHITE; //TODO take a look at this
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChessBoardTest {

    @Test
    public void canAddPawn(){
        ChessBoard board = new ChessBoard();
        Pawn pawn = new Pawn(WHITE);
        board.add(pawn, "a2");
        Pawn foundPawn = (Pawn) board.getPieceAtCoords("a2");
        assertEquals(pawn, foundPawn);
    }

    @Test
    public void canAddKnight(){
        ChessBoard board = new ChessBoard();
        Knight knight = new Knight(BLACK);
        board.add(knight, "c1");

        Knight foundKnight = (Knight) board.getPieceAtCoords("c1");
        assertEquals(knight, foundKnight);
    }

}
