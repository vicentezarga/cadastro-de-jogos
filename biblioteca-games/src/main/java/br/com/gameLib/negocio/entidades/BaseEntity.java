package br.com.gameLib.negocio.entidades;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

	@Column(name = "DT_INCLUSAO", insertable = true, columnDefinition = "TIMESTAMP", nullable = false)
	private LocalDateTime dtInclusao;

	@Column(name = "DT_ALTERACAO" , insertable = false, updatable = true ,columnDefinition = "TIMESTAMP", nullable = false)
	private LocalDateTime dtAlteracao;

	@Column(name = "ST_ATIVO")
	private boolean ativo = Boolean.TRUE;

	@Column(name = "ID__USUARIO_INCLUSAO")
	private String idUserInclusao;

	@Column(name = "ID_USUARIO_ALTERACAO")
	private String idUserAlteracao;

	public BaseEntity() {
		
	}
	
	public BaseEntity(LocalDateTime dtInclusao, LocalDateTime dtAlteracao, String idUserInclusao,
			String idUserAlteracao) {
		super();
		this.dtInclusao = dtInclusao;
		this.dtAlteracao = dtAlteracao;
		this.idUserInclusao = idUserInclusao;
		this.idUserAlteracao = idUserAlteracao;
	}

	public LocalDateTime getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(LocalDateTime dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public LocalDateTime getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(LocalDateTime dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getIdUserInclusao() {
		return idUserInclusao;
	}

	public void setIdUserInclusao(String idUserInclusao) {
		this.idUserInclusao = idUserInclusao;
	}

	public String getIdUserAlteracao() {
		return idUserAlteracao;
	}

	public void setIdUserAlteracao(String idUserAlteracao) {
		this.idUserAlteracao = idUserAlteracao;
	}

}
