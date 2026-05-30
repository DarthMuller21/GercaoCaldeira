package DesafiosPoo.Rpg.dominio;

public class Monstros {
    private String nomeMosntro;
    private String tipoMonstro;
    private int vida;
    private int ataque;
    private int defesa;

    public String getNomeMosntro() {
        return nomeMosntro;
    }

    public void setNomeMosntro(String nomeMosntro) {
        this.nomeMosntro = nomeMosntro;
    }

    public String getTipoMonstro() {
        return tipoMonstro;
    }

    public void setTipoMonstro(String tipoMonstro) {
        this.tipoMonstro = tipoMonstro;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void MonstroHaatacar(Monstros monstro){
        int danoAtual = this.ataque - monstro.defesa;
        if (this.tipoMonstro.equals("Jedi") && monstro.tipoMonstro.equals("Sith")){
            danoAtual+= 10;
        }
        monstro.vida-=danoAtual;
        if (monstro.vida>0) {
            System.out.println("O monstro: " + this.nomeMosntro + " Atacaou o monstro " + monstro.nomeMosntro + "\n"
                    + " E deu dano de " + this.ataque + "e o monstro " + monstro.nomeMosntro + " Ficou com " + monstro.vida + " De vida");
        }else {
            System.out.println(monstro.nomeMosntro+ " Foi derrotado");
        }
    }

    public void ReceberDano(int dano){
        int danoAtual = dano - this.defesa;
        this.vida -=danoAtual;
        if (this.vida >0){
            System.out.println(this.nomeMosntro + " vida: "+this.vida);
        }else {
            System.out.println(this.nomeMosntro + " Foi derrotado");
        }
    }
    public void ExibirFichaTecnica(){
        System.out.println("FichaTecnica");
        System.out.println("Nome: "+this.nomeMosntro);
        System.out.println("Tipo Monstro: "+this.tipoMonstro);
        System.out.println("Vida Monstro: "+this.vida);
        System.out.println("Ataque Monstro: "+this.ataque);
        System.out.println("Defesa Monstro: "+this.defesa);
    }

    public void ExibirStatus(){
        if (this.vida > 0){
            System.out.println(this.nomeMosntro + " esta com " + this.vida + " vida");
        }else {
            System.out.println(this.nomeMosntro + " morreu");
        }
    }

}
