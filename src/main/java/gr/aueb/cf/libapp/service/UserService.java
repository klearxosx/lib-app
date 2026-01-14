package gr.aueb.cf.libapp.service;

import gr.aueb.cf.libapp.model.AuthenticatedUser;
import gr.aueb.cf.libapp.model.Book;
import gr.aueb.cf.libapp.model.User;
import gr.aueb.cf.libapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository uRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void save(User u){
        u.setPassword(passwordEncoder.encode(u.getPassword()));
        uRepo.save(u);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = uRepo.findByUsername(username);
        return new  AuthenticatedUser(u);
    }
}
