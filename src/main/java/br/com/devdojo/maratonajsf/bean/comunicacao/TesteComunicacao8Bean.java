package br.com.devdojo.maratonajsf.bean.comunicacao;

import br.com.devdojo.maratonajsf.model.Estudante;
import org.omnifaces.util.Faces;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Cookie;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

@Named
@ViewScoped
public class TesteComunicacao8Bean implements Serializable {

    private String key;
    private String value;

    public void init() throws UnsupportedEncodingException {
        Map<String, Object> requestCookieMap = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();

        Faces.getRequestCookie("nome");

    }

    public void salvarCookie() {
        Faces.addResponseCookie(key, value, 0);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
