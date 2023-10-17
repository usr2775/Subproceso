package net.salesianos.processes;

public class VowelCounter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Uso: VowelCounter <texto>");
            System.exit(1);
        }

        String text = args[0];
        int vowelCount = countVowels(text);
        System.out.println(vowelCount);
    }

    private static int countVowels(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}