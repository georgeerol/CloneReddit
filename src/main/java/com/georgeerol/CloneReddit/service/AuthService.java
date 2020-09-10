package com.georgeerol.CloneReddit.service;

import com.georgeerol.CloneReddit.dto.RegisterRequest;
import com.georgeerol.CloneReddit.model.NotificationEmail;
import com.georgeerol.CloneReddit.model.User;
import com.georgeerol.CloneReddit.model.VerificationToken;
import com.georgeerol.CloneReddit.repository.UserRepository;
import com.georgeerol.CloneReddit.repository.VerificationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.UUID;

/**
 * Created by George Fouche on 8/26/20.
 */
@Service
@AllArgsConstructor
public class AuthService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final VerificationTokenRepository verificationTokenRepository;
    private final MailService mailService;


    @Transactional
    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(passwordEncoder.encode(registerRequest.getUsername()));
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        user.setCreated(Instant.now());
        user.setEnabled(false);
        userRepository.save(user);

        String token = generateVerificationToken(user);
        mailService.sendMail(new NotificationEmail("Please Activate your Account",
                user.getEmail(), "Thank you for signing up to Spring Reddit, " +
                "please click on the below url to activate your account : " +
                "http://localhost:8087/api/auth/accountVerification/" + token));

    }

    private String generateVerificationToken(User user) {
        String token = UUID.randomUUID().toString();
        VerificationToken verificationToken = new VerificationToken();
        verificationToken.setToken(token);
        verificationToken.setUser(user);

        verificationTokenRepository.save(verificationToken);
        return token;
    }
}
