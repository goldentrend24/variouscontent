package com.example.demo.web.controller;

import com.example.demo.model.DemoSoftware;
import com.example.demo.web.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caroline on 23/07/2017.
 */
@RestController
@RequestMapping("/demo")//bydefault
public class DemoController {



    @Autowired DemoService demoService;


    //call 1st service

    @RequestMapping(value = "/", produces = "application/json", method = RequestMethod.GET )
    public DemoSoftware getDemoSoftwareInfo(){

        return demoService.getDemoSoftwareInfo();

    }

}








/*

@RestController
@RequestMapping("/api/os/warranty/")
public class WarrantyUnitEventHistoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ObligationWarrantyBySerialNumberController.class);

    @Autowired
    private WarrantyUnitEventHistoryService warrantyUnitEventHistoryService;

    */
/**
     * Retrieves TestClientResponse for WarrantyUnitEventHistoryService.
     *
     * @param testClientWarrantyUnitEventHistoryRequests
     * @return
     * @throws TestClientException
     *//*

    @RequestMapping(value = "/", produces = "application/json", method = RequestMethod.POST)
    public TestClientResponse<UnitEventHistoryResponse> getTestClientResponse(
            @RequestBody final TestClientWarrantyUnitEventHistoryRequest testClientWarrantyUnitEventHistoryRequests)
            throws TestClientException {

        LOGGER.debug("Warranty unit event history response by unit event history requested");

        return warrantyUnitEventHistoryService.getTestClientResponse(testClientWarrantyUnitEventHistoryRequests);

    }
}*/
