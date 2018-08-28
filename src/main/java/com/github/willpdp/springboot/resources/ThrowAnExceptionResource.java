package com.github.willpdp.springboot.resources;

import com.github.willpdp.springboot.exceptions.NoGravyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.github.willpdp.springboot.Urls.THROW_AN_EXCEPTION_RESOURCE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ThrowAnExceptionResource {
    @RequestMapping(path = THROW_AN_EXCEPTION_RESOURCE, method = GET)
    public String throwAnException() {
        throw new NoGravyException();
    }
}
