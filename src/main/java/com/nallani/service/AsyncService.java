package com.nallani.service;

import com.nallani.model.EmployeeAddresses;
import com.nallani.model.EmployeeNames;
import com.nallani.model.EmployeePhone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
@Configuration
public class AsyncService {

    private static Logger log = LoggerFactory.getLogger(AsyncService.class);

    private final RestTemplate restTemplate;

    public AsyncService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async("asyncExecutor")
    public CompletableFuture<EmployeeNames> getEmployeeName() throws InterruptedException
    {
        log.info("getEmployeeName starts");

        EmployeeNames employeeNameData = restTemplate.getForObject("http://localhost:8080/names", EmployeeNames.class);

        log.info("employeeNameData, {}", employeeNameData);
        log.info("employeeNameData completed");
        return CompletableFuture.completedFuture(employeeNameData);
    }

    @Async("asyncExecutor")
    public CompletableFuture<EmployeeAddresses> getEmployeeAddress() throws InterruptedException
    {
        log.info("getEmployeeAddress starts");

        EmployeeAddresses employeeAddressData = restTemplate.getForObject("http://localhost:8080/addresses", EmployeeAddresses.class);
        log.info("employeeAddressData, {}", employeeAddressData);
        log.info("employeeAddressData completed");
        return CompletableFuture.completedFuture(employeeAddressData);
    }

    @Async("asyncExecutor")
    public CompletableFuture<EmployeePhone> getEmployeePhone() throws InterruptedException
    {
        log.info("getEmployeePhone starts");

        EmployeePhone employeePhoneData = restTemplate.getForObject("http://localhost:8080/phones", EmployeePhone.class);

        log.info("employeePhoneData, {}", employeePhoneData);
        log.info("employeePhoneData completed");
        return CompletableFuture.completedFuture(employeePhoneData);
    }
}