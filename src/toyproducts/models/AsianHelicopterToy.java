/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyproducts.models;

import toyproducts.Toy;

/**
 *
 * @author edwin
 */
public class AsianHelicopterToy implements Toy{
    private int serialNumber;
    private String type;
    
    public AsianHelicopterToy(int serialNumber, String type){
        this.serialNumber = serialNumber;
        this.type = type;
    }
    
    public void pack(){
        
    }
    
    public void label(){
        
    }
}
