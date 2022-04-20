package com.company;

import java.io.*;
import java.nio.file.Files;

public class FileHandler {
    File file = new File("src/com/company/data");
    public void write(Orders orders) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Order order : orders.orderList) {
            writer.write(order.getCustomerName() + " - " + order.pizzasToString() + "\n");
        }
        writer.close();
    }

    public void read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            System.out.println(currentLine);
        }
        reader.close();
    }

    // https://stackoverflow.com/a/45784174
    public void removeLine(String lineContent) {
        try {
            File temp = new File("_temp_");
            PrintWriter out = new PrintWriter(new FileWriter(temp));
            Files.lines(file.toPath())
                    .filter(line -> !line.contains(lineContent)).forEach(out::println);
            // We filter the content of the file to not contain the line-to-remove.
            // After that we print all the lines-to-keep in the file. The old content
            // is then overwritten.
            out.close();
            temp.renameTo(file);
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

}
