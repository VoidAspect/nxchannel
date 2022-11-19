package com.alevel.java.nxchannel.api.service;

import com.alevel.java.nxchannel.api.data.CreateThreadRequest;
import com.alevel.java.nxchannel.api.data.ThreadPreviewResponse;
import com.alevel.java.nxchannel.api.data.ThreadResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ThreadService implements ThreadOperations {

    @Override
    public long create(String board, CreateThreadRequest request) {
        return 0;
    }

    @Override
    public Optional<ThreadResponse> getById(long id) {
        return Optional.empty();
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Page<ThreadPreviewResponse> list(String board, Pageable pageable) {
        return null;
    }
}
