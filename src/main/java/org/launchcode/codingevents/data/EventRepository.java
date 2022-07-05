package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This annotation flags to springboot that this is a class for it to manage for us
@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
