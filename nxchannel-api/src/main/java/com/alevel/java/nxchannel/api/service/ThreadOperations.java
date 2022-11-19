package com.alevel.java.nxchannel.api.service;

import com.alevel.java.nxchannel.api.data.CreateThreadRequest;
import com.alevel.java.nxchannel.api.data.ThreadPreviewResponse;
import com.alevel.java.nxchannel.api.data.ThreadResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ThreadOperations {

    long create(String board, CreateThreadRequest request);

    Optional<ThreadResponse> getById(long id);

    void delete(long id);

    Page<ThreadPreviewResponse> list(String board, Pageable pageable);

}
