package br.com.devdojo.maratonajsf.bean.application;

import br.com.devdojo.maratonajsf.bean.dependent.TesteDependentBean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {

    private List<String> categorias;
    private final TesteDependentBean testeDependentBean;

    @Inject
    public TesteApplicationBean(TesteDependentBean testeDependentBean) {
        this.testeDependentBean = testeDependentBean;
    }
    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ApplicationScoped");
        this.categorias = asList("RPG", "SCI-FI", "Terror");
        testeDependentBean.getCategoriasList().addAll(asList("Comédia", "Romance"));
    }

    public TesteDependentBean getTesteDependentBean() {
        return testeDependentBean;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }
}
