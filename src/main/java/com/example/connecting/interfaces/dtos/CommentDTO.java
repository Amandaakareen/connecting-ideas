package com.example.connecting.interfaces.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {

    private String user;
    private String comment;
    private List<CommentDTO> comments;
}
