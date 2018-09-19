package com.moon.springcloudconsumerribbonconfigswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(name = "springcloud-provider-config"/* ,configuration = RibbonConfiguration.class*/)
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExtendRibbon.class)})
@EnableHystrix
public class SpringcloudConsumerRibbonConfigSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerRibbonConfigSwaggerApplication.class, args);
    }
}
