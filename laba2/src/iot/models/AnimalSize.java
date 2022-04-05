package iot.models;

public class AnimalSize {
    protected double lengthInCm;
    protected double weightInGrams;
    public AnimalSize(){}
    public AnimalSize(double lengthInCm, double weightInGrams){
        this.lengthInCm = lengthInCm;
        this.weightInGrams = weightInGrams;
    }
}
