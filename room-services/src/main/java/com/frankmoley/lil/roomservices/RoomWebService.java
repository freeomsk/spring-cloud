package com.frankmoley.lil.roomservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomWebService {
    private final RoomRepository repository;

    public RoomWebService(RoomRepository repository) {
        super();
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Room> getAllRooms() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Room getRoom(@PathVariable("id")long id) {
        return this.repository.findById(id).get();
    }
}
