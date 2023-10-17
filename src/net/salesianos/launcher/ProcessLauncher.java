package net.salesianos.launcher;



import java.io.IOException;
import java.util.ArrayList;

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

    
}