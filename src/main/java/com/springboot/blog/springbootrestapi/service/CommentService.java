package com.springboot.blog.springbootrestapi.service;

import com.springboot.blog.springbootrestapi.payload.CommentDTO;

import java.util.List;

public interface CommentService {
    CommentDTO createComment(long postId, CommentDTO commentDTO);

    List<CommentDTO> getCommentsByPostId(long postId);

    CommentDTO getCommentById(Long postId, Long commentId);

    CommentDTO updateComment(Long postId, long commentId, CommentDTO commentRequest);

    void deleteComment(Long postId, Long commentId);
}
