package com.simplon.hospidieuBack.service;

import com.simplon.hospidieuBack.model.Role;
import com.simplon.hospidieuBack.model.User;
import com.simplon.hospidieuBack.repository.RoleRepository;
import com.simplon.hospidieuBack.repository.UserRepository;
import com.simplon.hospidieuBack.security.JwtAuthenticationEntryPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationEntryPoint.class);

    public DataInitializer(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.findAll().isEmpty()) {
            final List<String> roles = new ArrayList<>();
            roles.add("ROLE_ADMIN");
            roles.add("ROLE_INFIRMIER");
            roles.add("ROLE_SECRETAIRE");

            for (String rolename : roles) {
                Role newRole = new Role();
                newRole.setRoleName(rolename);
                roleRepository.save(newRole);

                User newUser = new User();
                newUser.setName("Test");
                newUser.setFirstName(rolename.substring(5).toLowerCase());
                newUser.setMail(rolename.substring(5).toLowerCase() + "@mail.com");
                newUser.setPassword(passwordEncoder.encode("test123"));
                newUser.setRoles(List.of(newRole));
                userRepository.save(newUser);

                logger.info("Default user - login : " + newUser.getMail() + " - password : test123 - " + rolename);
            }
        }
    }
}
