package Exercise8;

// Exercise copied from https://github.com/NeutrinoSys/java-foundations-solutions/tree/master/src/main/java/com/neutrinosys/java/foundations/solutions/section8_more_oop/ex8
// my own attempts did not work well - need to learn how to create from scratch and come up with better strategy
// copied by breaking it down one by one making sure I understand each and every code used.
public class ChessBoard {
    private ChessPiece[][] internalBoard = new ChessPiece[8][8];
    private ChessPiece[] whiteCapturedPieces = new ChessPiece[0];
    private ChessPiece[] blackCapturedPieces = new ChessPiece[0];

    public void add(ChessPiece piece, String chessCoords){
        Coordinates coords = new Coordinates(chessCoords);
        piece.setCoordinates(coords);
        internalBoard[coords.getX()][coords.getY()] = piece;
    }

    public ChessPiece getPieceAtCoords(String chessCoords){
        Coordinates coords = new Coordinates(chessCoords);
        return internalBoard[coords.getX()][coords.getY()];

    }



}
