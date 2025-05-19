package com.github.neybelchior.financeiroWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.neybelchior.financeiroWeb.model.AgendamentoPagamento;
import com.github.neybelchior.financeiroWeb.model.LoggingInterceptor;

import jakarta.annotation.PostConstruct;

@Service
public class AgendamentoPagamentoService {
	
	@Autowired
	private  RestTemplate restTemplate;
	
	@PostConstruct
	public void init() {
	    restTemplate.getInterceptors().add(new LoggingInterceptor());
	}


	public List<AgendamentoPagamento> findAll() {
        String url = "http://localhost:8080/agendamentos/todos";
        ResponseEntity<List<AgendamentoPagamento>> response = restTemplate.exchange(
            url,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<AgendamentoPagamento>>() {}
        );
        return response.getBody();
    }
	
	
	public AgendamentoPagamento create(AgendamentoPagamento agendamentoPagamento) {
		System.out.println("AgendamentoPagamentoService.create" + agendamentoPagamento);
	    String url = "http://localhost:8080/agendamentos";
	    System.out.println("Objeto Criado  ");
	    System.out.println(agendamentoPagamento);
	    return restTemplate.postForObject(url, agendamentoPagamento, AgendamentoPagamento.class);
	}
}
