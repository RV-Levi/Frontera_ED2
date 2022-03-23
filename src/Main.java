
import java.util.Scanner;

/*
Estructura del árbol por https://aprenderaprogramar.com/foros/index.php?PHPSESSID=01aq37u7s0quf77huc4irj3m22&topic=1428.0
 */
/**
 *
 * @author elarteaga
 */
public class Main {

    public static void main(String[] arg) {
        ArbolBinario abo = new ArbolBinario();
        int var1, var2, iter;
        Double valor;
        Double inser;
        Scanner texto = new Scanner(System.in);

        System.out.println("Cómo desea ingresar datos?\n"
                + "1. Manualmente\n"
                + "2. De forma aleatoria\n"
                + "0. Salir");
        var1 = texto.nextInt();
        while (var1 < 0 | var1 > 2) {
            System.out.println("Cómo desea ingresar datos?\n"
                    + "1. Manualmente\n"
                    + "2. De forma aleatoria\n"
                    + "0. Salir");
            var1 = texto.nextInt();
        }
        switch (var1) {
            case 1:
                System.out.println("Ingrese un valor: ");
                inser = texto.nextDouble();
                abo.agregar(inser);
                do {
                    System.out.println("Desea ingresar otro número?\n"
                            + "1. Sí\n"
                            + "0. No");
                    iter = texto.nextInt();
                    if (iter != 0) {
                        System.out.println("Ingrese un valor: ");
                        inser = texto.nextDouble();
                        abo.agregar(inser);
                    }
                } while (iter != 0);
                break;
            case 2:
                System.out.println("Insertando los siguientes valores de forma aleatoria: ");
                for (int i = 1; i <= 10; i++) {
                    valor = Math.random() * 100;
                    System.out.print(valor + " ");
                    abo.agregar(valor);
                }
                break;
        }

        if (var1 != 0) {
            do {
                System.out.println("");
                System.out.println("1. Cantidad de nodos del árbol");
                System.out.println("2. Cantidad de nodos hoja");
                System.out.println("3. Altura del árbol");
                System.out.println("4. Balance");
                System.out.println("5. MOSTRAR NODOS HOJAS");
                System.out.println("0. Salir");
                var2 = texto.nextInt();
                switch (var2) {
                    case 1:
                        System.out.println("Cantidad de nodos del árbol: " + abo.cantidad());
                        break;
                    case 2:
                        System.out.println("Cantidad de nodos hoja: " + abo.cantidadNodosHoja());
                        break;
                    case 3:
                        System.out.println("La alturra del árbol es: " + abo.retornarAltura());
                        break;
                    case 4:
                        abo.imprimirBalance();
                        break;
                    case 5:
                        System.out.println("Los nodos hojas (Frontera) son: ");
                        abo.frontera();
                        break;
                }
            } while (var2 != 0);
        }
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
