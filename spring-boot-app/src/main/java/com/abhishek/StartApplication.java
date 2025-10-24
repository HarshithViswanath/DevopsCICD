package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Ultimate CI/CD Pipeline using Java");
        model.addAttribute("subtitle", "Successfully built with Maven & Deployed via ArgoCD");
        model.addAttribute("msg", "This application demonstrates a complete DevOps pipeline from code to deployment");
        
        // Add pipeline information
        model.addAttribute("ciTool", "Jenkins");
        model.addAttribute("cdTool", "ArgoCD");
        model.addAttribute("containerTool", "Docker");
        model.addAttribute("orchestrator", "Kubernetes");
        model.addAttribute("buildTool", "Maven");
        model.addAttribute("framework", "Spring Boot");
        
        // Add deployment time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        model.addAttribute("deploymentTime", LocalDateTime.now().format(formatter));
        
        // Add project info
        model.addAttribute("projectName", "DevOps CI/CD Master Class");
        model.addAttribute("teamName", "Harshith & Team");
        
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}

```
spring-boot-app/src/main/java/com/abhishek/StartApplication.java
