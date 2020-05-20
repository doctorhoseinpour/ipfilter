package com.example.demo.Controller;

import com.example.demo.Service.FilteringService;
import com.example.demo.Model.IpDetails;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v2")
@Getter
@Setter
public class FilteringController {

    @Autowired
    FilteringService filteringService;

    @GetMapping("/{ip}")
    public String getCountry(@PathVariable(value = "ip") String ip)
    {
        IpDetails ipDetails = filteringService.getDetails(ip);
        return ipDetails.getCountry();
    }

}