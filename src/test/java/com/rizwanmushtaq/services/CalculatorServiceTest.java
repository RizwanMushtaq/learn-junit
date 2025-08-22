package com.rizwanmushtaq.services;

import org.junit.*;

public class CalculatorServiceTest {
  @BeforeClass
  public static void init() {
    System.out.println("Initializing CalculatorService tests...");
  }

  @AfterClass
  public static void cleanup() {
    System.out.println("Cleaning up after CalculatorService tests...");
  }

  @Before
  public void beforeEach() {
    System.out.println("Running before each test...");
  }

  @After
  public void afterEach() {
    System.out.println("Running after each test...");
  }

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
