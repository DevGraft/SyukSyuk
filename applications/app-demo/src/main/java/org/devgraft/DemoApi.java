package org.devgraft;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api")
@RestController
public class DemoApi {
    @Value(value = "${version:0.0.1}")
    private String version;

    @GetMapping("version")
    public String getVersion() {
        return this.version;
    }
    @GetMapping("ping")
    public String ping() {
        return "ping";
    }
}
