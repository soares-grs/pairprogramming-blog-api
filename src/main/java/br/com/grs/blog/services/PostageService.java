package br.com.grs.blog.services;

import br.com.grs.blog.dtos.PostageDto;
import br.com.grs.blog.models.Postage;
import br.com.grs.blog.repositories.PostageRepository;
import br.com.grs.blog.utils.mappers.PostageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostageService {

    @Autowired
    PostageRepository postageRepository;

    public List<PostageDto.Response> getAll() {
        List<Postage> posts = this.postageRepository.findAll();
        return posts.stream().map(PostageMapper::toDto).toList();
    }

    public PostageDto.Response create(PostageDto.Request postageReq) {
        var createdPostage = this.postageRepository.save(PostageMapper.fromDto(postageReq));
        return PostageMapper.toDto(createdPostage);
    }
}
