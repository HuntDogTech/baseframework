package cn.huntdog.baseframeworke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by JonDai {jondai@aliyun.com} on 2016/3/10.
 */

//发现注解@Scheduled的任务并后台执行
//@EnableScheduling
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}