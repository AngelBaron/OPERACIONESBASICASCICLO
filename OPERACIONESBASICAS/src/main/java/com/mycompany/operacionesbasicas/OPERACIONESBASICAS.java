/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacionesbasicas;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class OPERACIONESBASICAS {
int n=0;
int i=0;
float x ,y,res;
String datos;

Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        OPERACIONESBASICAS in=new OPERACIONESBASICAS();
        in.menu();
    }
    public void menu(){
        while(n!=5){
        System.out.printf("1)Suma \n 2)Resta \n 3)multiplicacion \n 4)Division \n 5)RESULTADO \n");
        System.out.println("Dame la opcion");
        n=entrada.nextInt();
        switch(n){
            case 1: 
                suma();
            break;
            case 2: resta();
            break;
            case 3: multiplicacion();
            break;
            case 4: division();
            break;
            case 5: System.out.println("El resultado es: " + res);
            System.out.println("Las operaciones fueron" + datos);
            break;
            default: System.out.println("ERROR");
            
            
        }
        
        
    }}
    public void suma(){
        if(this.i==0){
            System.out.println("OPCION SUMA TIPO x+y");
            System.out.println("Dame el primer numero");
            x=entrada.nextFloat();
            System.out.println("Dame el segundo numero");
            y=entrada.nextFloat();
            datos= x + "+" + y;
            res=x+y;
            i++;
        } else{
            System.out.println("Dame un numero");
            x=entrada.nextFloat();
            datos=x + "+" +"(" +  datos  +")";
            res += x;
        }
        
    }
    public void resta(){
        if(this.i==0){
            System.out.println("OPCION SUMA TIPO x-y");
            System.out.println("Dame el primer numero");
            x=entrada.nextFloat();
            System.out.println("Dame el segundo numero");
            y=entrada.nextFloat();
            datos= x + "-" + y;
            res=x-y;
            i++;
        }else{
            System.out.println("Dame un numero");
            x=entrada.nextFloat();
            datos=x + "-" +"(" +  datos  +")";
            res -=x;
        }
        
    }
    public void multiplicacion(){
        if(this.i==0){
            System.out.println("OPCION SUMA TIPO x*y");
            System.out.println("Dame el primer numero");
            x=entrada.nextFloat();
            System.out.println("Dame el segundo numero");
            y=entrada.nextFloat();
            datos= x + "*" + y;
            res=x*y;
            i++;
        }else{
            System.out.println("Dame un numero");
            x=entrada.nextFloat();
            datos=x + "*" +"(" +  datos  +")";
            res *= x;
        }
        
    }
    public void division(){
        if(this.i==0){
            System.out.println("OPCION SUMA TIPO x/y");
            System.out.println("Dame el primer numero");
            x=entrada.nextFloat();
            System.out.println("Dame el segundo numero");
            y=entrada.nextFloat();
            datos= x + "/" + y;
            res=x+y;
            i++;
        }else{
            System.out.println("Dame un numero");
            x=entrada.nextFloat();
            datos=x + "/" +"(" +  datos  +")";
            res /= x;
        }
    }
    
}
