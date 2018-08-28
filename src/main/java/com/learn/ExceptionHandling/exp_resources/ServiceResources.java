package com.learn.ExceptionHandling.exp_resources;

import com.learn.ExceptionHandling.domain_objs.Service;
import com.learn.ExceptionHandling.domain_objs.Status;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author vdokku
 */


@RestController
@RequestMapping("/services")
public class ServiceResources {


    /**
     * @param service
     * @param sdkApiVersion
     * @return
     */
    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody
    HttpEntity<Status> save(@RequestBody Service service,
                            @RequestHeader(name = "sdk_api_v") String sdkApiVersion) {

        System.out.println("    >>> sdkApiVersions: " + sdkApiVersion);
        System.out.println("    >>> service: " + service);

        return ResponseEntity.ok(new Status("service saved successfully!"));
    }

}
