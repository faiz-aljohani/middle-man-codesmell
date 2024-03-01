public class MagicNumberExample { 
 
    public double calculateCircleArea(int radius) { 
        // Magic number: 3.1415 
        return 3.1415 * radius * radius; 
    } 
 
    public static void main(String[] args) { 
        MagicNumberExample example = new MagicNumberExample(); 
        double circleArea = example.calculateCircleArea(5); 
        System.out.println("Circle Area: " + circleArea); 
    } 
} 
-------------------------------------------- 

import java.util.ArrayList; 
 
public class GodClassExample { 
 
    public class DataProcessor { 
        private ArrayList<String> data; 
 
        public DataProcessor(ArrayList<String> data) { 
            this.data = data; 
        } 
 
        public void processData() { 
            // Complex data processing logic 
            for (String entry : data) { 
                // Processing each entry 
                System.out.println(entry); 
            } 
 
            // More methods and functionality... 
            performAdditionalProcessing(); 
            generateReports(); 
        } 
 
        private void performAdditionalProcessing() { 
            // Additional processing logic 
            System.out.println("Performing additional processing..."); 
        } 
 
        private void generateReports() { 
            // Report generation logic 
            System.out.println("Generating reports..."); 
        } 
    } 
 
    public static void main(String[] args) { 
        GodClassExample example = new GodClassExample(); 
        ArrayList<String> data = new ArrayList<>(); 
        data.add("Data entry 1"); 
        data.add("Data entry 2"); 
        GodClassExample.DataProcessor dataProcessor = example.new DataProcessor(data); 
        dataProcessor.processData(); 
    } 
} 
