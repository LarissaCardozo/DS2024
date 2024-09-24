
public class Filme extends Conteudo {

    private int duracao;
    
    public Filme(String titulo, int duracao) {
        super("Filme", titulo);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public void descricao() {
        System.out.println("Categoria:"+getCategoria()+", T�tulo:"+getTitulo()+", Dura��o:"+duracao+" minutos");
    }

    public void descricaoUm() {
        System.out.println("Categoria:"+getCategoria()+", T�tulo:"+getTitulo()+", Dura��o:"+duracao+" minutos");
    }
}

 