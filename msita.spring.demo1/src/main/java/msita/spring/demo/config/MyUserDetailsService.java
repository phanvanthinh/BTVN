package msita.spring.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import msita.spring.demo.dao.UserDao;
import msita.spring.demo.model.User1;

@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserDao userDao;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User1 user = userDao.getUserByUsername(username);
		
		UserBuilder builder = null;
		if (user!=null) {
			builder = org.springframework.security.core.userdetails.User.withUsername(username);
			builder.disabled(false);
			builder.password(user.getPassword());
			builder.authorities("ROLE_" + user.getRole());
			
		}else {
			throw new UsernameNotFoundException("User not found");
		}
			
		
		return builder.build();
	}

}
