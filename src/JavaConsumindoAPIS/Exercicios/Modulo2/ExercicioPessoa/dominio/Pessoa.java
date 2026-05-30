package JavaConsumindoAPIS.Exercicios.Modulo2.ExercicioPessoa.dominio;

public class Pessoa {
    private String name;
    private int age;

    public Pessoa(PessoaJson pessoajson) {
        this.name = pessoajson.nome();
        this.age = pessoajson.idade();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
