package com.rideestimate;

import java.net.URI;  
import javax.ws.rs.client.Client;  
import javax.ws.rs.client.ClientBuilder;  
import javax.ws.rs.client.WebTarget;  
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;  
public class JersyGetClient {  
  public static void main(String[] args) {  
    Client client = ClientBuilder.newClient();  
    WebTarget target = client.target(getBaseURI());  
    System.out.println(target.queryParam("pickupLat", "13.069165").queryParam("pickupLng", "80.1913883").queryParam("pickupMode", "NOW").queryParam("dropLat", "13.0381896").queryParam("dropLng", "80.1565461").queryParam("silent", "true")
            .request(MediaType.APPLICATION_JSON).header("x-fingerprint-id", "442665447")
            .get(String.class));
  } 
  public String searchOla() {
	    Client client = ClientBuilder.newClient();  
	    WebTarget target = client.target(getBaseURI());  
	    return target.queryParam("pickupLat", "13.069165").queryParam("pickupLng", "80.1913883").queryParam("pickupMode", "NOW").queryParam("dropLat", "13.0381896").queryParam("dropLng", "80.1565461").queryParam("silent", "true")
	            .request(MediaType.APPLICATION_JSON).header("x-fingerprint-id", "442665447")
	            .get(String.class);  
	  
  }
  private static URI getBaseURI() {  
    return UriBuilder.fromUri("https://book.olacabs.com/data-api/category-availability/p2p?pickupLat=13.0691658&pickupLng=80.1913883&pickupMode=NOW&dropLat=13.0381896&dropLng=80.1565461&silent=true").build();  
  }  
}   