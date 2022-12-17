package br.com.negocio.entidades;

import java.util.Date;

public class TipoJogo {

	private long id;

	private String cdTipoJogo;

	private String descricao;

	private Date dtInclusao;

	private Date dtAlteracao;

	public TipoJogo(long id, String cdTipoJogo, String descricao, Date dtInclusao, Date dtAlteracao) {
		super();
		this.id = id;
		this.cdTipoJogo = cdTipoJogo;
		this.descricao = descricao;
		this.dtInclusao = dtInclusao;
		this.dtAlteracao = dtAlteracao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCdTipoJogo() {
		return cdTipoJogo;
	}

	public void setCdTipoJogo(String cdTipoJogo) {
		this.cdTipoJogo = cdTipoJogo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public Date getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

}
