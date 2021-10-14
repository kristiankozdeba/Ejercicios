package ejercicios;

import java.util.Scanner;

public class ejercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 11:
                System.out.println("Dime el numero: ");
                int numeroprimo = sc.nextInt();
                int numero = 0;
                boolean primo = true;
                for (numero = 2; numero >= Math.sqrt(numeroprimo); numeroprimo++) {
                    if (numeroprimo % numero == 0)
                        primo = false;
                }
                if (primo)
                    System.out.println("Es primo.");
                else
                    System.out.println("No es Primo.");
                break;
            case 13:
                System.out.println("Euros por hora: ");
                int sueldohora = sc.nextInt();
                int dia;
                int horasacumuladas = 0;
                for (dia = 1; dia <= 6; dia++) {
                    System.out.println("Horas trabajadas dia " + dia + " :");
                    int horas = sc.nextInt();
                    horasacumuladas = horas + horasacumuladas;
                }
                System.out.println("Horas acumuladas: " + horasacumuladas);
                System.out.println("Sueldo: " + horasacumuladas * sueldohora + " euros.");
                break;
            case 15:
                int mes;
                int pago = 0;
                double total = 0;
                for (mes = 1; mes <= 20; mes++) {
                    System.out.println("Proceso: " + mes);
                    if (mes == 1)
                        pago = 10;
                    else
                        pago = pago * 2;
                    total = total + pago;
                    System.out.println("Valor del pago: " + pago + " euros.");
                }
                System.out.println("Valor total: " + total + " euros.");
                break;
            case 16:
                System.out.println("Numero trabajadores: ");
                int numerotrabajadores = sc.nextInt();
                System.out.println("Euros por hora: ");
                int euroshora = sc.nextInt();
                int trabajador;
                int horasacumuludas = 0;
                for (trabajador = 1; trabajador <= numerotrabajadores; trabajador++) {
                    System.out.println("Horas trabajadas: ");
                    int horastrabajador = sc.nextInt();
                    horasacumuladas = horasacumuludas + horastrabajador;
                    System.out.println("El trabajador: " + trabajador + " cobrara: " + horastrabajador * euroshora);
                    System.out.println("El pago total a los trabajadores es de: " + horasacumuladas * euroshora);
                }
                break;
            case 17:
                System.out.println("Numero empleados: ");
                int empleados = sc.nextInt();
                System.out.println("Dias trabajados: ");
                int diasempleados = sc.nextInt();
                System.out.println("Horas al dia: ");
                int horasaldia = sc.nextInt();
                int empleado;
                for (empleado = 1; empleado <= empleados; empleado++) {
                    System.out.println("Dias trabajados: ");

                }


            case 18:
                int hora;
                int minuto;
                int segundo;
                for (hora = 0; hora <= 23; hora++) {
                    for (minuto = 0; minuto <= 59; minuto++) {
                        for (segundo = 0; segundo <= 59; segundo++) {
                            System.out.println("Hora:" + hora + "Minutos:" + minuto + "Segundos:" + segundo);
                        }
                    }
                    break;
                }
            case 20:



        }

    }
}