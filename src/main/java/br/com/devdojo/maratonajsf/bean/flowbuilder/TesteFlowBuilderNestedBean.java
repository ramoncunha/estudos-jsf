package br.com.devdojo.maratonajsf.bean.flowbuilder;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@FlowScoped(value = "newpendencies")
public class TesteFlowBuilderNestedBean implements Serializable {

    private String userName;
    private String userSurname;

    public String validarUser() {
        System.out.println("Fazendo consulta no SERASA.");
        System.out.println("Fazendo consulta no SPC.");
//        if(true) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
//                    "Usuário não passou na validação.","Maiores detalhes."));
//            return null;
//        }
        return "proceedToNewRegistration3";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}
