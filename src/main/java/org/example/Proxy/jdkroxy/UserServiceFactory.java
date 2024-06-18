package org.example.Proxy.jdkroxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class UserServiceFactory {

    public static UserService getUserService() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        UserService userService = new UserServiceImpl();

//        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(
//                userService.getClass().getClassLoader(),
//                new Class[] {UserService.class},
//                new UserServiceInvocationHandler(userService)
//        );

        ClassLoader classLoader = userService.getClass().getClassLoader();
        Class[] interfaces = new Class[] {UserService.class};
        Class userServiceProxyClass = Proxy.getProxyClass(classLoader, interfaces);
        Constructor<?> constructor = userServiceProxyClass.getConstructor(InvocationHandler.class);
        UserService userServiceProxy = (UserService) constructor.newInstance(new UserServiceInvocationHandler(userService));

        return userServiceProxy;
    }

}
