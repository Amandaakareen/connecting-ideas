package com.example.post.interfaces.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {

    private String user;
    private String title;
    private List<String> userLikes;
    private List<ContentDTO> contents;
    private List<CommentDTO> comments;


}
