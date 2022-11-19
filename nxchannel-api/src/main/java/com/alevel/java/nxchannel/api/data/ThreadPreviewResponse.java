package com.alevel.java.nxchannel.api.data;

import java.time.Instant;

public record ThreadPreviewResponse(long id, PostResponse originalPost, Instant updatedAt) {
}
