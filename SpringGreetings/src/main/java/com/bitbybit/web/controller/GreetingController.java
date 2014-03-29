package com.bitbybit.web.controller;



import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class GreetingController {
	int s=0;
	
	protected static Logger logger = Logger.getLogger("GreetingController");
    
	//define the same url with GET so users can skip to the greetings page
    //note there is no actual greetings.html file!! 
	@RequestMapping(value = "/greetings.html", method = RequestMethod.POST)
	public String showAllGreetings(@RequestParam(value="greetingText", required=true) String greetingText,
			Map<String, Object> model) {		
        InputStream is = null;
        int x=0;
		logger.info("entering showAllGreetings");	
		//
		
         String geocodeURL = "https://api.jcdecaux.com/vls/v1/stations/227?contract=toulouse&apiKey=44581057c766da69d2b599c92664b053200a7452";
         //query google geocode api
         String formattedUrl = geocodeURL;
         URL geocodeUrl = null;
		try {
			geocodeUrl = new URL(formattedUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         try {
			is = geocodeUrl.openStream();
	        Coordonnee coords = null;
 
	        is = geocodeUrl.openStream();
           parse(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		model.put("greetingText", s);
			
	    // This will resolve to /WEB-INF/jsp/greetings.jsp
	    return "greetings";
	}
	
	
	public Coordonnee parse(final InputStream jsonStream) {
        Coordonnee coordinate = null;
        
        final ObjectMapper mapper = new ObjectMapper();
        try {
        	 JsonReader jsonReader = Json.createReader(jsonStream);
        	 JsonObject jsonObject = jsonReader.readObject();
        
        	 jsonReader.close();
        	 s= jsonObject.getInt("available_bikes");
        	System.out.println(s);
            
            
         } catch (Exception e) {                    e.printStackTrace();

         }  
        return coordinate;

    }
	
	@RequestMapping(value = "/addgreeting.html", method = RequestMethod.GET)
    public String showAddGreetingPage() {		
		
		logger.info("entering showAddGreetingPage");
		System.out.println("hazem");

    	// This will resolve to /WEB-INF/jsp/addgreeting.jsp
    	return "addgreeting";
    	
    	
    	
    	
	}	
	
}
