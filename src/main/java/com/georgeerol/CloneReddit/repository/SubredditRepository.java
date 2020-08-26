package com.georgeerol.CloneReddit.repository;

import com.georgeerol.CloneReddit.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by George Fouche on 8/25/20.
 */
@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findByName(String subredditName);
}
