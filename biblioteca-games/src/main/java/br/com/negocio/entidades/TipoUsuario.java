package br.com.negocio.entidades;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity(name = "TP_USUARIO")
public class TipoUsuario {

	@Id
	@SequenceGenerator(name = "tpUsuarioGenerator", sequenceName = "SQ_TP_USUARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tpUsuarioGenerator")
	private long id;

	private String codTipoUser;

	private String descricao;

	@OneToMany(mappedBy = "tpUsuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private ArrayList<Usuario> colecaoUsuario;

	private Date dtInclusao;

	private Date dtAlteracao;

	public TipoUsuario(long id, String codTipoUser, String descricao, ArrayList<Usuario> colecaoUsuario,
			Date dtInclusao, Date dtAlteracao) {
		super();
		this.id = id;
		this.codTipoUser = codTipoUser;
		this.descricao = descricao;
		this.colecaoUsuario = colecaoUsuario;
		this.dtInclusao = dtInclusao;
		this.dtAlteracao = dtAlteracao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodTipoUser() {
		return codTipoUser;
	}

	public void setCodTipoUser(String codTipoUser) {
		this.codTipoUser = codTipoUser;
	}

	public String getDescricao() {
		return descricao;
	}

	@Basic
	public ArrayList<Usuario> getColecaoUsuario() {
		return colecaoUsuario;
	}

	public void setColecaoUsuario(ArrayList<Usuario> colecaoUsuario) {
		this.colecaoUsuario = colecaoUsuario;
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
