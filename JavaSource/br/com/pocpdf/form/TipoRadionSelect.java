package br.com.pocpdf.form;

public class TipoRadionSelect {

    private String nome = null;
    private int id = 0;
    public String getNome() {
        return nome;
    }
        
    
    public TipoRadionSelect() {

    }


    public TipoRadionSelect(int id, String nome) {
        this.nome = nome;
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
