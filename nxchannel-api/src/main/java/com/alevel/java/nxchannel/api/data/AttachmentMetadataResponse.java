package com.alevel.java.nxchannel.api.data;

import java.util.UUID;

public record AttachmentMetadataResponse(
        UUID id,
        String name,
        String contentType,
        String location,
        String thumbnailLocation
) {
}
