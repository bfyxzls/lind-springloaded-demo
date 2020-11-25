package com.lind.springloaded;

import java.util.concurrent.TimeUnit;

public class AppApplication {
    public static void main(String[] args) throws Exception {
        while (true) {
            Reload reload = new Reload();
            reload.load();
            TimeUnit.SECONDS.sleep(3);
        }
    }


}
