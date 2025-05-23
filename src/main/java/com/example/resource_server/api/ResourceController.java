package com.example.resource_server.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/resources")
    public ResponseEntity<String> getResources() {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/resources/resource")
    public ResponseEntity<String> getResourceById(@RequestParam String id) {
        return ResponseEntity.ok("Resource:" + id);
    }
}
