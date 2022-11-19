package com.alevel.java.nxchannel.api.controller;

import com.alevel.java.nxchannel.api.data.ThreadResponse;
import com.alevel.java.nxchannel.api.service.ThreadOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/threads")
public class ThreadController {

    private final ThreadOperations threadOperations;


    public ThreadController(ThreadOperations threadOperations) {
        this.threadOperations = threadOperations;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ThreadResponse getById(@PathVariable long id) {

        return threadOperations.getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Thread " + id + " not found"));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        threadOperations.delete(id);
    }


}
