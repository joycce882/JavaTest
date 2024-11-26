package java24_11_15.filecopy;
import java.io.*;

public class filecopy {
    public static void main(String[] args) {
        String soucefile = "./1.txt";
        String targefile = "2.txt";
        try(
                FileInputStream fin = new FileInputStream(soucefile);
                FileOutputStream fou = new FileOutputStream(targefile);
                )

        {
            byte[] buffer = new byte[1024];
            int byteread;
            while ((byteread= fin.read(buffer)) !=-1){
                fou.write(buffer,0,byteread);
            }
            System.out.println("文件复制完成");
        }
        catch (IOException e){
            System.out.println("file"+e.getMessage());
        }

    }
}
