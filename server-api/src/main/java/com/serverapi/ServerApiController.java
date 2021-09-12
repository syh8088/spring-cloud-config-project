package com.serverapi;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RefreshScope
public class ServerApiController {

    @Value("${docfriends.tel-numbers.jeonneung.block}")
    private String jeonneungBlockNumber;

    @Value("${docfriends.tel-numbers.bit-computer.block}")
    private String bitComputerBlockNumber;

    @Value("${spring.datasource.password}")
    private String password;

    @GetMapping("jeonneung-block-number")
    public String getJeonneungBlockNumber() {
        return String.format("Server API jeonneung block number = " + jeonneungBlockNumber);
    }

    @GetMapping("bit-computer-block-number")
    public String getBitComputerBlockNumber() {
        return String.format("Server API bit-computer block number = " + bitComputerBlockNumber);
    }

    @GetMapping("password")
    public String getPassword() {
        return String.format("Database Password = " + password);
    }
}
