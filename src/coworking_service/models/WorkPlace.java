package coworking_service.models;

public class WorkPlace {
    private final int id;
    private final String name;

    public WorkPlace(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
