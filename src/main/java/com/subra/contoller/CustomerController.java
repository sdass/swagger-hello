package com.subra.contoller;

import com.subra.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/**
 * Created by sdass on 3/30/2017.
 */

@RestController
public class CustomerController {


    @RequestMapping(value = "/getcustomer", produces = {"application/json", "application/xml"})
    public Customer getCustomer(HttpServletRequest request){

        System.out.println(request.getRequestURL());
        Customer sample = new Customer(new BigDecimal(32432), "mn@db.com", "mn@dbcom" );
        return sample;
    }


    @RequestMapping(value = "/postcustomer/id/{id}/email/{email}/loginname/{loginname}", method = RequestMethod.POST)
    public Integer saveCustomer(HttpServletRequest request,
                                @PathVariable("id") BigDecimal id,
                                @PathVariable("email") String email,
                                @PathVariable("loginname") String loginname) {

        System.out.println(request.getRequestURL());
        Customer sample = new Customer(id, email, loginname );
        return 1;
    }


}
