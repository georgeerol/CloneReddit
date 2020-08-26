package com.georgeerol.CloneReddit.repository;

import com.georgeerol.CloneReddit.model.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by George Fouche on 8/25/20.
 */
public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Long> {
    Optional<RefreshToken> findByToken(String token);
    void deleteByToken(String token);

}
