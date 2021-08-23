package com.springbootfeatures.scheduling.springbootscheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SchedulerClass {
    private static final Logger logger = LoggerFactory.getLogger(SchedulerClass.class);
    LocalDate localDate = LocalDate.now();

    @Scheduled(fixedRate = 500)
    public void logCurrentTimeAtSpeceficIntrevel() {
        logger.info("Current time is {}",localDate);

    }

}
