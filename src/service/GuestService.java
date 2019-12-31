package service;
import enitities.Guest;

import java.util.*;
public interface GuestService {

    void addGuest(Guest g);
    Guest findById(int id);
    Set<Guest>addAllGuests();

}
