package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInit = LocalDate.now();
    private final LocalDate dataFin = dataInit.plusDays(45);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInit() {
        return dataInit;
    }

    public LocalDate getDataFin() {
        return dataFin;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public void setDevInscritos(Set<Dev> devIncritos) {
        this.devInscritos = devIncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) obj;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInit, bootcamp.dataInit) && Objects.equals(dataFin, bootcamp.dataFin) && Objects.equals(devInscritos, bootcamp.devInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, descricao, dataInit, dataFin, devInscritos, conteudos);
    }
}
