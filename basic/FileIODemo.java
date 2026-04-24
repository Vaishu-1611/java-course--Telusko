import java.io.*;

public class FileIODemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello File");
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}