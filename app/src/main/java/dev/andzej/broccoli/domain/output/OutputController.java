package dev.andzej.broccoli.domain.output;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/output")
class OutputController {

    @GetMapping("/test")
    public String test() {
        return "Testing webhook deployment";
    }
}
