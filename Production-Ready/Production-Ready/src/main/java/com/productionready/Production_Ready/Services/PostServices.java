package com.productionready.Production_Ready.Services;


import com.productionready.Production_Ready.Dto.PostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostServices {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);
}

