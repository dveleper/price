package com.trade.infrastructure.entry_points.health;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@Log4j2
public class HealthController {

    @GetMapping
    public ResponseEntity<String> health() {
        log.info("health ok");
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
