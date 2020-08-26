package com.georgeerol.CloneReddit.repository;

import com.georgeerol.CloneReddit.model.Post;
import com.georgeerol.CloneReddit.model.Subreddit;
import com.georgeerol.CloneReddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by George Fouche on 8/25/20.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
