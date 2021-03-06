package BusinessLogicLayer;
import java.util.*;
import java.io.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import DataAccesLayer.FileHandeler;

public class Menu {
    

    FileHandeler filehand = new FileHandeler();

    public void MainMenuDisplay(){

        System.out.printf("Please select an option:%n0. Add new client%n1. view clients%n2. Add event%n3. View all events%n4. View all bookings%n5. Edit bookings%n");
    }

    public void AllBookingsMenuDisplay() throws FileNotFoundException{
        System.out.printf("Displaying All Bookings: %n");        
        BookingList book = filehand.readBooking();
        for (BookingsCreated variable : book.getBookingList()){
            System.out.printf("%s %s %s %s %s\n",variable.getClient().getCname(),variable.getClient().getCsurname(),variable.getClient().getCnumber(),variable.getClientEvent().VenueName,variable.getClientEvent().getVenueAddress());
        }
    }

    public void EditBookingsDisplay(){
        System.out.printf("Edit Bookings:");
    }

    public void GoodbyeDisplay(){
        System.out.printf("Goodbye!");
    }

    public void AddEventPrint()
    {
        System.out.println("Please choose one of the following: ");
        System.out.println("1. Add Client");
        System.out.println("2. Choose existing Client ");
        System.out.println("3. Return");
        System.out.println("4. Exit ");

    }

    public void ChooseClientPrint()
    {
        System.out.println("Choose one of the following clients:");
    }

    public void ViewEventsPrint()
    {
        System.out.println("Display all Event:");
    }

    public static void AddClient(){
        Scanner ClientInput = new Scanner(System.in);
        
        System.out.println("Enter Client's name");
        String name =ClientInput.nextLine();
        ClientClass ClientInfo = new ClientClass();
        ClientInfo.
        System.out.println("Enter Client's Surname");
        String surname = ClientInput.nextLine();

        System.out.println("Enter Client's Telephone number");
        String cellnumber = ClientInput.nextLine();

    }

    public static void ViewClients(){
        System.out.println("Printing all Clients");
    }
}
