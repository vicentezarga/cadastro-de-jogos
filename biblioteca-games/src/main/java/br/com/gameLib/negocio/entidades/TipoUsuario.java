package br.com.gameLib.negocio.entidades;

import java.util.ArrayList;
import java.util.Date;

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

@Entity(name = "TB_TIPO_USUARIO")
public class TipoUsuario extends BaseEntity{

	@Id
	@SequenceGenerator(name = "tpUsuarioGenerator", sequenceName = "SQ_TP_USUARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tpUsuarioGenerator")
	private long id;

	@Column(name = "CD_TP_USUARIO")
	private String codTipoUser;

	@Column(name = "DS_TIPO_USUARIO")
	private String descricao;

	@OneToMany(mappedBy = "tpUsuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private ArrayList<Usuario> colecaoUsuario;


	public TipoUsuario(long id, String codTipoUser, String descricao, ArrayList<Usuario> colecaoUsuario,
			Date dtInclusao, Date dtAlteracao) {
		super();
		this.id = id;
		this.codTipoUser = codTipoUser;
		this.descricao = descricao;
		this.colecaoUsuario = colecaoUsuario;
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
}
