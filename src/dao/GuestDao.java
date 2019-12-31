package dao;

import enitities.Guest;

import java.util.HashSet;
import java.util.Set;

public interface GuestDao {
    void addGuest(Guest g);

    Guest findById(int id);

    Set<Guest> addAllGuests();

}
