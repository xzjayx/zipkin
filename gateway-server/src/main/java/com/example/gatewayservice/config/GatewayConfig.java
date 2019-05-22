package com.example.gatewayservice.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

import java.net.InetSocketAddress;
@Configuration
public class GatewayConfig {
    @Bean
    KeyResolver ipKeyResolver() {
        return exchange -> {
            InetSocketAddress remoteAddress = exchange.getRequest().getRemoteAddress();
            return Mono.just(remoteAddress==null?"localhost":remoteAddress.getAddress().getHostAddress());
        };
    }
}
