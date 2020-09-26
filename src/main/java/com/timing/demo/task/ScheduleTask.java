package com.timing.demo.task;

import com.timing.demo.utils.HttpUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author jackyoung
 */
@Configuration
@EnableScheduling
public class ScheduleTask {
//    @Scheduled(cron = "0/25 0/1 0/1 * * ?")
    private void sys() {
        try {
            String response = HttpUtils.getRequest("http://localhost:8080");
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
