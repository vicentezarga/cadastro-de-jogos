package br.com.gameLib.negocio.entidades;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.gameLib.negocio.enums.ClassificacaoJogo;

@Entity
@Table(name = "TB_JOGO")
public class Jogo extends BaseEntity {

	@Id
	@SequenceGenerator(name = "jogoGenerator", sequenceName = "SQ_JOGO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jogoGenerator")
	private long id;

	@Column(name = "CD_JOGO", nullable = false)
	private String codJobo;

	@Enumerated(EnumType.ORDINAL)
	private ClassificacaoJogo classificacao;

	@ManyToOne
	@Column(name = "TP_JOGO", nullable = false)
	private TipoJogo tipoJogo;

	@Column(name = "DT_LANCAMENTO")
	private LocalDate dtLancamento;

	@Column(name = "DT_COMPRA")
	private LocalDate dtCompra;

	@Column(name = "VL_JOGO")
	private double vlJovo;

	private String imgJogo;

	public Jogo(long id, String codJobo, ClassificacaoJogo classificacao, TipoJogo tipoJogo, LocalDate dtLancamento,
			LocalDate dtCompra, double vlJovo, String imgJogo) {
		super();
		this.id = id;
		this.codJobo = codJobo;
		this.classificacao = classificacao;
		this.tipoJogo = tipoJogo;
		this.dtLancamento = dtLancamento;
		this.dtCompra = dtCompra;
		this.vlJovo = vlJovo;
		this.imgJogo = imgJogo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodJobo() {
		return codJobo;
	}

	public void setCodJobo(String codJobo) {
		this.codJobo = codJobo;
	}

	public ClassificacaoJogo getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(ClassificacaoJogo classificacao) {
		this.classificacao = classificacao;
	}

	public TipoJogo getTipoJogo() {
		return tipoJogo;
	}

	public void setTipoJogo(TipoJogo tpJogo) {
		this.tipoJogo = tpJogo;
	}

	public LocalDate getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(LocalDate dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public LocalDate getDtCompra() {
		return dtCompra;
	}

	public void setDtCompra(LocalDate dtCompra) {
		this.dtCompra = dtCompra;
	}

	public double getVlJovo() {
		return vlJovo;
	}

	public void setVlJovo(double vlJovo) {
		this.vlJovo = vlJovo;
	}

	public String getImgJogo() {
		return imgJogo;
	}

	public void setImgJogo(String imgJogo) {
		this.imgJogo = imgJogo;
	}

}
