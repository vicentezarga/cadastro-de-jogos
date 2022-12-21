package br.com.gameLib.negocio.entidades;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_TIPO_JOGO")
public class TipoJogo extends BaseEntity {

	@Id
	@SequenceGenerator(name = "tipoJogoGenerator", sequenceName = "SQ_TIPO_JOGO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipoJogoGenerator")
	private long id;

	@Column(name = "CD_TIPO_JOGO")
	private String cdTipoJogo;

	@Column(name = "DS_TIPO_JOGO")
	private String descricao;

	@OneToMany(mappedBy = "tipoJogo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Jogo> colecaoJogos;

	public TipoJogo(long id, String cdTipoJogo, String descricao, List<Jogo> colecaoJogos) {
		super();
		this.id = id;
		this.cdTipoJogo = cdTipoJogo;
		this.descricao = descricao;
		this.colecaoJogos = colecaoJogos;
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
	@Basic
	public List<Jogo> getColecaoJogos() {
		return colecaoJogos;
	}

	public void setColecaoJogos(List<Jogo> colecaoJogos) {
		this.colecaoJogos = colecaoJogos;
	}

}
