package org.example.Proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceInvocationHandler implements InvocationHandler {

    private final UserService userService;

    public UserServiceInvocationHandler(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logMethodInvocationAttemptToDatabase(method);
        return method.invoke(userService, args);
    }

    public void logMethodInvocationAttemptToDatabase(Method method){
        String loggingMessage = "LOGGING: '" + method.getName() + "' method invocation attempt "
                +  "logged to database";
        System.out.println(loggingMessage);
    }

}
