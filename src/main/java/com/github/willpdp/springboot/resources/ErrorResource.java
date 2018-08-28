package com.github.willpdp.springboot.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.github.willpdp.springboot.Urls.ERROR_RESOURCE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ErrorResource {
    @RequestMapping(path = ERROR_RESOURCE, method = GET)
    public String getErrorMessage() {
        return "error";
    }
}
