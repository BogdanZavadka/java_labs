package iot.models;

public class AnimalInfo extends AnimalSize {
    String animalType;
    String animalName;
    int animalAgeInMonth;
    String feedType;
    double dailyAmountOfFeedInGrams;
    double priceInUAH;
    public AnimalInfo(double lengthInCm, double weightInGrams, String animalType, String animalName, int animalAgeInMonth, String feedType, double dailyAmountOfFeedInGrams, double priceInUAH){
        AnimalSize animalSize = new AnimalSize(lengthInCm, weightInGrams);
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalAgeInMonth = animalAgeInMonth;
        this.feedType = feedType;
        this.dailyAmountOfFeedInGrams = dailyAmountOfFeedInGrams;
        this.priceInUAH = priceInUAH;
    }
}
