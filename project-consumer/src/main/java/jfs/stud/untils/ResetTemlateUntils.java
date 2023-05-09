package jfs.stud.untils;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class RestTemlateUntils {

    @Bean
    @LoadBalanced //开启负载均衡
    public RestTemplate getResetTemlate(){
        return new RestTemplate();
    }
}
