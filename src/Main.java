
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;
import java.util.Scanner;
import business.BusinessToy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BusinessToy americanToyBusiness = new BusinessToy(new AmericanToyFactory());
        BusinessToy asianToyBusiness = new BusinessToy(new AsianToyFactory());
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Introducir comando: ");
            String opt = sc.nextLine();
            System.out.println();
            switch(opt){
                case "exit":
                    System.out.println("Saliendo del sistema\n");
                    System.exit(0);
                    break;
                case "asiancar":
                    asianToyBusiness.produceToy("car");
                    break;
                case "asianhelicopter":
                    asianToyBusiness.produceToy("helicopter");
                    break;
                case "americancar":
                    americanToyBusiness.produceToy("car");
                    break;
                case "americanhelicopter":
                    americanToyBusiness.produceToy("helicopter");
                    break;
                default:
                    System.out.println("Command unknown!\n");
                    
            }
        }
    }
    
}
