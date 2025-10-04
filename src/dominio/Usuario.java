package dominio;

import java.util.ArrayList;

public class Usuario {
    ArrayList<Livro> livrosEmprestados;
    private String nome;
    private int id;

    public Usuario(int id, ArrayList<Livro> livrosEmprestados, String nome) {
        this.id = id;
        livrosEmprestados = new ArrayList<>();
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }
}

