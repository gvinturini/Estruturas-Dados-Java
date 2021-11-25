package com.digitalinnovation.listaencadeada;

public class NoListaEncadeada<T> {

    private T conteudo;
    private NoListaEncadeada proximoNo;

    public NoListaEncadeada() {
        this.proximoNo = null;
    }

    public NoListaEncadeada(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public NoListaEncadeada(T conteudo, NoListaEncadeada proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoListaEncadeada getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoListaEncadeada proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoListaEncadeada{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado() {
        String str = "NoListaEncadeada{" +
                "conteudo=" + conteudo +
                '}';
        if (proximoNo != null) {
            str += "->" + proximoNo.toString();
        } else {
            str += "0>null";
        }

        return str;
    }
}
