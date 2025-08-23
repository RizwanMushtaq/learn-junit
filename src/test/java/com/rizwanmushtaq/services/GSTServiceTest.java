package com.rizwanmushtaq.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GSTServiceTest {
  @Test
  public void gstCalculatorTest() {
    GSTProvider mockProvider = Mockito.mock(GSTProvider.class);
    GSTService gstService = new GSTService(mockProvider);
    Mockito.when(mockProvider.getGSTDetail()).thenReturn(18);
    int actualResult = gstService.calculateGST();
    Assertions.assertEquals(18, actualResult);
  }
}
