package br.com.devdojo.maratonajsf.bean.comunicacao;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class TesteComunicacao3Bean implements Serializable {

    private String nome;
    private String sobrenome;

    public void init() {
        //if(!FacesContext.getCurrentInstance().isPostback())
        System.out.println("Criou comunicação 3");
        System.out.println(nome);
        System.out.println(sobrenome);
    }

    public String save() {
        System.out.println("Salvando");
        return "resultado?faces-redirect=true&amp;includeViewParams=true";
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
}
