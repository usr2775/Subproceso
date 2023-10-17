package net.salesianos.launcher;


import java.io.IOException;
import java.util.ArrayList;
import net.salesianos.utils.Utils;

public class ProcessLauncher {
    public static Process startVowelCountProcess(ArrayList<String> lines, String vowel) {
        String text = String.join("\n", lines);
        String[] command = {"java", "net.salesianos.processes.VowelCounter", text};
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        Process process = null;
        try {
            processBuilder.redirectErrorStream(true);
            process = processBuilder.start();
            process.getOutputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return process;
    }

    public static int getVowelCount(String vowel) {
        String outputFileName = "output_" + vowel + ".txt";
        return Utils.getTotalCountFromFile(outputFileName);
    }
}