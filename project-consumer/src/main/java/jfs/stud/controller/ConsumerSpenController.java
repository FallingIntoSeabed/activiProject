package jfs.stud.controller;

import jfs.stud.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer/spen")
public class ConsumerSpenController {

    private static final String REST_URL_PROVIDER_PREFIX = "http://springCloudProjectProvider"; // 使用注册到 Spring Cloud Eureka 服务注册中心中的服务，即 application.name
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public SysUser getConsumerSpenById(@PathVariable String id) {
        return restTemplate.getForObject(REST_URL_PROVIDER_PREFIX + "/sys/user/"+id, SysUser.class);
    }

    @GetMapping("/list")
    public List<SysUser> getConsumerSpenAll() {
        return restTemplate.getForObject(REST_URL_PROVIDER_PREFIX + "/sys/user/list", List.class);
    }
}
