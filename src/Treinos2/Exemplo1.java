package Treinos2;

import java.util.ArrayList;

public class Exemplo1 {
    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<String>();

        System.out.println(carros);

        carros.add("BMW");
        carros.add("Ferrari");
        carros.add("Audi");
        carros.add("Celta");
        carros.add("Corsa");
        carros.add("Uno");

        System.out.println(carros);

        System.out.println("Carro: " + carros.get(0));

        carros.set(1, "Corcel");
        System.out.println(carros);

        System.out.println("Tamanho da lista: " + carros.size());

        carros.remove(0);

        System.out.println(carros);
        System.out.println("Tamanho da lista: " + carros.size());


        //carros.clear();
        //System.out.println(carros);

        for(int i = 0; i < carros.size(); i++){
            System.out.printf("%d - %s \n", i+1, carros.get(i));
        }

        System.out.println("=========================");


        int i=1;
        for(String carro : carros){
            System.out.printf("%d - %s \n", i, carro);
            i+=1;
        }

        System.out.println("======================");
        //OBTENDO A POSIÇÃO (indice) de um elementos especifico - metodo indexOf
        System.out.println("Indice: " + carros.indexOf("HB20"));

        if(carros.indexOf("Hb20") == -1){
            System.out.println("Veiculo Nao encontrado");
        }else {
            System.out.println("Veiculo encontrado" + carros.indexOf("Hb20"));
        }
    }
}
