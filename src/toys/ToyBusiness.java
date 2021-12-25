/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toys;

/**
 *
 * @author edwin
 */
public class ToyBusiness {
    public SerialNumberGenerator generator;
    
    
    public Car createCar(){
        Car coche = new Car(generator.next());
        coche.pack();
        coche.label();
        return coche;
    }
    
    public Helicopter createHelicopter(){
        Helicopter helicoptero = new Helicopter(generator.next(), "classic");
        helicoptero.pack();
        helicoptero.label();
        return helicoptero;
    }
}
