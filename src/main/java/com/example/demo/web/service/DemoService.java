package com.example.demo.web.service;

import com.example.demo.model.DemoSoftware;
import com.example.demo.web.service.client.DemoClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by caroline on 23/07/2017.
 */

@Service
public class DemoService {

    @Autowired DemoClientService demoClientService;
    //1st abstr  call logic

    public DemoSoftware getDemoSoftwareInfo(){

        return demoClientService.getDemoSoftwareInfo();
    }
}
