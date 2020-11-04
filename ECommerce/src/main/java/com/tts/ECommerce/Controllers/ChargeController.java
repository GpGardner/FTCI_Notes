package com.tts.ECommerce.Controllers;

import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.tts.ECommerce.Models.ChargeRequest;
import com.tts.ECommerce.Models.ChargeRequest.Currency;
import com.tts.ECommerce.Services.StripeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChargeController {

	@Autowired
	private StripeService paymentsService;

	@PostMapping("/charge")

	//accesstype returntype methodname (ARGUMENTS) {}
	public String charge(ChargeRequest chargeRequest, Model model) throws StripeException {
		//Interacting with instance of chargeRequest
		chargeRequest.setDescription("Example charge");
		chargeRequest.setCurrency(Currency.EUR);

		//Adding variable called "charge" the type of Charge
		Charge charge = paymentsService.charge(chargeRequest); //Template of a charge is put into variable named charge
		
		model.addAttribute("id", charge.getId());
		model.addAttribute("status", charge.getStatus());
		model.addAttribute("chargeId", charge.getId());
		model.addAttribute("balance_transaction", charge.getBalanceTransaction());
		return "result";

	}

	@ExceptionHandler(StripeException.class)
	public String handleError(Model model, StripeException ex) {
		model.addAttribute("error", ex.getMessage());
		return "result";
	}
}
