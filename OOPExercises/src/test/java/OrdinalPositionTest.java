import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdinalPositionTest {
//    public static void main(String[] args) {
//        System.out.println(testOrdinalPosition("E"));
//    }

    @Test
    public void testOrdinalPosition(){
        int e = OrdinalPositions.valueOf("E").getOrdinal();
        int h = OrdinalPositions.valueOf("H").getOrdinal();
        int g = OrdinalPositions.valueOf("G").getOrdinal();
        int k = OrdinalPositions.valueOf("K").getOrdinal();

//        System.out.println(e);
        assertEquals(e, 5);
        assertEquals(h, 8);
        assertEquals(g, 7);
        assertEquals(k, 11);

    }
}
