package PresentationLayer;

import java.util.Scanner;

import BusinessLogicLayer.Menu;

/**
 * Client This Is Just Temporary
 */
public class Client {
    
    /**
     *
     */
    private static final String clear = "\033[H\033[2J";

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);        
        boolean loopcontroll = true;    
        Menu menu = new Menu();

        // Creating the loop that 

        while(loopcontroll == true) {           
            menu.MainMenuDisplay();
            String option = scan.nextLine();
            switch (Integer.parseInt(option)) {
                case 0:
                    System.out.print(clear);  
                    System.out.flush();  
                    menu.addClient();
                    break;
                case 1:
                System.out.print(clear);  
                System.out.flush();  
                menu.ViewClients();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.print(clear);  
                    System.out.flush();  
                    menu.AllBookingsMenuDisplay();                        

                    break;
                case 5:
                    System.out.print(clear);  
                    System.out.flush();  
                    menu.EditBookingsDisplay();
                    
                    break;  
                case 6:
                    
                    break; 
                case 7:
                    System.out.print(clear);  
                    System.out.flush();
                    menu.GoodbyeDisplay(); 
                    loopcontroll = false;                 
                    break;            
            }
        }    
    }    
}