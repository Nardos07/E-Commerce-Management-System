package filehandling;

import java.io.*;

public class FileManager {

    public void saveData(Object object, String fileName) {

        try (
                ObjectOutputStream out =
                        new ObjectOutputStream(
                                new FileOutputStream(fileName))
        ) {

            out.writeObject(object);

        } catch (IOException e) {

            System.out.println(
                    "Error saving data: "
                            + e.getMessage()
            );
        }
    }

    public Object loadData(String fileName) {

        try (
                ObjectInputStream in =
                        new ObjectInputStream(
                                new FileInputStream(fileName))
        ) {

            return in.readObject();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println(
                    "Error loading data: "
                            + e.getMessage()
            );
        }

        return null;
    }
}
