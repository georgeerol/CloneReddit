package com.georgeerol.CloneReddit.repository;

import com.georgeerol.CloneReddit.model.Post;
import com.georgeerol.CloneReddit.model.User;
import com.georgeerol.CloneReddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by George Fouche on 8/25/20.
 */
@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
