package com.fastfeet.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RootController {

    @GetMapping("/")
    public Map<String, Object> root() {
        Map<String, Object> body = new HashMap<>();
        body.put("status", "API Gateway Running");
        body.put("timestamp", Instant.now().toString());
        body.put("message", "Gateway is operational");
        body.put("available_endpoints", new String[]{
                "/api/users",
                "/api/orders",
                "/api/restaurants",
                "/api/deliveries",
                "/api/payments",
                "/api/notifications",
                "/api/ratings"
        });
        return body;
    }
}







