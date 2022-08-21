package com.epam.mjc.stage0;
class Dog extends Animal {

  public Dog(String dogColor, int dogNumberOfPaws, boolean dogHasFur){
    super(dogColor, dogNumberOfPaws, dogHasFur);
    
  }
   void getDescription(){
        System.out.println("This animal is mostly " + super.color + ". It has " + super.numberOfPaws + " " + super.stringNumberOfPaws(super.numberOfPaws) + " and " + super.booleanHasFur(super.hasFur) + "fur.");
    }
 
  
    
  

}

