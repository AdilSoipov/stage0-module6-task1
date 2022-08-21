package com.epam.mjc.stage0;

class Bird extends Animal {

public Bird(String birdColor, int birdNumberOfPaws, boolean birdHasFur){
    super(birdColor, birdNumberOfPaws, birdHasFur);
   @Override
   void getDescription(){
        System.out.println("This animal is mostly " + color + ". It has " + numberOfPaws + " " + stringNumberOfPaws(super.numberOfPaws) + " and " + booleanHasFur(hasFur) + " " + "fur." + " Moreover, it has 2 wings and can fly");
    }
  public static void main(String[] args){
  Bird myBird = new Bird("blue", 2, false);
  myBird.getDescription();
  
  } 
    
  

}

