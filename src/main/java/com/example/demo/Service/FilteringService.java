package com.example.demo.Service;

import com.example.demo.Model.IpDetails;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Setter
@Getter
public class FilteringService {
    public IpDetails getDetails(String ip)
    {
        String url = "https://ipapi.co";
        RestTemplate restTemplate = new RestTemplate();
        IpDetails result = restTemplate.getForObject(url + "/" + ip + "/json/", IpDetails.class);
        return result;
    }

}
