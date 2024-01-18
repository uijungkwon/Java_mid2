package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController //String 반환
public class LogTestController {
    // private final Logger log = LoggerFactory.getLogger(getClass()); //롬복이 자동 실행함
    @RequestMapping("/log-test")
    public String logTest(){
        String name = "spring";

        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.info(" info log = {}", name);

        return "ok";
    }
}
