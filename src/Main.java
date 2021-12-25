
import java.util.Scanner;
import toys.Car;
import toys.SerialNumberGenerator;

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
        SerialNumberGenerator generator  = new SerialNumberGenerator();
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
                default:
                    Car coche = new Car(generator.next());
                    coche.pack();
                    coche.label();
                    break;
            }
        }
    }
    
}
