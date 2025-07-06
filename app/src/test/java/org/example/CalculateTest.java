package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void testSum_TwoAndThree_ReturnsFive() {
        Calculate calc = new Calculate();
        assertEquals(5, calc.sum(2, 3));
    }

    @Test
    public void testAverage_TwoAndThree_ReturnsTwoPointFive() {
        Calculate calc = new Calculate();
        assertEquals(2.5, calc.average(2, 3), 0.001);
    }

    @Test
    public void testSumBetween_OneToTen_Returns55() {
        Calculate calc = new Calculate();
        assertEquals(55, calc.sumBetween(1, 10));
    }

    @Test
    public void testAverageBetween_OneToTen_ReturnsFivePointFive() {
        Calculate calc = new Calculate();
        assertEquals(5.5, calc.averageBetween(1, 10), 0.001);
    }

    @Test
    public void testSumOddBetween_OneToTen_Returns25() {
        Calculate calc = new Calculate();
        assertEquals(25, calc.sumOddBetween(1, 10));
    }

    @Test
    public void testSumEvenBetween_OneToTen_Returns30() {
        Calculate calc = new Calculate();
        assertEquals(30, calc.sumEvenBetween(1, 10));
    }
}
