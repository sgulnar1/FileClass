import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        File file = new File("C:\\Users\\GHSalehova\\Desktop\\parent");
        Main main = new Main();
        System.out.println(file.list());
        //System.out.println(Files.deleteIfExists(file.toPath()));
        //main.writeFileOutputStreamObject(file);
       // main.readScanner(file);

    }

    public void writeFilesWriteString(File file) throws IOException {
        Files.writeString(file.toPath(), "*****");

    }

    public void writeFileWriter(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("sddf");
        fileWriter.append("\nappend");
        fileWriter.close();
    }
    public void readFileReader(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        int character;
        while((character = fileReader.read()) != - 1) {
            System.out.println((char)character);
        }
    }

    public void readScanner(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext())
            System.out.println(scanner.nextLine());
    }

    public void writeBufferedWriter(File file) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("buffer write test", 3, 7);
        bufferedWriter.close();
    }

    public void readBufferedReader(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ( (line = bufferedReader.readLine()) != null)
            System.out.println(line);;
    }

    public void writeFileOutputStream(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        fileOutputStream.write("salam".getBytes());
        System.out.println((char) 17);
        fileOutputStream.write(17);
        fileOutputStream.close();
    }

    public String readFileOutputStream(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = fileInputStream.readAllBytes();
        System.out.println(Arrays.toString(("salam\r" +
                "necesen?").getBytes()));
        String str = new String(bytes);
        return str.replace("\r", "\n");
    }

    public void writeFileOutputStreamObject(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        User user = new User(1, "Serxan", "padd55", "gmail", "username");
        System.out.println("user: " + user);
        objectOutputStream.writeObject(user);
        fileOutputStream.close();
    }

    public User readFileOutputStreamObject(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (User) objectInputStream.readObject();
    }

    public void fileClass() throws IOException {
        File file = new File("C:\\Users\\GHSalehova\\Desktop");
        File file1 = File.createTempFile("prefix", "suffix", file);
        System.out.println(file1.getAbsolutePath());
        File file2 = new File("test.txt");
        file2.createNewFile();
        System.out.println("listRoots: " + Arrays.toString(File.listRoots()));
        System.out.println("separator: " + File.separator);
        System.out.println("separatorChar: " + File.separatorChar);
        System.out.println("pathSeparator: " + File.pathSeparator);
        System.out.println("pathSeparatorChar: " + File.pathSeparatorChar);
        System.out.println("getPath: " + file2.getPath());
        System.out.println("getAbsoluteFile: " + file2.getAbsoluteFile());
        System.out.println("getParentFile: " + file2.getParentFile());
        System.out.println("canRead: " + file2.canRead());
        // System.out.println("setWritable: " + file2.setWritable(false));
        System.out.println("canWrite: " + file2.canWrite());
        System.out.println("exists: " + file2.exists());
        System.out.println("isAbsolute: " + file2.isAbsolute());
        System.out.println("isHidden: " + file2.isHidden());
        System.out.println("isFile: " + file2.isFile());
        File file3 = new File("C:\\Users\\GHSalehova\\Desktop\\parent1\\child1");
        System.out.println("mkdir: " + file3.mkdir());
        System.out.println("mkdirs: " + file3.mkdirs());
        File file4 = new File("C:\\Users\\GHSalehova\\Desktop\\parent1\\child1\\testFromProject.txt");
        // System.out.println("renameTo: " + file2.renameTo(file4));
        System.out.println("set: " + file2.setLastModified(100000000));
        System.out.println("renameTo: " + file2.toURI());

    }
}
