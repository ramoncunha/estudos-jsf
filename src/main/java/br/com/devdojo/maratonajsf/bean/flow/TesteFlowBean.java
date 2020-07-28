package br.com.devdojo.maratonajsf.bean.flow;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@FlowScoped(value = "registration")
public class TesteFlowBean implements Serializable {

    private String nome;
    private String sobrenome;
    private String endereco;

    public String salvar() {
        System.out.println("Salvando algo no bd");
        return "exitToInicio";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
