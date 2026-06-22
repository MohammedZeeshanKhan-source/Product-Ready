package com.productionready.Production_Ready.Controller;

import com.productionready.Production_Ready.Dto.PostDTO;
import com.productionready.Production_Ready.Services.PostServices;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postes")
@RequiredArgsConstructor
public class PostController {

    private final PostServices postServices;


    @GetMapping
    public List<PostDTO> getAllPosts() {
     return postServices.getAllPosts();
    }


    @PostMapping
    public PostDTO createNewPost(@RequestBody  PostDTO inputPost) {
        return postServices.createNewPost(inputPost);
    }


}
