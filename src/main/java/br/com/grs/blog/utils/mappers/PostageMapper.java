package br.com.grs.blog.utils.mappers;

import br.com.grs.blog.dtos.PostageDto;
import br.com.grs.blog.models.Postage;

public class PostageMapper {

    public static Postage fromDto(PostageDto.Request postageReq) {
        Postage postage = new Postage();
        postage.setAuthor(postageReq.getAuthor());
        postage.setTitle(postageReq.getTitle());
        postage.setContent(postageReq.getContent());
        return postage;
    }

    public static PostageDto.Response toDto(Postage postage) {
        PostageDto.Response postageDto = new PostageDto.Response();
        postageDto.setId(postage.getId());
        postageDto.setTitle(postage.getTitle());
        postageDto.setContent(postage.getContent());
        postageDto.setAuthor(postage.getAuthor());
        postageDto.setCreatedAt(postage.getCreatedAt());
        return postageDto;
    }

}
