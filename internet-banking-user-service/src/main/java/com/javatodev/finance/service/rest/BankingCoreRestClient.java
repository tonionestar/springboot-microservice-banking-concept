package com.javatodev.finance.service.rest;

import com.javatodev.finance.configuration.CustomFeignClientConfiguration;
import com.javatodev.finance.model.rest.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "core-banking-service", configuration = CustomFeignClientConfiguration.class)
public interface BankingCoreRestClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/user/{identification}")
    UserResponse readUser(@PathVariable("identification") String identification);

}
