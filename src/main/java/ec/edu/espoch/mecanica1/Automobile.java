
package ec.edu.espoch.mecanica1;


public class Automobile {
//constructor
    public Automobile(String brand, int model, double engine, FuelType FuelType, CarType CarType, int numberOfDoors, int numberOfSeats, double maximumSpeed, Color color, double currentSpeed) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.FuelType = FuelType;
        this.CarType = CarType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public Automobile() {
    }
    
    
    
//Atricbutos
private String brand;
private int model;
private double engine;
private FuelType FuelType;
private CarType CarType;
private int numberOfDoors;
private int numberOfSeats;
private double maximumSpeed;
private Color color;
private double currentSpeed;

//setters y getters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public FuelType getFuelType() {
        return FuelType;
    }

    public void setFuelType(FuelType FuelType) {
        this.FuelType = FuelType;
    }

    public CarType getCarType() {
        return CarType;
    }

    public void setCarType(CarType CarType) {
        this.CarType = CarType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }


public void accelerate(double speed){
    if (currentSpeed + speed > maximumSpeed) {
        System.out.println("No se puede acelerar . Supera la velocidad máxima.");
        
    }else{ 
        currentSpeed += speed;
        System.out.println("Velocidad actual:" + currentSpeed +" km/h");
    }
    
}

public void decelerate(double speed){
     if (currentSpeed - speed < 0) {
        System.out.println("No se puede desacelerar a una velocidad negativa. ");
        
    }else{ 
        currentSpeed -= speed;
        System.out.println("Velocidad actual:" + currentSpeed +" km/h");
    }
}
public void brake(){
   
    currentSpeed = 0;
    System.out.println("Current speed: " + currentSpeed);
}

public double calculateTime(double distance){
    
   
    if (currentSpeed == 0) {
        System.out.println("No se puede calcular el tiempo porque el automóvil está detenido.");
        return 0;
    }
    return distance/ currentSpeed;
}

public void show(){
    
    System.out.println(" DATOS DEL AUTOMÓVIL ");
    System.out.println("Marca: " + brand);
    System.out.println("Modelo: " + model);
    System.out.println("Motor: " + engine + " litros");
    System.out.println("Tipo de combustible: " + FuelType);
    System.out.println("Tipo de automóvil: " + CarType);
    System.out.println("Número de puertas: " + numberOfDoors);
    System.out.println("Número de asientos: " + numberOfSeats);
    System.out.println("Velocidad máxima: " + maximumSpeed + " km/h");
    System.out.println("Color: " + color);
    System.out.println("Velocidad actual: " + currentSpeed + " km/h");
}
}
        
        
        