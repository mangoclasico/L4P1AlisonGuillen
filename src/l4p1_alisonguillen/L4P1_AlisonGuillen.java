/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4p1_alisonguillen;


import java.util.Scanner;


public class L4P1_AlisonGuillen {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int Respuesta = 1;

        while (Respuesta != 3) { 
            System.out.println("\nMenu: ");
            System.out.println("1. Conjuntos"); 
            System.out.println("2. Contraseña mejorada");
            System.out.println("3. Salir");

            int opcion = leer.nextInt(); 
    switch (opcion) {
    case 1:{
        String conjunto1,conjunto2;
        System.out.println("Ingrese el primer conjunto: ");
        conjunto1 = leer.next();
        System.out.println("Ingrese el segundo conjunto: ");
        conjunto2 = leer.next();
        
        boolean iguales = true;
        for (int i = 0; i < conjunto1.length(); i++) {
            char c = conjunto1.charAt(i);
            if (c != ',' && conjunto2.indexOf(c) == -1) {
                iguales = false;
                break;
            }
        }
        
        if (iguales) {
            System.out.println("Ambos conjuntos son iguales");
        } else {
            System.out.println("No son iguales lol");
        }
           
        String union = "";
        for (int i = 0; i < conjunto1.length(); i++) {
            char c = conjunto1.charAt(i);
            if (c != ',' && union.indexOf(c) == -1) {
                union += c;
            }
        }
        for (int i = 0; i < conjunto2.length(); i++) {
            char c = conjunto2.charAt(i);
            if (c != ',' && union.indexOf(c) == -1) {
                union += c;
            }
        }
        System.out.println("Unión: " + "{" + union + "}");
        
        String interseccion = "";
        for (int i = 0; i < conjunto1.length(); i++) {
            char c = conjunto1.charAt(i);
            if (c != ',' && conjunto2.indexOf(c) != -1 && interseccion.indexOf(c) == -1) {
                interseccion += c;
            }
        }
        System.out.println("Intersección: " + "{" + interseccion + "}");
    }
    break;
    
    case 2:{                                                     
    System.out.println("Ingrese la contraseña: "); 
    String contra = leer.next(); 
    boolean letras = false;
    boolean digitos = false;

    for (int i = 0; i < contra.length(); i++) {
        char c = contra.charAt(i);
        if (Character.isLetter(c)) {
            letras = true;
        }   else if (Character.isDigit(c)) {
            digitos = true;
     }
}
    if (!letras) { // si no hay letras
        System.out.println("La contraseña debe tener al menos una letra!");
         } if (!digitos) { // si no hay números
        System.out.println("La contraseña debe tener al menos un número!");
        }  if (contra.length() < 8) { // si es menor a 8 caracteres
        System.out.println("La contraseña debe tener al menos 8 caracteres!");
            } else { // si es segura
                System.out.println("La contraseña es segura");
                System.out.println("Ingrese un número: ");
                int num = leer.nextInt();
    
                String nuevaContra = "";
    int cont = 0;
    for (int i = 0; i < contra.length(); i++) {
        nuevaContra += contra.charAt(i);
        cont++;
        if (cont == 2 && i != contra.length() - 1) {
            nuevaContra += num;
            cont = 0;
            num++;
        }
    }
    System.out.println("La nueva contraseña es: " + nuevaContra);
}
    break;
        }
    case 3:
        System.out.println("bai bai"); 
        System.exit(0); 
        break;
    default:
        System.out.println("Opción inválida");
        break;
}

    }
}
}



   



    

    

            