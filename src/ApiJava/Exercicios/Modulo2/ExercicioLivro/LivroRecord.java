package ApiJava.Exercicios.Modulo2.ExercicioLivro;

record Editora(String nome, String cidade) {}
record Livro(String titulo, String autor, Editora editora) {}
