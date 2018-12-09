package main;

import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {
  
  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;
  static int currentProductionNumber;
  
  public Product(String name) {
    serialNumber = currentProductionNumber;
    manufacturer = MANUFACTURER;
    manufacturedOn = new Date();
    this.name = name;
    currentProductionNumber ++;
  }
  
    public int compareTo(Product prod) {
        int result = this.name.compareToIgnoreCase(prod.name);
        if(result != 0){
            return result;
        }else{
            return new Double(this.serialNumber).compareTo(new Double(prod.serialNumber));
        }   
    }
  
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
          +"Serial Number : " + serialNumber + "\n"
          +"Date : " + manufacturedOn + "\n"
          +"Name : " + name;
  }
  
  public void setProductionNumber(int number) {
    this.serialNumber = number;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public Date getManufacturedDate() {
    return manufacturedOn;
  }
  public int getSerialNumber() {
    return serialNumber;
  }

}
