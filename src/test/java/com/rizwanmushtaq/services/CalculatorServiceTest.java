package com.rizwanmushtaq.services;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    assertEquals(expected, result, "Addition result should be 5");
  }

  @Test
  public void subtractTest() {
    int result = CalculatorService.subtract(5, 3);
    int expected = 2;
    assertEquals(expected, result, "Subtraction result should be 2");
  }

  @Test
  public void multiplyTest() {
    int result = CalculatorService.multiply(4, 5);
    int expected = 20;
    assertEquals(expected, result, "Multiplication result should be 20");
  }

  @Test
  public void divideTest() {
    double result = CalculatorService.divide(10, 2);
    double expected = 5.0;
    assertEquals(expected, result, 0.001, "Division result should be 5.0");
  }
}
