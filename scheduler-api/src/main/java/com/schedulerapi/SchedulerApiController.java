package com.schedulerapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SchedulerApiController {

    @Value("${docfriends.tel-numbers.jeonneung.block}")
    private String jeonneungBlockNumber;

    @Value("${docfriends.tel-numbers.bit-computer.block}")
    private String bitComputerBlockNumber;

    @GetMapping("jeonneung-block-number")
    public String getJeonneungBlockNumber() {
        return String.format("Scheduler API jeonneung block number = " + jeonneungBlockNumber);
    }

    @GetMapping("bit-computer-block-number")
    public String getBitComputerBlockNumber() {
        return String.format("Scheduler API bit-computer block number = " + bitComputerBlockNumber);
    }
}
