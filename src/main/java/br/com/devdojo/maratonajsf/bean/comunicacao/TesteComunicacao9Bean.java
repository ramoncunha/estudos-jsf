package br.com.devdojo.maratonajsf.bean.comunicacao;

import br.com.devdojo.maratonajsf.model.Estudante;
import org.omnifaces.util.Faces;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@Named
@ViewScoped
public class TesteComunicacao9Bean implements Serializable {

    private String password;
    private List<Estudante> estudanteList = Estudante.estudanteList();

    public void remover(Estudante estudante) {
        estudanteList.remove(estudante);
    }

    public void salvar() {
        System.out.println(this.password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }
}
