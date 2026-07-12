package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculateTest {

    // 12歳以下
    @Test
    public void testGetIndividualFeeChild() {
        Calculate calc = new Calculate();
        assertEquals(1000, calc.getIndividualFee(10));
    }

    // 13歳以上
    @Test
    public void testGetIndividualFeeAdult() {
        Calculate calc = new Calculate();
        assertEquals(2000, calc.getIndividualFee(25));
    }

    // 割引なし
    @Test
    public void testGetTotalFeeWithoutDiscount() {
        Calculate calc = new Calculate();
        assertEquals(1000, calc.getTotalFee(10, 1));
    }

    // 子供15人（10%以上なので割引）
    @Test
    public void testGetTotalFeeWithDiscountChild() {
        Calculate calc = new Calculate();
        assertEquals(13500, calc.getTotalFee(10, 15));
    }

    // 大人15人（10%以上なので割引）
    @Test
    public void testGetTotalFeeWithDiscountAdult() {
        Calculate calc = new Calculate();
        assertEquals(27000, calc.getTotalFee(25, 15));
    }

    // 境界値：12歳
    @Test
    public void testBoundaryAge12() {
        Calculate calc = new Calculate();
        assertEquals(1000, calc.getIndividualFee(12));
    }

    // 境界値：13歳
    @Test
    public void testBoundaryAge13() {
        Calculate calc = new Calculate();
        assertEquals(2000, calc.getIndividualFee(13));
    }

    // 境界値：9人（割引なし）
    @Test
    public void testBoundaryGroup9() {
        Calculate calc = new Calculate();
        assertEquals(18000, calc.getTotalFee(25, 9));
    }

    // 境界値：10人（割引あり）
    @Test
    public void testBoundaryGroup10() {
        Calculate calc = new Calculate();
        assertEquals(18000, calc.getTotalFee(25, 10));
    }
}