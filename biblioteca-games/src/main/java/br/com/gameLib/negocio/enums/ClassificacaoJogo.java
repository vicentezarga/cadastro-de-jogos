package br.com.gameLib.negocio.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ClassificacaoJogo {

	INFANTIL(0, "Infantil"), 
	ADULTA(1, "Adulta"), 
	INFANTO(2, "Infanto"), 
	JUVENIL(3, "Juvenil");

	private final Integer codigo;

	private final String descricao;

	private ClassificacaoJogo(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static List<ClassificacaoJogo> getAllClassificacaoJogo(){
		return Arrays.asList(ClassificacaoJogo.values()).stream().collect(Collectors.toList());
	}
	
	public static String getClassificacaoJogo (ClassificacaoJogo classificacao) {
		return Arrays.stream(ClassificacaoJogo.values())
				.filter(item -> item == classificacao)
				.map(ClassificacaoJogo::getDescricao)
				.findFirst().orElse(null);
	}

	public static ClassificacaoJogo getClassificacaoJogoByDescricao(String descricao) {
		return 	Arrays.stream(ClassificacaoJogo.values())
				.filter(item -> item.getDescricao().equals(descricao))
				.findFirst().orElse(null);
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
