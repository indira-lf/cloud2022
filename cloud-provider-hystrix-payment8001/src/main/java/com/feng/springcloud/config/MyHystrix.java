package com.feng.springcloud.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @time 2022/2/26 22:38
 * @Description- 此配置是为了服务监控而配置，与服务容错本身无关，springcloud升级后的坑
 *              ServletRegistrationBean因为springboot的默认路径不是"/hystrix.stream"
 *              只有在实际的项目里配置Servlet就可以
 */
@Configuration
public class MyHystrix {
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}