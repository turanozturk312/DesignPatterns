package org.example.Proxy.jdkroxy;

public class UserServiceImpl implements UserService{

    @Override
    public User addUser(User user) {
        user.setId(1L);
        return user;
    }

    public void removeUser(Long id){
        System.out.println("User removed");
    }

}
