package br.com.gameLib.negocio.entidades;

import java.util.Date;

public class Documento {

	private String cpf;

	private String rg;

	private String orgaoEmissor;

	private Date dtNascimento;

	private Date dtEmissaoRg;

	private String reservista;

	private String tituloEleitor;

	private String ctps;

	public Documento(String cpf, String rg, String orgaoEmissor, Date dtNascimento, Date dtEmissaoRg, String reservista,
			String tituloEleitor, String ctps) {
		super();

		this.cpf = cpf;
		this.rg = rg;
		this.orgaoEmissor = orgaoEmissor;
		this.dtNascimento = dtNascimento;
		this.dtEmissaoRg = dtEmissaoRg;
		this.reservista = reservista;
		this.tituloEleitor = tituloEleitor;
		this.ctps = ctps;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Date getDtEmissaoRg() {
		return dtEmissaoRg;
	}

	public void setDtEmissaoRg(Date dtEmissaoRg) {
		this.dtEmissaoRg = dtEmissaoRg;
	}

	public String getReservista() {
		return reservista;
	}

	public void setReservista(String reservista) {
		this.reservista = reservista;
	}

	public String getTituloEleitor() {
		return tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

}
