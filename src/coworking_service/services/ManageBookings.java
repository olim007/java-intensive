package coworking_service.services;

import coworking_service.models.Bookings;

import java.util.ArrayList;
import java.util.List;

public class ManageBookings {
    private List<Bookings> bookings = new ArrayList<>();

    public ManageBookings(List<Bookings> bookings) {
        this.bookings = bookings;
    }


}
