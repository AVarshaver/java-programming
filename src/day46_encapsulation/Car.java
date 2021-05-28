package day46_encapsulation;

public class Car {
    //encapsulated/hidden instance variables
private String model;
private int year;
private int mileage;
//full encapsulation from line 9-17
//SETTER METHOD FOR MODEL-normally it's public and setter - void(doesnot return snything)
    public void setModel(String carModel) {
        model = carModel;
    }

    //GETTER METHOD for model - ALSO PUBLIC
    public String getModel() {
        return model;
    }

    //setter for year
    public void setYear (int year){
        this.year = year;
    }
    //getter for year
    public int getYear(){
        return year;
    }

    //getter setter for mileage
    //generate toString
    public int getMileage() {
        return mileage; //this.mileage will also work
    }
    //myCar.setMileage(45230);
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override //right click - generate - toString - choose all - ok
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}

