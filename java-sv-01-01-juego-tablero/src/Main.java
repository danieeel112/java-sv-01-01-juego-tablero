import java.util.Random;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 ) Yago
        char[][] matriz = new char[10][10];
        // 2 ) Sergio
        int vidas = 10;
        // 3 ) Dani

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                matriz[fila][columna] = "*";

            }
        }
        char YODA = "Y";
        matriz[0][0] = YODA;

        char CASILLA_FINAL = "F";
        matriz[9][9] = CASILLA_FINAL;

        Random aleatorios = new Random();

        int filaRandom = aleatorios.nextInt (10);
        int columnaRandom = aleatorios.nextInt (10);

        matriz[filaRandom][columnaRandom] = "M";

        //Alex
         int filaAleatoria2 = aleatorios.nextInt (10);
         int columnaAleatoria2 = aleatorios.nextInt(10);

         matriz [filaAleatoria2][columnaAleatoria2] = "P";;

         //Boris
        for (int i = 0; i < 5; i++){
            filaAleatoria2 = aleatorios.nextInt(10);
            columnaAleatoria2 = aleatorios.nextInt(10);
            matriz[filaAleatoria2][columnaAleatoria2] = 'P';


        }
        




    }
}
