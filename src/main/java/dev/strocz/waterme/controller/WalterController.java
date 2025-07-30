package dev.strocz.waterme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.strocz.waterme.dto.Walter;

@RestController
@RequestMapping("/v0")
public class WalterController {
    
    @GetMapping("/walter")
    public Walter getWalter() {
        return new Walter("Walter", 42);
    }
}
