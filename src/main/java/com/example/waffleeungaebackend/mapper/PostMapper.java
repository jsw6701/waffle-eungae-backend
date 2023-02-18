package com.example.waffleeungaebackend.mapper;

import com.example.waffleeungaebackend.dto.PostDto;
import com.example.waffleeungaebackend.entity.Post;

import java.util.List;

public interface PostMapper {
    Post postPostToEntity(PostDto.AddPost requestBody);

    PostDto.ResponsePost entityToResponse(Post post);

    Post patchPostToEntity(PostDto.PatchPost requestBody);

    List<PostDto.ResponsePost> entityListToResponseList(List<Post> postList);
}
