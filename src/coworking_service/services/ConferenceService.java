package coworking_service.services;

import coworking_service.models.ConferenceRooms;

import java.util.ArrayList;
import java.util.List;

public class ConferenceService {
    private List<ConferenceRooms> conferenceRooms = new ArrayList<>();

    public ConferenceService(List<ConferenceRooms> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void setConferenceRooms(List<ConferenceRooms> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public List<ConferenceRooms> getConferenceRooms() {
        return conferenceRooms;
    }
}
