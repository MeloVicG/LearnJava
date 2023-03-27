package Exercise8;

public class Coordinates {
    private final int x;
    private final int y;
    private String chessCoords;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates(String chessCoords) {
        this.chessCoords = chessCoords; // 'a2'
        char file = chessCoords.charAt(0); // x axis
        int rank = Integer.parseInt(Character.toString(chessCoords.charAt(1)));
        x = getXForFile(file);
        y = getYForRank(rank);
    }

    public Coordinates getOffset(int x, int y) {
        return new Coordinates(this.x + x, this.y + y);
    }

    @Override
    public boolean equals(Object o) { //equals should be tied to hash method
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && y == that.y;
    }

    public int getX() {
        return x;
    }
    private int getXForFile(char file) {
        return file - 97; //Integers have - and + numbers a=97
    }

    public int getY() {
        return y;
    }
    private int getYForRank(int rank) {
        return 8 - rank;
    }


}
