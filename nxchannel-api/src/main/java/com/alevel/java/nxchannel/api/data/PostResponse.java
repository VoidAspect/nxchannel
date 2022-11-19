package com.alevel.java.nxchannel.api.data;

import java.time.Instant;
import java.util.List;

public record PostResponse(
        long id,
        String title,
        String text,
        List<AttachmentMetadataResponse> attachments,
        Instant createdAt
) {
}
