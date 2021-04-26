package de.tekup.loan.invoke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import de.tekup.loan.invoke.services.RestClient;
import de.tekup.loan.invoke.types.CustomerRequest;
import de.tekup.loan.invoke.types.WsResponse;

@Controller
public class CheckController {
	
	@Autowired
	private RestClient client;
	
	@GetMapping("/check/customer")
	public String customerForm(Model model) {
		CustomerRequest request = new CustomerRequest();
		request.setCibilScore(500);
		model.addAttribute("request", request);
		return "request";
	}
	
	@PostMapping("/check/customer")
	public String customerCheck(@ModelAttribute("request") CustomerRequest request, Model model) {
		//invoke de service web
		WsResponse response = client.getLoanService(request);
		model.addAttribute("response", response);
		return "response";
	}

}
