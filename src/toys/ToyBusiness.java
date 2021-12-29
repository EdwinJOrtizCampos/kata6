/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toys;

import toyproducts.Toy;
import toyproducts.models.CarToy;
import toyproducts.models.HelicopterToy;

/**
 *
 * @author edwin
 */
public class ToyBusiness {
    private final SerialNumberGenerator generator = new SerialNumberGenerator();
    
    
    public Toy createToy(String tipo){
        Toy toy;
        switch(tipo){
            case "coche":
                toy = new CarToy(generator.next());
                toy.pack();
                toy.label();
                return toy;
                
                
            case "helicopter":
                toy = new HelicopterToy(generator.next(), "classic");
                toy.pack();
                toy.label();
                return toy;
        }
        return toy = new CarToy(generator.next());
    }
}
