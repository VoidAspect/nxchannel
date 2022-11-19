package com.alevel.java.nxchannel.api.data;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public record CreateThreadRequest(
        @NotBlank String title,
        @NotBlank String text,
        @NotEmpty List<MultipartFile> attachment
) {
}
