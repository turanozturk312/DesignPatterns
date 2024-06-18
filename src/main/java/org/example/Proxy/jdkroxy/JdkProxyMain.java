package org.example.Proxy.jdkroxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class JdkProxyMain {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        UserService userService = UserServiceFactory.getUserService();
        User addedUser = userService.addUser(new User("turanozturk"));
        System.out.println(addedUser.toString());
        System.out.println("----");
        userService.removeUser(1L);
    }

    /** ÇIKTI
     * LOGGING: 'addUser' method invocation attempt logged to database
     * User{id=1, username='turanozturk'}
     * LOGGING: 'removeUser' method invocation attempt logged to database
     * User removed
     */

}
