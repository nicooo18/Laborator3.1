package ro.ulbs.paradigme.lab3.util;
import java.util.Random;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = new Random().nextInt(6) + 5; // Numar intre 5 si 10
    private final String magicString;
    private final String name;

    public PasswordMaker(String name) {
        this.name = name;
        this.magicString = StringRandomizer.generateRandomString(20);
    }

    public String getPassword() {
        Random random = new Random();

        // sir random de lungime MAGIC_NUMBER
        String randomPart1 = StringRandomizer.generateRandomString(MAGIC_NUMBER);

        // alegere 10 caractere random din magicString
        StringBuilder randomPart2 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(magicString.length());
            randomPart2.append(magicString.charAt(index));
        }

        String nameLength = String.valueOf(name.length());

        // numar aleator intre 0 si 50
        int randomNumber = random.nextInt(51);

        // construirea parolei
        return randomPart1 + randomPart2 + nameLength + randomNumber;
    }

    public static void main(String[] args) {
        PasswordMaker pm = new PasswordMaker("Andrei");
        System.out.println("Parola generata: " + pm.getPassword());
    }
}
