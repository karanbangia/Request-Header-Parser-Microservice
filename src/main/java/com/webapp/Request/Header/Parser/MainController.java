package com.webapp.Request.Header.Parser;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

@RestController
@RequestMapping("/api/whoami")
public class MainController{
    @GetMapping(value = "/",produces = "application/json")
    public ResponseEntity<Info>fun(HttpServletRequest request, HttpServletResponse response)  throws Exception
    {
        String ipAddress="";
        try
        {
            URL url_name = new URL("http://bot.whatismyipaddress.com");
            BufferedReader sc=new BufferedReader(new InputStreamReader(url_name.openStream()));
            ipAddress=sc.readLine().trim();
            String acceptLanguage = request.getHeader("Accept-Language");
            String software=request.getHeader("User-Agent");
            return new ResponseEntity<Info>(new Info(ipAddress,acceptLanguage,software),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
