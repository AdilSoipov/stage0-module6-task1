package com.epam.mjc.stage0;

class Bird extends Animal {

public Bird(String birdColor, int birdNumberOfPaws, boolean birdHasFur){
    super(birdColor, birdNumberOfPaws, birdHasFur);}
   @Override
   void getDescription(){
        System.out.println("This animal is mostly " + super.color + ". It has " + super.numberOfPaws + " " + super.stringNumberOfPaws(super.numberOfPaws) + " and " + super.booleanHasFur(super.hasFur) + " " + "fur." + " Moreover, it has 2 wings and can fly");
    
 
  } 
    
  

}

