package BusinessLogicLayer;

import java.util.List;

//This class is used for serialization and storing the objects...

/**
 * BookingList
 */
public class BookingList {

    private List<BookingsCreated> bookingList; 

    public BookingList() {
    }

    public BookingList(List<BookingsCreated> bookingList) {
        this.bookingList = bookingList;
    }

    public List<BookingsCreated> getBookingList() {
        return this.bookingList;
    }

    public void setBookingList(List<BookingsCreated> bookingList) {
        this.bookingList = bookingList;
    }

    public BookingList bookingList(List<BookingsCreated> bookingList) {
        setBookingList(bookingList);
        return this;
    }     
}