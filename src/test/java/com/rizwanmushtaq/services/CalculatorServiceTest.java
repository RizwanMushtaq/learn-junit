package com.rizwanmushtaq.services;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {
  @Test
  public void addTest() {
    int result = CalculatorService.add(2, 3);
    int expected = 5;
    Assert.assertEquals(expected, result);
  }

  @Test
  public void subtractTest() {
    int result = CalculatorService.subtract(5, 3);
    int expected = 2;
    Assert.assertEquals(expected, result);
  }

  @Test
  public void multiplyTest() {
    int result = CalculatorService.multiply(4, 5);
    int expected = 20;
    Assert.assertEquals(expected, result);
  }

  @Test
  public void divideTest() {
    double result = CalculatorService.divide(10, 2);
    double expected = 5.0;
    Assert.assertEquals(expected, result, 0.001);
  }
}
