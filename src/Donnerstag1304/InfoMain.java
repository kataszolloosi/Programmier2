package Donnerstag1304;

import java.time.LocalDateTime;

public class InfoMain {
    public static void main(String[] args) {
        Info<String> name = new Info<>("Max", 1);
        Info<Integer> age = new Info<>(30, 2);
        Info<String> adresse = new Info<>("Graz", 2);
        Info<LocalDateTime> registration = new Info<>(LocalDateTime.now(), 2);

        Profil profil = new Profil(name, age, adresse);
        profil.print();
        System.out.println(registration.getData());

    }
}
