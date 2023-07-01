package com.springboot.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * {@code @Description:}
 */
@Endpoint(id = "myEndpoint")
@Component
public class MyEndpoint {
    @ReadOperation
    public String myEndPoint() {
        return "MyEndpoint";
    }
}