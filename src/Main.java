
import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;
import java.util.Scanner;
import business.ToyBusiness;

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
        ToyBusiness americanToyBusiness = new AmericanToyBusiness();
        ToyBusiness asianToyBusiness = new AsianToyBusiness();
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
                    asianToyBusiness.createToy("car");
                    break;
                case "asianhelicopter":
                    asianToyBusiness.createToy("helicopter");
                    break;
                case "americancar":
                    americanToyBusiness.createToy("car");
                    break;
                case "americanhelicopter":
                    americanToyBusiness.createToy("helicopter");
                    break;
                default:
                    System.out.println("Command unknown!\n");
                    
            }
        }
    }
    
}
