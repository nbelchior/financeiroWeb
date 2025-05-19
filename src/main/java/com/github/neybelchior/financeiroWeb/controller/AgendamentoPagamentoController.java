package com.github.neybelchior.financeiroWeb.controller;

import com.github.neybelchior.financeiroWeb.model.AgendamentoPagamento;
import com.github.neybelchior.financeiroWeb.service.AgendamentoPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/agendamentos")
public class AgendamentoPagamentoController {

    @Autowired
    private AgendamentoPagamentoService service;

    @GetMapping
    public String findAll(Model model) {
        List<AgendamentoPagamento> agendamentos = service.findAll();
        model.addAttribute("agendamentos", agendamentos);
        return "agendamentos/agendamento-listview"; 
    }
    
    @PostMapping("/createAction")
    public String create(@ModelAttribute AgendamentoPagamento agendamentoPagamento) {
        service.create(agendamentoPagamento);
        return "redirect:/agendamentos";
    }
    
    @GetMapping("/createForm")
    public String showCreateForm(Model model) {
        model.addAttribute("agendamentoPagamento", new AgendamentoPagamento());
        return "agendamentos/agendamento-cadastro";
    }
}
