package com.subra.contoller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sdass on 3/30/2017.
 * Invoke by
 * http://localhost:8080/swagger-ui.html,
 * http://localhost:8080/v2/api-docs
 */
@RestController
@Api(value = "hellofirst")
public class HelloController {

    @ApiOperation(value="It spits out Hello", notes = "no backend access", response = String.class)
    @RequestMapping(method = RequestMethod.GET, value = "/api/hello")
    public String sayHello(HttpServletRequest request) {
        System.out.println(request.getRequestURL());
        return "Swagger Hello World";
    }

    @ApiOperation(value="It checks tomcat running", notes = "no backend access", response = String.class)
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String first(HttpServletRequest request) {
        System.out.println(request.getRequestURL());
        return "begin to";
    }
}
