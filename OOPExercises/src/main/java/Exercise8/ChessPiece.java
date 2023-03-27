package Exercise8;

import static Exercise8.ChessPiece.Color.WHITE;
//import static Exercise8.ChessPiece.Color.BLACK;


public abstract class ChessPiece {
    protected Coordinates coordinates;
    protected Color color;

    public ChessPiece(Color color) {
        this.color = color;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }


    protected int calcYWithDirFactor(int yOffset){
        int dirFactor = color == WHITE ? 1 : -1;
        return yOffset * dirFactor;
    }

    abstract Coordinates[] getValidMoves();

    public enum Color{
        BLACK,
        WHITE;
    }

}
