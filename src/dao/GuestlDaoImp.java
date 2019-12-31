package dao;

import enitities.Guest;
import exceptions.IncorrectIdException;

import java.util.*;

public class GuestlDaoImp implements GuestDao {
    public Map<Integer, Guest> store = new HashMap<>();



    @Override
    public void addGuest(Guest g) {
        store.put(g.getId(), g);

    }

    @Override
    public Guest findById(int id) {
        Guest p=store.get(id);

        if( id<0){
            throw new IncorrectIdException("this id is not available"+id);
        }
        return p;
    }

    @Override
    public Set<Guest> addAllGuests() {
        Collection<Guest> guest1 = store.values();
        Set<Guest> guests = new HashSet<>();
        return guests;
    }
}
