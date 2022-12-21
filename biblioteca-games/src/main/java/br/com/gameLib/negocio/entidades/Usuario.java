package br.com.gameLib.negocio.entidades;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario extends BaseEntity {

	@Id
	@SequenceGenerator(name = "usuarioGenerator", sequenceName = "USUARIO_SQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarioGenerator")
	private long id;

	@Column(name = "NM_USUARIO")
	private String nome;
	
	@Column(name = "GENERO")
	private boolean genero;
	
	@Column(name = "LOGIN")
	private String login;

	@Column(name = "PASSWORD")
	private String senha;

	@Transient
	private int idade;

	@ManyToOne
	private TipoUsuario tpUsuario;

	@Embedded
	private Endereco endereco;

	@Embedded
	private Documento documento;

	public Usuario(long id, String nome, boolean genero, String login, String senha,
			int idade, TipoUsuario tpUsuario, Endereco endereco, Documento documento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.login = login;
		this.senha = senha;
		this.idade = idade;
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
