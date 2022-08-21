package com.epam.mjc.stage0;

class Animal{
    String color;
    int numberOfPaws;
    boolean hasFur;
    Animal(String animalColor, int animalNumberOfPaws, boolean animalHasFur){
        this.color = animalColor;
        this.numberOfPaws = animalNumberOfPaws;
        this.hasFur = animalHasFur;
    }


    void getDescription(){
        
        System.out.print("This animal is mostly " + color + ".");
        if (numberOfPaws > 1){
            System.out.print(" It has " + numberOfPaws + " paws ");

        }
        else if(numberOfPaws == 1){
           System.out.print(" It has " + numberOfPaws + " paw ");

        }
        if (hasFur){
            System.out.print("and a fur.");
        }
        else{
            System.out.print("and no fur.");
        }
            
        }
            
        
    
    
    
}
