package com.rizwanmushtaq.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTest {
  @BeforeAll
  public static void init() {
    System.out.println("Initializing CalculatorService tests...");
  }

  @AfterAll
  public static void cleanup() {
    System.out.println("Cleaning up after CalculatorService tests...");
  }

  @BeforeEach
  public void beforeEach() {
    System.out.println("Running before each test...");
  }

  @AfterEach
  public void afterEach() {
    System.out.println("Running after each test...");
  }

  @Test
  public void addTest() {
    int result = CalculatorService.add(2, 3);
    int expected = 5;
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void subtractTest() {
    int result = CalculatorService.subtract(5, 3);
    int expected = 2;
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void multiplyTest() {
    int result = CalculatorService.multiply(4, 5);
    int expected = 20;
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void divideTest() {
    double result = CalculatorService.divide(10, 2);
    double expected = 5.0;
    Assertions.assertEquals(expected, result, 0.001);
  }
}
