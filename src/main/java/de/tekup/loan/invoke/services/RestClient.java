package de.tekup.loan.invoke.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.tekup.loan.invoke.types.CustomerRequest;
import de.tekup.loan.invoke.types.WsResponse;

@Service
public class RestClient {
	
	private RestTemplate template;
	private static final String URL = "http://localhost:8080/api/get-status";
	
	public WsResponse getLoanService(CustomerRequest request) {
		template = new RestTemplate();
		// call for the service
		WsResponse response = template.postForObject(URL, request, WsResponse.class);
		
		return response;
		
	}

}
