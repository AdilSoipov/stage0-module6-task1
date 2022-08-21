package com.epam.mjc.stage0;

public class Animal {
    String color;
    int numberOfPaws;
    boolean hasFur;
    Animal(String animalColor, int animalNumberOfPaws, boolean animalHasFur){
        this.color = animalColor;
        this.numberOfPaws = animalNumberOfPaws;
        this.hasFur = animalHasFur;
    }
    String booleanHasFur(boolean hasFur){
        if (hasFur == true){
            return "has ";
            
        }
        else{
            return "has no";
        }
        
    }
    String stringNumberOfPaws(int numberOfPaws){
        if(numberOfPaws > 1){
            return "paws";
        }
        else{
            return "paw";
        }
        
    }
    void getDescription(){
        System.out.println("This animal is mostly " + color + ". It has " + numberOfPaws + " " + stringNumberOfPaws(numberOfPaws) + " and " + booleanHasFur(hasFur) + " fur.");
    }
    
    

}
