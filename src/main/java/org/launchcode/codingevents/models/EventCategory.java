package org.launchcode.codingevents.models;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EventCategory extends AbstractEntity{

    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    // Mapped By value has to be the name of the field in the class we're storing that creates the relationship
    @OneToMany(mappedBy = "eventCategory")
    //List itself cannot change, contents still can
    private final List<Event> events = new ArrayList<>();

    public EventCategory(@Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.") String name) {
        this.name = name;
    }

    public EventCategory() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return name;
    }

}
