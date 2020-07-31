package br.com.devdojo.maratonajsf.bean.view;

import br.com.devdojo.maratonajsf.bean.dependent.TesteDependentBean;
import br.com.devdojo.maratonajsf.bean.session.TesteSessionBean;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TesteViewBean implements Serializable {

    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();
    private final TesteDependentBean testeDependentBean;
    private final TesteSessionBean testeSessionBean;

    @Inject
    public TesteViewBean(TesteDependentBean testeDependentBean, TesteSessionBean testeSessionBean) {
        this.testeDependentBean = testeDependentBean;
        this.testeSessionBean = testeSessionBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("Entrou no PostConstruct do ViewScoped");
        this.personagens = asList("Phoenix", "Cypher", "Omen");
    }

    public void selecionarPersonagem() {

        if(testeSessionBean.getEstudante().getNome().equals("Ramon")) {
            int index = ThreadLocalRandom.current().nextInt(3);
            String personagem = personagens.get(index);
            personagemSelecionado.add(personagem);
            testeDependentBean.getPersonagemSelecionado().add(personagem);
        }
    }

    public TesteSessionBean getTesteSessionBean() {
        return testeSessionBean;
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

    public TesteDependentBean getTesteDependentBean() {
        return testeDependentBean;
    }
}
