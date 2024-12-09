package dgu.notwenty.global.base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String healthCheck() {
        return "OK";  // 혹은 상태에 따라 적절한 메시지를 반환
    }
}
