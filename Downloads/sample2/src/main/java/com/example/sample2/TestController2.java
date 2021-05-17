package com.example.sample2;


import com.example.sample1.MaskingPII;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {

	
	@RequestMapping("/hello2")	
    public String sayhi()
    {
		 MaskingPII m=new  MaskingPII();
    	return m.maskinfo("Prasoon2324");
		
    }
}