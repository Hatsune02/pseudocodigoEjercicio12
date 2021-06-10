import java.util.Scanner;

public class Ejercicio12Java{
    static Scanner leer = new Scanner(System.in);
    public static void main (String[] args){
        double altura = 0;
        int edad = 0;
        double cantidadEdad = 0;
        double cantidadAlturaM = 0;
        double cantidadAlturaF = 0;
        double sumaM = 0;
        double sumaF = 0;
        double sumaEdades = 0;
        String sexo = "";
        double promedioF = 0;
        double promedioM = 0;
        double promedioEdad = 0;

        do{
           altura = getDouble("Ingrese la altura");
            if(altura > 0){
                sexo = getString("Ingrese el sexo (F / M)");
                edad = getInt("Ingrese la edad");
                if(sexo.equals("F")){
                    sumaF = sumaF + altura;
                    cantidadAlturaF++; 
                }
                else if(sexo.equals("M")){
                    sumaM = sumaM + altura;
                    cantidadAlturaM++; 
                }
                else{
                    System.out.println("Solo F o M");
                }
                sumaEdades = sumaEdades + edad;
                cantidadEdad++;
            }

        } while(altura > 0);

        promedioF = (double)sumaF / cantidadAlturaF;
        promedioM = (double)sumaM / cantidadAlturaM;
        promedioEdad = (double)sumaEdades / cantidadEdad;
        
        
        System.out.println("Promedio de altura de las mujeres " + promedioF);
        System.out.println("Promedio de altura de los varones " + promedioM);
        System.out.println("Promedio de edad de los participantes " + promedioEdad);

    }

    public static double getDouble(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9(-9)]*$")){
                n = "";
            }
        }
        
        return Double.parseDouble(n);
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9(-9)]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }


    public static String getString(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("^[A-Za-z ]*$")){
                n = "";
            }
        }
        
        return n;
    }
}