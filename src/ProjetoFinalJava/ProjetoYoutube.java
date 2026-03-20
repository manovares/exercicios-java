package ProjetoFinalJava;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 2 de JAVA");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("F","Joana",18,"joaninha");
        g[1] = new Gafanhoto("M","Maria",25,"maria");

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

        Visualizacao vis = new Visualizacao(g[0],v[2]);
        System.out.println(vis.toString());
        vis.avaliar();
    }


}
