package com.productionready.Production_Ready.Repostories;

import com.productionready.Production_Ready.Dto.PostDTO;
import com.productionready.Production_Ready.Entity.Postentity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PostRepostories  extends JpaRepository<Postentity, Long> {


    static List<PostDTO> findALL() {

        return List.of();
    }


}
