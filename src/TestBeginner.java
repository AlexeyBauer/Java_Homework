import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class TestBeginner {
    private Beginner TestBeginner;


    @Test
    public void testSleepIn1() {
        assertTrue(true);
    }

    @Test
    public void testSleepIn2() {
        assertFalse(false);
    }

    @Test
    public void testSleepIn3() {
        assertTrue(true);
    }

    @Test
    public void testDiff21_1() {
        int act = TestBeginner.diff21(15);
        assertEquals(6, act);
    }

    @Test
    public void testDiff21_2() {
        int act = TestBeginner.diff21(26);
        assertEquals(10, act);
    }

    @Test
    public void testEndUp1() {
        String act = TestBeginner.endUpp("Motor");
        assertEquals("MoTOR", act);
    }

    @Test
    public void testEndUp2() {
        String act = TestBeginner.endUpp("Go");
        assertEquals("GO", act);
    }

    @Test
    public void testMaximum() {
        int act = TestBeginner.Maximum(1, 2, 3);
        assertEquals(3, act);
    }

    @Test
    public void testCommonEnd() {
        int[] a = {1, 2, 3};
        int[] b = {7, 3};
        assertTrue(TestBeginner.commonEnd(a, b));
    }

    @Test
    public void testSum2_1() {

        int[] num = {3, 2, 5};
        int sum = TestBeginner.sum2(num);
        assertEquals(5, sum);
    }

    @Test
    public void testSum2_2() {

        int[] nums = {2, 6};
        int sum = TestBeginner.sum2(nums);
        assertEquals(8, sum);
    }

    @Test
    public void testCountEvens() {
        int[] arr = {2, 4, 8, 3, 7, 6};
        int count = TestBeginner.countEvens(arr);
        assertEquals(4, count);
    }

    @Test
    public void testZeroMax() {
        int[] arr = {0, 7, 0, 5};
        int[] actArr = TestBeginner.zeroMax(arr);
        int[] expArr = {7, 7, 5, 5};
        assertArrayEquals(expArr, actArr);
    }

    @Test
    public void testShiftLeft() {
        int[] arr = {6, 2, 5, 3};
        int[] actArr = TestBeginner.shiftLeft(arr);
        int[] expArr = {2, 5, 3, 6};
        assertArrayEquals(expArr, actArr);
    }

    @Test
    public void testNonStart2() {
        String actual = TestBeginner.nonStart("Run", "Forest");
        assertEquals("unorest", actual);
    }

    @Test
    public void testMiddleTwo() {

        String actual = TestBeginner.middleTwo("string");
        assertEquals("ri", actual);
    }
}