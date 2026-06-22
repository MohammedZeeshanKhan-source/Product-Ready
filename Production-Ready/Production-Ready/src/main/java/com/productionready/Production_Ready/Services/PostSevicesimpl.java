package com.productionready.Production_Ready.Services;

import ch.qos.logback.core.model.Model;
import com.productionready.Production_Ready.Dto.PostDTO;
import com.productionready.Production_Ready.Entity.Postentity;
import com.productionready.Production_Ready.Repostories.PostRepostories;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PostSevicesimpl implements   PostServices {

    private final PostRepostories postRepostories;
    private  final ModelMapper modelMapper;


    @Override
    public List<PostDTO> getAllPosts() {
        return PostRepostories.findALL()
                .stream()
                .map(Postentity  -> modelMapper.map(Postentity, PostDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDTO createNewPost(PostDTO inputPost) {
        Postentity postentity = modelMapper.map(inputPost, Postentity.class);
    return modelMapper.map(PostRepostories.Save(postentity), PostDTO.class);

    }


    @Override
    public PostDTO getPostById(Long postid) {
        Postentity postentity = postRepostories.findById(postid)
                .orElseThrow(() -> new RuntimeException("Post not found with id: " + postid));
        return modelMapper.map(postentity, PostDTO.class);
    }
}
