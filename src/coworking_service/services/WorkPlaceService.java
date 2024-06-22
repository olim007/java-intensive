package coworking_service.services;

import coworking_service.models.WorkPlace;

import java.util.ArrayList;
import java.util.List;

public class WorkPlaceService {
    private List<WorkPlace> workPlaces = new ArrayList<>();

    public WorkPlaceService(List<WorkPlace> workPlaces) {
        this.workPlaces = workPlaces;
    }

    public void setWorkPlaces(WorkPlace workPlace) {
        this.workPlaces.add(workPlace);
    }

    public List<WorkPlace> getWorkPlaces() {
        return workPlaces;
    }
}
