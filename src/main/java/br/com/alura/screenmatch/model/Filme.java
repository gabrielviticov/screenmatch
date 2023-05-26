package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.dto.FilmeDTO;

public class Filme {
    private String nome;
    private Integer duracao;
    private Integer ano;
    private String genero;

    public Filme(FilmeDTO dto)
    {
        this.setNome(dto.nome());
        this.setDuracao(dto.duracao());
        this.setAno(dto.ano());
        this.setGenero(dto.genero());
    }

    public String getNome(){ return this.nome; }
    public Integer getDuracao(){ return this.duracao; }
    public Integer getAno(){ return this.ano; }
    public String getGenero(){ return this.genero; }

    public void setNome(String nome){ this.nome = nome; }
    public void setDuracao(Integer duracao){ this.duracao = duracao; }
    public void setAno(Integer ano){ this.ano = ano; }
    public void setGenero(String genero){ this.genero = genero; }

    @Override
    public String toString() {
        return "Filme [nome=" + nome + ", duracao=" + duracao + ", ano=" + ano + ", genero=" + genero + "]";
    }

    
}
