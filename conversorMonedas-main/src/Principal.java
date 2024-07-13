import com.aluracursos.modelos.ConsultaDivisa;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        ConsultaDivisa consultaDivisa = new ConsultaDivisa();
        Scanner lectura = new Scanner(System.in);
        double aConvertir;
        var divisaslista =  consultaDivisa.consulta();
        double valorConvertido;
        boolean salir = true;
        System.out.println("************************************************");
        System.out.println("Bienvenido al sistema de conversion de divisas");
        while (salir){
            System.out.println("Por favor seleccione una opción para la conversión");
            System.out.println("1) Dolar => Peso Argentino");
            System.out.println("2) Peso argentino => Dolar");
            System.out.println("3) Dolar => Real brasilenio");
            System.out.println("4) Real brasilenio => Dolar");
            System.out.println("5) Dolar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dolar");
            System.out.println("7) Salir");
            var opcion = Integer.valueOf(lectura.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor a convertir");
                    aConvertir = Double.valueOf(lectura.nextLine());
                    valorConvertido =  (Double) divisaslista.get(0) * aConvertir;
                    System.out.println("el equivalente de: " + aConvertir + " dolares a ARS: " +valorConvertido);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a convertir");
                    aConvertir = Double.valueOf(lectura.nextLine());
                    valorConvertido =  aConvertir / (Double) divisaslista.get(0) ;
                    System.out.println("el equivalente de: " + aConvertir + " ARS a dolares: " +valorConvertido);
                    break;
                case 3:
                    System.out.println("Ingrese el valor a convertir");
                    aConvertir = Double.valueOf(lectura.nextLine());
                    valorConvertido =  (Double) divisaslista.get(1) * aConvertir;
                    System.out.println("el equivalente de: " + aConvertir + " dolares a BRL: " +valorConvertido);
                    break;
                case 4:
                    System.out.println("Ingrese el valor a convertir");
                    aConvertir = Double.valueOf(lectura.nextLine());
                    valorConvertido =  aConvertir / (Double) divisaslista.get(1) ;
                    System.out.println("el equivalente de: " + aConvertir + " BRL a dolares: " +valorConvertido);
                    break;
                case 5:
                    System.out.println("Ingrese el valor a convertir");
                    aConvertir = Double.valueOf(lectura.nextLine());
                    valorConvertido =  (Double) divisaslista.get(2) * aConvertir;
                    System.out.println("el equivalente de: " + aConvertir + " dolares a COP: " +valorConvertido);
                    break;
                case 6:
                    System.out.println("Ingrese el valor a convertir");
                    aConvertir = Double.valueOf(lectura.nextLine());
                    valorConvertido =  aConvertir / (Double) divisaslista.get(2);
                    System.out.println("el equivalente de: " + aConvertir + " COP a dolares: " +valorConvertido);
                    break;
                case 7:
                   salir = false;
                   break;
                default:
                    System.out.println("Ingrese una opción valida por favor");
            }
            System.out.println("************************************************");
        }
    }
}
