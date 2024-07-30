package day_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Person {
    private String name;
    private String lastName;
    private String identityCard;
    private int age;
    private double height;
    private boolean married;
    private Set<Pet> mascot = new HashSet<>();

    public Person(String name, String lastName, String identityCard, int age, double height, boolean married) {
        this.name = name;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Set<Pet> getMascot() {
        return mascot;
    }

    public void setMascot(Set<Pet> mascot) {
        this.mascot = mascot;
    }

    public void addPets(Set<Pet> mascot){
        for (Pet pet : mascot) {
            pet.setOwner(this);
            this.mascot.add(pet);
        }
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
        if(this.mascot.isEmpty()){
            System.out.println("No tengo mascotas.");
        }else{
            System.out.println("Mis mascotas son:" );
            for (Pet pet : this.mascot) {
                System.out.println("-" + pet.getName() + " es un " + pet.getType() + " y tiene " + pet.getAge() + " años");
            }
        }
        return ".";
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                ", mascot=" + mascot +
                '}';
    }
}
