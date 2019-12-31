package ui;

import dao.GuestlDaoImp;
import enitities.Guest;
import service.GuestService;
import service.GuestServiceImp;

import java.util.*;


public class GuestUi {
    private GuestService gs = new GuestServiceImp(new GuestlDaoImp());

    public static void main(String[] args) {
        GuestUi g1 = new GuestUi();
        g1.runUi();

    }

    public void runUi() {
        try {
            Guest g2 = new Guest(1, "Siya");
            Guest g3 = new Guest(2, "sid");
            gs.addGuest(g2);
            gs.addGuest(g3);
            Guest fetched1 = gs.findById(1);
            Guest fetched2 = gs.findById(2);
            System.out.println(fetched1.getName());
            System.out.println(fetched2.getName());
            Set<Guest> guesto = new HashSet<>();
            guesto = gs.addAllGuests();
            print(guesto);

        } catch (Throwable c) {
            System.out.println("something went wrong");

        }
    }

    public void print(Set<Guest> guests) {
        for (Guest g : guests) {
            System.out.println(g.getName());

        }

    }
}
