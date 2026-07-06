package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testGetIndividualFee_Under12() {
    Calculate calc = new Calculate();
    assertEquals(1000, calc.getIndividualFee(10));
  }

  @Test
  public void testGetIndividualFee_Over13() {
    Calculate calc = new Calculate();
    assertEquals(2000, calc.getIndividualFee(25));
  }

  @Test
  public void testGetTotalFee_Normal() {
    Calculate calc = new Calculate();
    assertEquals(1000, calc.getTotalFee(10, 1));
  }

  @Test
  public void testGetTotalFee_Discount() {
    Calculate calc = new Calculate();
    assertEquals(13500, calc.getTotalFee(10, 15));
  }
}
