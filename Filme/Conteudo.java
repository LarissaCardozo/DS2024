 
public abstract class Conteudo {
    private String categoria;
    private String titulo;
    
    public Conteudo(String categoria, String titulo) {
        this.categoria = categoria;
        this.titulo = titulo;
    }
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void descricao() {
        System.out.println("Categoria:"+categoria+", T�tulo:"+titulo);
    }
}