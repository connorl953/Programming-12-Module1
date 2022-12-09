import com.connor.module14.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    /**
     * Test for heronHeight() using getHeight()
     *
     * Test:
     * Input: side1 = 9, side2 = 10, side3 = 11
     * Expected output: 6 * sqrt(2) or 8.485281374239

     */
    @Test
    void getHeight() {
        Triangle t1 = new Triangle(9.0, 10.0, 11.0);
        assertEquals(6*Math.sqrt(2), t1.getHeight(), 0.001);

    }
    /**
     * Test for getArea()
     *
     * Test 1:
     * Input: width = 4, height = 5
     * Expected output: 10
     *
     * Test 2:
     * Input:  side1 = 9, side2 = 10, side3 = 11
     * Expected output: 42.42640687119
     */
    @Test
    void getArea() {
        Triangle t1 = new Triangle(4, 5);
        assertEquals(10, t1.getArea(), 0.001);

        Triangle t2 = new Triangle(9.0, 10.0, 11.0);
        assertEquals(42.42640687119, t2.getArea(), 0.001);
    }
}