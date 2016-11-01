package br.com.pocpdf.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class HelloWorldForm extends ActionForm{

    /**
     * 
     */
    private static final long serialVersionUID = 1954606056977084192L;
    
    private String hello = null;
    
    private String selectedItem = null;
    private String selectedItemIterate = null;
    
    public HelloWorldForm(){
        super();
        hello = "Olá Mundo, Quero virar um PDF!!!";
    }
    
    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public String getSelectedItemIterate() {
        return selectedItemIterate;
    }

    public void setSelectedItemIterate(String selectedItemIterate) {
        this.selectedItemIterate = selectedItemIterate;
    }
    
    public void reset(ActionMapping mapping, HttpServletRequest request){
        
        this.selectedItem = "1";
        this.selectedItemIterate = "2";
    }
    
    
}
