package br.com.negocio.entidades;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

@Entity(name = "USUARIO")
public class Usuario {

	@Id
	@SequenceGenerator(name = "usuarioGenerator", sequenceName = "USUARIO_SQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarioGenerator")
	private long id;

	private String nome;

	private boolean genero;

	private String login;

	private String senha;

	private Date dtInclusao;

	private Date dtAlteracao;

	@Transient
	private int idade;

	@ManyToOne
	private TipoUsuario tpUsuario;

	@Embedded
	private Endereco endereco;

	@Embedded
	private Documento documento;

	public Usuario(long id, String nome, boolean genero, String login, String senha, Date dtInclusao, Date dtAlteracao,
			int idade, TipoUsuario tpUsuario, Endereco endereco, Documento documento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.login = login;
		this.senha = senha;
		this.idade = idade;
		this.dtInclusao = dtInclusao;
		this.dtAlteracao = dtAlteracao;
		this.tpUsuario = tpUsuario;
		this.endereco = endereco;
		this.documento = documento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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

	public TipoUsuario getTpUsuario() {
		return tpUsuario;
	}

	public void setTpUsuario(TipoUsuario tpUsuario) {
		this.tpUsuario = tpUsuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

}
