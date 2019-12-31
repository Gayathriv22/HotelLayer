package service;

import dao.GuestlDaoImp;
import enitities.Guest;
import exceptions.IncorrectIdException;

import java.util.*;

public class GuestServiceImp implements GuestService {
    private GuestlDaoImp dao;

    public GuestServiceImp(GuestlDaoImp dao) {
        this.dao = dao;
    }

    @Override
    public void addGuest(Guest g) {
        dao.addGuest(g);
    }

    @Override
    public Guest findById(int id) {
        if ( id < 0){
            throw new IncorrectIdException("id is wrong " + id);
        }
        Guest g = dao.findById(id);
        return g;
    }

    @Override
    public Set<Guest> addAllGuests() {
        Set<Guest> guest1 = dao.addAllGuests();
        return guest1;
    }
}
