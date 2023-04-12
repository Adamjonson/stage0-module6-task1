package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public Animal(){

    }

    public String getDescription(){
        String text;
        if (numberOfPaws > 1){
            if (hasFur){
                text = "This animal is mostly " + color +
                        " It has " + numberOfPaws + " paws and a fur";
            }else {
                text = "This animal is mostly " + color +
                        " It has " + numberOfPaws + " paws and no fur";
            }
        }else {
            if (hasFur){
                text = "This animal is mostly " + color +
                        " It has " + numberOfPaws + " paw and a fur";
            }else {
                text = "This animal is mostly " + color +
                        " It has " + numberOfPaws + " paw and no fur";
            }
        }
        return text;
    }
}
