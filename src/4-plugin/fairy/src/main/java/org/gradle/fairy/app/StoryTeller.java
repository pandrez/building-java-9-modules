package org.gradle.fairy.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.gradle.fairy.tale.Tale;

import java.util.ServiceLoader;

class StoryTeller {

    private static final Logger LOGGER = LogManager.getLogger(StoryTeller.class);

    public static void main(String[] args) {
        LOGGER.info("Starting the tales...");
        ServiceLoader<Tale> loader = ServiceLoader.load(Tale.class);
        if (!loader.iterator().hasNext()) {
            System.out.println("Alas, I have no tales to tell!");
        }
        for (Tale tale : loader) {
            tale.tell();
        }
    }
}

