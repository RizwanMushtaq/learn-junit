package com.rizwanmushtaq.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GSTServiceTest {
  @Mock
  private GSTProvider mockProvider;
  @InjectMocks
  private GSTService gstService;

  @Test
  public void gstCalculatorTest() {
    GSTProvider mockProvider1 = Mockito.mock(GSTProvider.class);
    GSTService gstService1 = new GSTService(mockProvider1);
    Mockito.when(mockProvider1.getGSTDetail()).thenReturn(18);
    int actualResult = gstService1.calculateGST();
    Assertions.assertEquals(18, actualResult);
  }

  @Test
  public void gstCalculatorTest2() {
    Mockito.when(mockProvider.getGSTDetail()).thenReturn(10);
    int actualResult = gstService.calculateGST();
    Assertions.assertEquals(10, actualResult);
  }
}
