package com.john.spring.req;

public class SelectBuilding {

   private Integer buildingNumber;
   private String estateCode;

   public Integer getBuildingNumber() {
      return buildingNumber;
   }

   public void setBuildingNumber(Integer buildingNumber) {
      this.buildingNumber = buildingNumber;
   }

   public String getEstateCode() {
      return estateCode;
   }

   public void setEstateCode(String estateCode) {
      this.estateCode = estateCode;
   }

   @Override
   public String toString() {
      return "SelectBuilding{" +
              "buildingNumber='" + buildingNumber + '\'' +
              ", estateCode='" + estateCode + '\'' +
              '}';
   }
}
