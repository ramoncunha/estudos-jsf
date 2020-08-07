package br.com.devdojo.maratonajsf.bean.comunicacao;

import br.com.devdojo.maratonajsf.model.Estudante;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class TesteComunicacao6Bean implements Serializable {

    private List<Estudante> estudanteList = Estudante.estudanteList();

    public String editar(int index) {
        Estudante estudante = this.estudanteList.get(index);
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("estudante", estudante);
        return "comunicacao7?faces-redirect=true";
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }
}
