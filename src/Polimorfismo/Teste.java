package Polimorfismo;

public class Teste {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();

        Canguru c = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish gf = new GoldFish();
        Arara ara = new Arara();

        c.locomover();
        cachorro.locomover();
        cachorro.emitirSom();
        c.emitirSom();
    }
}
