package com.github.neybelchior.financeiroWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.neybelchior.financeiroWeb.model.AgendamentoPagamento;

@Service
public class AgendamentoPagamentoService {
	
	@Autowired
	private  RestTemplate restTemplate;

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
}
