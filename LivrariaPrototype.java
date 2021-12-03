package com.company.prototype;
public class LivrariaPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
            // utilizar o Metodo SETnome para escolher a Dedicatoria
            livaria livro1 = new livaria();
            livro1.setNome("Fernando");
            livro1.getAssunto();
            livro1.getTitulo();
        System.out.println(livro1);
        System.out.println("------");
        livaria livro2 = livro1.clone();
        livro2.setNome("Jean");
        System.out.println(livro2);
        System.out.println("----");
        livaria livro3 = livro1.clone();
        livro3.setNome("Ricardo");
        System.out.println(livro3);
    }
static final class livaria implements  Cloneable {
    private String nome;
    private String titulo = ("Prototype");
    private String assunto = ("Programação");
    // metodos GET
    public String getNome() {
        return nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    // metodos SET


    public void setNome(String nome) {
        this.nome = nome;
    }

    public livaria clone() throws  CloneNotSupportedException {
        return (livaria) super.clone();
    }
    public String toString() {
        return  "livro Dedicado: [ nome: " +getNome() + ", Assunto:" + getAssunto() + ", Titulo: " + getTitulo() + " ] ";




    }
}
}