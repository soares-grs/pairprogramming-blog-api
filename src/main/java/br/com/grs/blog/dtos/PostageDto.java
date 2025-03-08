package br.com.grs.blog.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

public class PostageDto {
    @Data
    public static class Response {
        private UUID id;
        private String title;
        private String content;
        private String author;
        private LocalDateTime createdAt;
    }

    @Data
    public static class Request {
        @NotBlank
        private String title;

        @NotBlank
        private String content;

        @NotBlank
        private String author;
    }
}
