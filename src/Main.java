
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elarteaga
 */
/**
 * @param args the command line arguments
 */
public class Main {

    public static void main(String[] arg) {
        ArbolBinario abo = new ArbolBinario();
        int var;
        int valor;
        Scanner texto = new Scanner(System.in);
        System.out.println(" Insertando los siguientes valores Randomicamente : ");
        for (int i = 1; i <= 10; i++) {
            valor = (int) (Math.random() * 100);
            System.out.print(valor + " ");
            abo.agregar(valor);
        }
        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("1.- Cantidad de nodos del arbol");
            System.out.println("2.- cantidad de nodos hoja");
            System.out.println("3.- Altura del arbol");
            System.out.println("4.- BALANCE");
            System.out.println("0.- Salir");
            var = texto.nextInt();
            switch (var) {
                case 1:
                    System.out.println("Cantidad de nodos del árbol:" + abo.cantidad());
                    break;
                case 2:
                    System.out.println("Cantidad de nodos hoja:" + abo.cantidadNodosHoja());
                    break;
                case 3:
                    System.out.println("La alturra del arbol es:" + abo.retornarAltura());
                    break;
                case 4:
                    abo.imprimirBalance();
                    break;
            }
        } while (var != 0);

    }
}

/*public void frontera(Nodo raiz, Nodo ptr, Nodo Q){
    if (raiz != null & raiz.izq == null & raiz.der == null) {
        Obtener(P);
        P.info = raiz.dato;
        P.link = null;
        if (ptr == null) {
            ptr = P;
        else {
            Q.link = P;
        }
        Q = P;   
    }
    frontera(raiz.izq, ptr, Q);
    frontera(raiz.der, ptr, Q);
}*/