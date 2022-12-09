package com.ikasgela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count_crono = 0;
        Cronometro[] cronometros = new Cronometro[10];
        String opcion;

        do {
            System.out.print("Menu:\na) Crear Nuevo cronometro\nb) Consultar cronometros\nc) Salir\nOpcion: ");
            opcion = String.valueOf(br.readLine().toLowerCase().charAt(0));

            switch (opcion) {
                case "a":
                    if (count_crono <= 9) {
                        cronometros[count_crono] = new Cronometro(System.nanoTime());
                        count_crono++;
                        System.out.println("Cronometro " + (count_crono) + " creado correctamente\n");
                    } else {
                        System.out.println("Se han creado todos los cronometros posibles\n");
                    }
                    break;

                case "b":
                    if (count_crono == 0) {
                        System.out.println("Ningun cronometro creado aún\n");
                    } else {
                        VisualizarCronometros(cronometros);
                    }

                    break;

                case "c":
                    System.out.println("Cronometros finalizados, a continuacion los tiempos finales:\n");
                    VisualizarCronometros(cronometros);
                    break;

                default:
                    System.out.println("Error: Opción Invalida\n");

            }

        } while (!opcion.equals("c"));


    }

    private static void VisualizarCronometros(Cronometro[] cronometros) {
        for (int i = 0; i < cronometros.length; i++) {
            if (cronometros[i] != null) {
                System.out.println("Cronometro " + (i + 1) + ": "
                        + (cronometros[i].TiempoTranscurrido() / 1000000000) + " Segundos (s)");
            }
        }
        System.out.println();
    }
}
