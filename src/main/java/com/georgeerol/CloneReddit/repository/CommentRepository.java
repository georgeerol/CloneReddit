package com.georgeerol.CloneReddit.repository;

import com.georgeerol.CloneReddit.model.Comment;
import com.georgeerol.CloneReddit.model.Post;
import com.georgeerol.CloneReddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by George Fouche on 8/25/20.
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findByPost(Post post);
    List<Comment> findAllByUser(User user);

}
