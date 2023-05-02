package com.luankenzley.soap.webservice.custumersadministration.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.luankenzley.CustomerDetail;
import br.com.luankenzley.GetCustomerDetailResponse;

@Endpoint
public class CustomerDetailEndPoint {
	
	
	@PayloadRoot(namespace = "http://luankenzley.com.br", localPart = "GetCustomerDetailRequest")
	@ResponsePayload
	public GetCustomerDetailResponse processCustomerDetailRequest(@RequestPayload GetCustomerDetailResponse req) {
		GetCustomerDetailResponse response = new GetCustomerDetailResponse();
		
		CustomerDetail customerDetail = new CustomerDetail();
		
		customerDetail.setEmail("luankenzley@hotmail.com");
		customerDetail.setId(1);
		customerDetail.setName("Luan Kenzley");
		customerDetail.setPhone("61999999999");
		
		response.setCustomerDetail(customerDetail);
		return response;
	}

}
