/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poopractica2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author osvaldohm
 * @version 8/10/2018
 */
public class POOPractica2 {
   static String line;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<CitaMedica> list = new ArrayList<CitaMedica>();;
        Scanner scanner = new Scanner(System.in);
        
        int input;

        do {

            System.out.println("Programa:"
                    + "\n 1. Altas"
                    + "\n 2. Bajas"
                    + "\n 3. Modificaciones"
                    + "\n 4. Consultas "
                    + "\n 5. Salir "
                    + "\n");

            input = Integer.parseInt(scanner.nextLine());

            if (input == 1) {
                alta(list);
            } else if (input == 2) {
                baja(list);
            }else if (input == 3) {
                cambio(list);
            }
                else if (input == 4) {
               consulta(list);
            }

        } while (input != 5);

    }

    public static boolean isNumeric(String maybeNumeric) {
        boolean state;
        if(maybeNumeric != null && maybeNumeric.matches("[0-9]+")){
            state = true;          
        } else {state = false;
             

        }
   
        
        return state;
    
    }
    
    public static void alta(ArrayList<CitaMedica> list){
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Escribe el nombre: ");
                String input1 = scanner.nextLine();
                System.out.print("Numero de seguridad social: ");
                int input2 = Integer.parseInt(scanner.nextLine());
                list.add(new CitaMedica(input1, input2));
    }
    
    public static void baja(ArrayList<CitaMedica> list){
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Numero de seguridad social: ");
                int input1 = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getNumSeguroSocial() != 0 && list.get(i).getNumSeguroSocial() == input1) {
                        list.remove(i);
                    }
                };
    }
    
    public static void cambio(ArrayList<CitaMedica> list){
      Scanner scanner = new Scanner(System.in);
      
     System.out.print("Numero de seguridad social: ");
                int input1 = Integer.parseInt(scanner.nextLine());
                String input2;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getNumSeguroSocial() != 0 && list.get(i).getNumSeguroSocial() == input1) {
                        System.out.print("\nIntroduce el número de seguridad social nuevo: ");
                        input2 = scanner.nextLine();
                        list.get(i).setNumSeguroSocial(input1);
                        System.out.print("\nIntroduce el nombre nuevo: ");
                        input2 = scanner.nextLine();
                        list.get(i).setNombrePaciente(input2);
                        System.out.print("\nIntroduce la edad nueva: ");
                        input2 = scanner.nextLine();
                        list.get(i).setEdad(input1);
                        System.out.print("\nIntroduce el domicilio nuevo: ");
                        input2 = scanner.nextLine();
                        list.get(i).setDomicilio(input2);
                        System.out.print("\nIntroduce el telefono nuevo: ");
                        input2 = scanner.nextLine();
                        list.get(i).setTelefonoFijo(input1);
                        System.out.print("\nIntroduce las alergias nuevas: ");
                        input2 = scanner.nextLine();
                        list.get(i).setAlergias(input2);
                        System.out.print("\nIntroduce la hora de cita nueva: ");
                        input2 = scanner.nextLine();
                        list.get(i).setHoraCita(input2);
                        System.out.print("\nIntroduce el consultorio nuevo: ");
                        input2 = scanner.nextLine();
                        list.get(i).setConsultorio(input1);
                        System.out.print("\nIntroduce el doctor nuevo: ");
                        input2 = scanner.nextLine();
                        list.get(i).setDoctor(input2);
                        System.out.print("\nIntroduce el padecimiento nuevo: ");
                        input2 = scanner.nextLine();
                        list.get(i).setPadecimiento(input2);
                    }
                }
    }
    
    public static void consulta(ArrayList<CitaMedica> list){
      Scanner scanner = new Scanner(System.in);
      
       System.out.print("Numero de seguridad social/Nombre/Doctor: ");
                String input1 = scanner.nextLine();
                int social;

                if ( isNumeric(input1) ) {
                    social = Integer.parseInt(input1);
                } else
                {
                    social = 0;
                }

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getNumSeguroSocial() == social || list.get(i).getNombrePaciente().equals(input1) || list.get(i).getDoctor().equals(input1)) {

                        line = "\n Nombre de paciente: " + list.get(i).getNombrePaciente()
                                + "\n Número de seguridad social: " + list.get(i).getNumSeguroSocial()
                                + "\n Edad: " + list.get(i).getEdad()
                                + "\n Domicilio: " + list.get(i).getDomicilio()
                                + "\n Genero: " + list.get(i).getGenero()
                                + "\n Telefono: " + list.get(i).getTelefonoFijo()
                                + "\n Tipo de sangre: " + list.get(i).getTipoSangre()
                                + "\n Alergias: " + list.get(i).getAlergias()
                                + "\n Hora de cita: " + list.get(i).getHoraCita()
                                + "\n Consultorio: " + list.get(i).getConsultorio()
                                + "\n Doctor: " + list.get(i).getDoctor()
                                + "\n Padecimiento: " + list.get(i).getPadecimiento()
                                + "\n ----------- \n";
                        System.out.println(line);
                    }

                }
    }
    
    
}
