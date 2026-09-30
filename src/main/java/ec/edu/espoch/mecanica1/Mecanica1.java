/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.mecanica1;


public class Mecanica1 {

    public static void main(String[] args) {
        
        Automobile automobileOne = new Automobile("Toyota", 2022, 1.8, FuelType.DIESEL, CarType.CITY_CAR, 4, 5, 200, Color.YELLOW, 0);
        automobileOne.show();
        automobileOne.setCurrentSpeed(100);
        System.out.println("currentSpeeed :" + automobileOne.getCurrentSpeed());
        automobileOne.accelerate(20);
        automobileOne.decelerate(50);
        automobileOne.brake();
        
    }
}
