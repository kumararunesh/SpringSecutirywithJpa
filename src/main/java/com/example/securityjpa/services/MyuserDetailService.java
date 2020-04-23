package com.example.securityjpa.services;

        import com.example.securityjpa.models.MyCustomer;
        import com.example.securityjpa.models.User;
        import com.example.securityjpa.repository.UserRepo;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.security.core.userdetails.UserDetails;
        import org.springframework.security.core.userdetails.UserDetailsService;
        import org.springframework.security.core.userdetails.UsernameNotFoundException;
        import org.springframework.stereotype.Service;

        import java.util.Optional;

@Service
public class MyuserDetailService implements UserDetailsService {

    @Autowired
    UserRepo customerRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       //here , the game occurs , send the object you want
        //return new MyCustomer(s);

        Optional<User> user = customerRepo.findByUserName(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found" + username));
        return user.map(MyCustomer::new).get();
    }
}
