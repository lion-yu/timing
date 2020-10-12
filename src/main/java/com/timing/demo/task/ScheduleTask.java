package com.timing.demo.task;

import com.timing.demo.utils.HttpUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jackyoung
 */
@Configuration
@EnableScheduling
public class ScheduleTask {
    @Scheduled(cron = "0 0 0/2 * * ? ")
    private void sys() {
        try {
            String response = HttpUtils.getRequest("http://47.254.29.31:8090/migration/upgrade-firmware");
            System.out.println(SimpleDateFormat.getInstance().format(new Date()) + " -> " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
