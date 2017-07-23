package com.example.demo.web.service.client;

import com.example.demo.model.DemoSoftware;
import org.springframework.stereotype.Service;

/**
 * Created by caroline on 23/07/2017.
 */

@Service
public class DemoClientService {

    //logic

    public DemoSoftware getDemoSoftwareInfo(){


        DemoSoftware demoSoftware = new DemoSoftware();
        demoSoftware.setName("GoldenTrend");
        demoSoftware.setRelase("1");
        demoSoftware.setDate("01.01.2018");

        return demoSoftware;

    }
}
