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
    
    public String booleanHasFur(boolean hasFur){
    if (hasFur == true){
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
    String res  = "This animal is mostly " + color + ". It has " + numberOfPaws + " " + stringNumberOfPaws(numberOfPaws) + " and " + booleanHasFur(hasFur) + " fur.";
    return res;
}
            
        
    
    
    
}
