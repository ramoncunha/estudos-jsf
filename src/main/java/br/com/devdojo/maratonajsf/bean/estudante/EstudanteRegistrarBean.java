package br.com.devdojo.maratonajsf.bean.estudante;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante(); /* Necessário para acessar os atributos do estudante*/
    private String[] nomesArray = {"DevDojo", "Ramon"};
    private List<String> nomesList = asList("DevDojo", "Ramon");
    private Set<String> nomeSet = new HashSet<>(asList("Ninja", "do", "Java"));
    private Boolean mostrarNotas;

//    {
//         for(String nome: nomeSet)
//        {
//
//        }
//    };

    public String irParaIndex2()
    {
        return "index2?faces-redirect=true";
    }

    public void exibirNotas() {
        this.mostrarNotas = true;
    }

    public void ocultarNotas() {
        this.mostrarNotas = false;
    }

    public Set<String> getNomeSet() {
        return nomeSet;
    }

    public void setNomeSet(Set<String> nomeSet) {
        this.nomeSet = nomeSet;
    }

    public Boolean getMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(Boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }
}
