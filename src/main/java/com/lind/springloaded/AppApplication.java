package com.lind.springloaded;

import com.lind.interfaces.Hello;
import com.lind.springloaded.utils.JarLoader;

public class AppApplication {
    public static void main(String[] args) throws Exception {
        while (true) {
            Hello dll = JarLoader.findClassLoader("file:///d:/a-start-hot-dependency-1.0.0.jar", Hello.class, "com.lind.hot.HelloImpl");
            System.out.println(dll.password());
            Thread.sleep(1000);
        }
    }


}
