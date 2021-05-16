package Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Driver {
    public static void main(String[] args) {
        ArrayList<String> genes = new ArrayList<>();
        
        String inputLine = "";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a gene (Enter \"q\" to stop and use given genes):");
            inputLine = sc.nextLine();
            if (inputLine.equalsIgnoreCase("q")) {
                break;
            }

            if (inputLine.length() != 6) {
                System.out.println("Invalid gene. Please try again.");
                continue;
            }

            boolean isValid = true;
            List<String> validGenes = List.of("y", "g", "h", "x", "w");
            for (String s : inputLine.split("")) {
                if (!validGenes.contains(s)) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid) {
                System.out.println("Invalid gene. Please try again.");
                continue;
            }
            
            genes.add(inputLine);
        }
        
        if (genes.size() != 4) {
            System.out.println("Not enough genes given.");
            return;
        }

        String breeded = breed((String[]) genes.toArray());
        System.out.println(breeded);
    }
    
    private static String breed(String[] genes) {
        String finalGene;
        for (int i = 0; i < 6; i++) {
            int numY = 0;
            int numG = 0;
            int numH = 0;
            
            int numX = 0;
            int numW = 0;
            
            for (String gene : genes) {
                switch (gene) {
                    case "y":
                        numY++;
                        break;
                    case "g":
                        numG++;
                        break;
                    case "h":
                        numH++;
                        break;
                    case "x":
                        numX++;
                        break;
                    case "w":
                        numW++;
                        break;
                    default:
                        break;
                }
            }
            
            
        }
        
        return finalGene;
    }
}
