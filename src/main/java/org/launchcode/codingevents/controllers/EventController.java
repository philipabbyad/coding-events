package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    //private static List<String> events = new ArrayList<>();
    private static HashMap<String, String> events = new HashMap<>();

    // path is /events
    @GetMapping
    public String displayAllEvents(Model model) {
        events.put("Agile2022", "Agile Conference in Nashville, TN");
        events.put("UberConf 2022", "Java conference in Denver, CO");
        events.put("Hugo Conf", "Goland conference Online");
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        return "events/index";
    }

    // path is /events/create
    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    // path is /events/create (Ok to share path as above because they handle different types of requests)
    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName, String eventDescription) {
        events.put(eventName, eventDescription);
        // Non-specified redirect redirects user to root path of controller, which is /events in this case
        return "redirect:";
    }

}
