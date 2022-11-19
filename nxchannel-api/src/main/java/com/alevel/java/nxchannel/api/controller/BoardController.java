package com.alevel.java.nxchannel.api.controller;

import com.alevel.java.nxchannel.api.data.CreateThreadRequest;
import com.alevel.java.nxchannel.api.data.ThreadPreviewResponse;
import com.alevel.java.nxchannel.api.service.ThreadOperations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
public class BoardController {

    private final ThreadOperations threadOperations;

    public BoardController(ThreadOperations threadOperations) {
        this.threadOperations = threadOperations;
    }


    @PostMapping(path = "/{board}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> createThread(@PathVariable String board,
                                             @Valid @ModelAttribute CreateThreadRequest request,
                                             UriComponentsBuilder ucb) {
        long theadId = threadOperations.create(board, request);
        return ResponseEntity.created(ucb.path("/threads/{id}").build(theadId)).build();
    }

    @GetMapping(path = "/{board}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<ThreadPreviewResponse> listThreads(@PathVariable String board,
                                                   @RequestParam(defaultValue = "0") int page,
                                                   @RequestParam int size) {

        return threadOperations.list(board, PageRequest.of(page, size, Sort.by(Sort.Order.desc("updatedAt"))));
    }


}
