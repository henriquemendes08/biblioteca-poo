package sistema;

import dominio.Emprestimo;
import dominio.Livro;
import dominio.Usuario;

import java.util.ArrayList;

public class BibliotecaSistema  {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;

    public BibliotecaSistema() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();

    }

    public void listarLivros(){

            if(livros.isEmpty()){
                System.out.println("Nenhum livro cadastrado ");
            }else{
                for (int i = 0; i < livros.size(); i++) {
                    Livro l = livros.get(i);
                    System.out.println("Autor: " + l.getAutor());
                    System.out.println("----------------------");
                    System.out.println("ISBN: " + l.getIsbn());
                    System.out.println("----------------------");
                    System.out.println("Titulo: " + l.getTitulo());
                    System.out.println("----------------------");
                    System.out.println("Quantidade: " + l.getQuantidadeDisponivel());

                }
        }
    }

    public void cadastrarLivro(Livro livro){
        livros.add(livro);
    }


    public static void main(String[] args) {
        Livro livro01 = new Livro("João Silva","978-1-56619-909-4 ",15,"Hisoria de Joao Silva");
        BibliotecaSistema bibliotecaSistema = new BibliotecaSistema();
        bibliotecaSistema.cadastrarLivro(livro01);
        bibliotecaSistema.listarLivros();

    }
}
