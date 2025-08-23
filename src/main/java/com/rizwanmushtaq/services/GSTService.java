package com.rizwanmushtaq.services;

public class GSTService {
  private GSTProvider gstProvider;

  public GSTService(GSTProvider gstProvider) {
    this.gstProvider = gstProvider;
  }

  public int calculateGST() {
    System.out.println("Calculating GST...");
    int rate = this.gstProvider.getGSTDetail();
    System.out.println("GST Rate: " + rate);
    return rate;
  }
}
