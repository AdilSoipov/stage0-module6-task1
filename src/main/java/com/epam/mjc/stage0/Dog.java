package com.epam.mjc.stage0;
class Dog extends Animal {

  public Dog(String dogColor, int dogNumberOfPaws, boolean dogHasFur){
    super(dogColor, dogNumberOfPaws, dogHasFur);
    
  }
   void getDescription(){
        System.out.println("This animal is mostly " + color + ". It has " + numberOfPaws + " " + stringNumberOfPaws(numberOfPaws) + " and " + booleanHasFur(hasFur) + "fur.");
    }
  public static void main(String[] args){
   Dog myDog = new Dog("brown", 4. false);
   myDog.getDescription(); 
  }
    
  

}

