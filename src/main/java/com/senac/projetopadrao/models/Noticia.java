package com.senac.projetopadrao.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import static javax.persistence.GenerationType.*;
 import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
 import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1


@Entity
public class Noticia implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
        public String titulo;
        public String introducao;
        public String data_publicacao;
        public int produto_id;
        public String produtos;
        public String editorias;
        public String imagens;
        public String produtos_relacionados;
        public boolean destaque;
        public String link;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroducao() {
        return introducao;
    }

    public void setIntroducao(String introducao) {
        this.introducao = introducao;
    }

    public String getData_publicacao() {
        return data_publicacao;
    }

    public void setData_publicacao(String data_publicacao) {
        this.data_publicacao = data_publicacao;
    }

    public int getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getEditorias() {
        return editorias;
    }

    public void setEditorias(String editorias) {
        this.editorias = editorias;
    }

    public String getImagens() {
        return imagens;
    }

    public void setImagens(String imagens) {
        this.imagens = imagens;
    }

    public String getProdutos_relacionados() {
        return produtos_relacionados;
    }

    public void setProdutos_relacionados(String produtos_relacionados) {
        this.produtos_relacionados = produtos_relacionados;
    }

    public boolean isDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
