package com.serverapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class ServerApiController {

    @Value("${docfriends.tel-numbers.jeonneung.block}")
    private String jeonneungBlockNumber;

    @Value("${docfriends.tel-numbers.bit-computer.block}")
    private String bitComputerBlockNumber;

    @GetMapping("jeonneung-block-number")
    public String getJeonneungBlockNumber() {
        return String.format("Server API jeonneung block number = " + jeonneungBlockNumber);
    }

    @GetMapping("bit-computer-block-number")
    public String getBitComputerBlockNumber() {
        return String.format("Server API bit-computer block number = " + bitComputerBlockNumber);
    }
}
