package com.lind.springloaded;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class AppApplication {
    public static void main(String[] args) throws Exception {
        Reload reload = new Reload();

        while (true) {
            reload.load();
            TimeUnit.SECONDS.sleep(3);
        }
    }


}
