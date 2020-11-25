package com.lind.springloaded;

import com.lind.springloaded.utils.JarLoader;

import java.util.Map;

public class AppApplication {
    public static void main(String[] args) throws Exception {
        Map<String, Class<?>> dll = JarLoader.loadJarFromAbsolute("/Users/zzl/xboot-fast-1.0-SNAPSHOT.jar");
        dll.forEach((i, o) -> System.out.println(i));
    }


}
