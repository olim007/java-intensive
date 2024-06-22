package coworking_service.models;

public class Bookings {
    private int id;
    private User user;
    private String date;
    private String service_type;

    public Bookings(int id, User user, String date, String service_type) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.service_type = service_type;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getDate() {
        return date;
    }

    public String getService_type() {
        return service_type;
    }
}
