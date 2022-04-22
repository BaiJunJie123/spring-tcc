package com.bank2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartPingService implements CommandLineRunner {

    @Autowired
    private CanalClient canalClient;

    @Override
    public void run(String... args) throws Exception {
        canalClient.run();
    }
}
