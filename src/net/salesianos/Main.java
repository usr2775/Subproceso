package net.salesianos;

import java.io.File;
import java.util.ArrayList;

import static net.salesianos.launcher.ProcessLauncher.getVowelCount;
import static net.salesianos.launcher.ProcessLauncher.startVowelCountProcess;
import static net.salesianos.utils.Utils.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> lines = getAllLines("lorem_ipsum.txt");
        ArrayList<Process> allProcesses = new ArrayList<>();

        int totalVowels = 0;
        for (char vowel : "aeiou".toCharArray()) {
            Process javaProcess = startVowelCountProcess(lines, String.valueOf(vowel));
            allProcesses.add(javaProcess);
        }

        try {
            for (Process process : allProcesses) {
                process.waitFor();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Texto completo:");
        for (String line : lines) {
            System.out.println(line);
        }

        System.out.println("\nNúmero total de vocales:");

        for (char vowel : "aeiou".toCharArray()) {
            int vowelCount = getVowelCount(String.valueOf(vowel));
            System.out.println(vowel + ": " + vowelCount);
            totalVowels += vowelCount;
        }

        System.out.println("\nNúmero total de vocales en el texto: " + totalVowels);

        for (char vowel : "aeiou".toCharArray()) {
            String outputFileName = "output_" + vowel + ".txt";
            File outputFile = new File(outputFileName);
            outputFile.delete();
        }

    }

}
