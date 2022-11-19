package com.alevel.java.nxchannel.api.data;

import java.time.Instant;
import java.util.List;

public record ThreadResponse(long id,
                             List<PostResponse> posts,
                             Instant updatedAt) {



}
