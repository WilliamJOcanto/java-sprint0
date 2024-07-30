package day_2;

import java.util.Arrays;

public class Persona {

   private String name;
   private String lastName;
   private String identityCard;
   private int age;
   private double height;
   private boolean married;
   private String[] petsNames;

   public Persona(String name, String lastName, String identityCard, int age, double height, boolean married, String[] petsNames) {
      this.name = name;
      this.lastName = lastName;
      this.identityCard = identityCard;
      this.age = age;
      this.height = height;
      this.married = married;
      this.petsNames = petsNames;
   }

   public String present(){
      System.out.println("Presentacion de " + this.name + ":");
      System.out.println("¡Hola! mi nombre es " + this.name + " " + this.lastName + ".");
      System.out.println("Tengo " + this.age + " años y mido " + this.height + " metros de altura.");
      if(this.married){
         System.out.println("Estoy casado/a.");
      }else{
         System.out.println("No estoy casado/a");
      }
      System.out.println("Mi DNI es " + this.identityCard + ".");
      if(this.petsNames != null){
         System.out.println("Mis mascotas son:" );
          for (String petsName : this.petsNames) {
              System.out.println("- " + petsName);
          }
      }else{
         System.out.println("No tengo mascotas.");
      }

      return ".";
   }

   @Override
   public String toString() {
      return "Persona{" +
              "name='" + name + '\'' +
              ", lastName='" + lastName + '\'' +
              ", identityCard='" + identityCard + '\'' +
              ", age=" + age +
              ", height=" + height +
              ", married=" + married +
              ", petsNames=" + Arrays.toString(petsNames) +
              '}';
   }

}
