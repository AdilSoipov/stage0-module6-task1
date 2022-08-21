package com.epam.mjc.stage0;

class Bird extends Animal {

public Bird(String birdColor, int birdNumberOfPaws, boolean birdHasFur){
    super(birdColor, birdNumberOfPaws, birdHasFur);}
   @Override
   void getDescription(){
       super.getDescription()
        System.out.print(" Moreover, it has 2 wings and can fly");
    
 
  } 
    
  

}

