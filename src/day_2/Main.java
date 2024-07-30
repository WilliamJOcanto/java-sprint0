package day_2;

public class Main {
    public static void main(String[] args) {

        String[] pets1 = {"Cooper", "Tilo"};
        Persona persona1 = new Persona("Will", "Ocanto", "25087176-8", 23, 1.77, false, pets1);
        System.out.println(persona1.present());

        String[] pets2 = null;
        Persona persona2 = new Persona("José", "Hernandez", "96080765-9", 34, 1.88, true, pets2);
        System.out.println(persona2.present());
    }
}
