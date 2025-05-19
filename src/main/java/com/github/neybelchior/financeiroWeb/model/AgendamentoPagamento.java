package com.github.neybelchior.financeiroWeb.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AgendamentoPagamento {

    private int codigo;
    private String descricao;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataDeAgendamento;
    private String tipo;
    private BigDecimal valor;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataDeVencimento;
    private String agencia;
    private String conta;
    private String tipoDeConta;
    private String observacao;
    private String nomeDoBeneficiario;
    private String cpfCnpjDoBeneficiario;

    // Getters and setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataDeAgendamento() {
        return dataDeAgendamento;
    }

    public void setDataDeAgendamento(Date dataDeAgendamento) {
        this.dataDeAgendamento = dataDeAgendamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getNomeDoBeneficiario() {
        return nomeDoBeneficiario;
    }

    public void setNomeDoBeneficiario(String nomeDoBeneficiario) {
        this.nomeDoBeneficiario = nomeDoBeneficiario;
    }

    public String getCpfCnpjDoBeneficiario() {
        return cpfCnpjDoBeneficiario;
    }

    public void setCpfCnpjDoBeneficiario(String cpfCnpjDoBeneficiario) {
        this.cpfCnpjDoBeneficiario = cpfCnpjDoBeneficiario;
    }

	@Override
	public String toString() {
		return "AgendamentoPagamento [codigo=" + codigo + ", descricao=" + descricao + ", dataDeAgendamento="
				+ dataDeAgendamento + ", tipo=" + tipo + ", valor=" + valor + ", dataDeVencimento=" + dataDeVencimento
				+ ", agencia=" + agencia + ", conta=" + conta + ", tipoDeConta=" + tipoDeConta + ", observacao="
				+ observacao + ", nomeDoBeneficiario=" + nomeDoBeneficiario + ", cpfCnpjDoBeneficiario="
				+ cpfCnpjDoBeneficiario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgendamentoPagamento other = (AgendamentoPagamento) obj;
		return Objects.equals(codigo, other.codigo);
	}
    
}
