package de.mangei.hellokubernetes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKubernetesController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Kubernetes!";
    }

}
