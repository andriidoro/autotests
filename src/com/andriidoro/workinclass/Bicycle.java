package com.andriidoro.workinclass;



public class Bicycle {
    private int wheelSize;
    private String bicycleType;
    private String collorType;
    private String alloy;
    private int numberOfSpeeds;

    public Bicycle(int wheelSize){
         this.wheelSize = wheelSize;
    }
    public Bicycle(String bicycleType, int wheelSize){
        this.wheelSize = wheelSize;
        this.bicycleType = bicycleType;
    }
    public Bicycle(int wheelSize, String bicycleType, String collorType){
        this.wheelSize = wheelSize;
        this.bicycleType = bicycleType;
        this.collorType = collorType;
    }
    public Bicycle(int wheelSize, String bicycleType, String collorType, String alloy){
        this.wheelSize = wheelSize;
        this.bicycleType = bicycleType;
        this.collorType = collorType;
        this.alloy = alloy;
    }
    public Bicycle(int wheelSize, String bicycleType, String collorType, String alloy, int numberOfSpeeds){
        this.wheelSize = wheelSize;
        this.bicycleType = bicycleType;
        this.collorType = collorType;
        this.alloy = alloy;
        this.numberOfSpeeds = numberOfSpeeds;
    }
           public Bicycle() {
             this.wheelSize = 24;
             this.bicycleType = "track";
             this.collorType = "green";
             this.alloy = "aluminium";
             this.numberOfSpeeds = 8;
}

}
