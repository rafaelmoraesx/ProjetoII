package model;

import java.util.Date;

public class Laboratorio {
    private int id;
    private String nome;
    private String descricao;
    private int idLaboratorio;
    private Date dataAquisicao;
    private String status; // "funcionando", "em_manutencao", "fora_de_uso"

    public Laboratorio () {}

    public Laboratorio (int id, String nome, String descricao, int idLaboratorio, Date dataAquisicao, String status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.idLaboratorio = idLaboratorio;
        this.dataAquisicao = dataAquisicao;
        this.status = status;
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getIdLaboratorio() { return idLaboratorio; }
    public void setIdLaboratorio(int idLaboratorio) { this.idLaboratorio = idLaboratorio; }

    public Date getDataAquisicao() { return dataAquisicao; }
    public void setDataAquisicao(Date dataAquisicao) { this.dataAquisicao = dataAquisicao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
