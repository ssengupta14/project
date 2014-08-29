package com.elenverve.dvo;

import java.util.List;

/* 
Purchase history class
*/

public class PurchaseHistoryDvo {

  private long customerId;
  private List<PurchaseDvo> purchases;
  
  public long getCustomerId(){
    return customerId;
  }
  public void setCustomerId(long customerId){
    this.customerId=customerId;
  }
  public List<PurchaseDvo> getPurchaseHistory(){
    return purchases;
  }
  public void addToPurchaseHistory(PurchaseDvo purchase){
    this.purchases.add(purchase);
  }
}  
  
    
  
  
  
