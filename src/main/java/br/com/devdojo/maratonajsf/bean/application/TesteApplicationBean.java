package br.com.devdojo.maratonajsf.bean.application;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {

    private List<String> categorias;

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ApplicationScoped");
        this.categorias = asList("RPG", "SCI-FI", "Terror");
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }
}
