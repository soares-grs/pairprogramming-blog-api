package br.com.grs.blog.controllers;

import br.com.grs.blog.dtos.PostageDto;
import br.com.grs.blog.models.Postage;
import br.com.grs.blog.services.PostageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/postage")
public class PostageController {

    @Autowired
    PostageService postageService;

    @GetMapping
    public ResponseEntity<List<PostageDto.Response>> getAll() {
        List<PostageDto.Response> posts = postageService.getAll();
        return ResponseEntity.ok().body(posts);
    }

    @PostMapping
    public ResponseEntity<PostageDto.Response> create(@RequestBody PostageDto.Request postageReq) {
        PostageDto.Response createdPostage = postageService.create(postageReq);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPostage);
    }
}
