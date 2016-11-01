package br.com.pocpdf.actions;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.pocpdf.form.HelloWorldForm;
import br.com.pocpdf.form.TipoRadionSelect;

public class HelloWorldAction extends Action{
    
    public ActionForward execute (ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response )throws Exception{
        
        HelloWorldForm mensagemHW = new HelloWorldForm();        
        request.setAttribute("HelloWord2", mensagemHW.getHello());
        
        
      //define a dummy collection
        Collection <TipoRadionSelect> tipo = new ArrayList<TipoRadionSelect>();
        tipo.add(new TipoRadionSelect(1, "PDF"));
        tipo.add(new TipoRadionSelect(2, "XLS"));
      
        
        //set the collection in the request
        request.setAttribute("tipo", tipo);
        
        
        return mapping.findForward("hello");
    }

}
