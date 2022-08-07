package org.devgraft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api")
@RestController
public class DemoApi {
    @GetMapping("ping")
    public String ping() {
        return "ping";
    }
}
