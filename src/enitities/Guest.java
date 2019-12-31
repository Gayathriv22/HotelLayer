package enitities;

import java.util.*;

public class Guest {
    private int id;
    private String name;

    public Guest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Guest)) {
            return false;
        }

        Guest guest = (Guest) o;
        return id == guest.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
