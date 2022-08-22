package com.epam.mjc.stage0;

class Animal{
    String color;
    int numberOfPaws;
    boolean hasFur;
    Animal(String animalColor, int animalNumberOfPaws, boolean animalHasFur){
        color = animalColor;
        numberOfPaws = animalNumberOfPaws;
        hasFur = animalHasFur;
    }
    
    public String booleanHasFur(boolean hasFur){
    if (hasFur){
        return "a";
    }
    else{
        return "no";
    }
 }
    public String stringNumberOfPaws(int num){
    if(num > 1){
    return "paws";
    }
    else{
    return "paw";
    }
    }


   public String  getDescription(){
    return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + stringNumberOfPaws(numberOfPaws) + " and " + booleanHasFur(hasFur) + " fur.";
    
}
            
        
    
    
    
}
