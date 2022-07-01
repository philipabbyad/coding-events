package org.launchcode.codingevents.data;

// Just contains static methods and properties

import org.launchcode.codingevents.models.Event;

import java.util.HashMap;
import java.util.Map;

public class EventData {

    // need a place to put events (data structure of some type) - main property
    private static Map<Integer, Event> events = new HashMap<>();

    // Behaviors:

    // Get all events

    // Get single event

    // Add an event
    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    // Remove and event

}
