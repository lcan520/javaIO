package bytestream.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: lizhilong
 * @Description: JAVA IO 字节流文件操作
 * @Date: Created in 11:24 2018/10/8
 * @Modified By:
 */
public class FileOperate {
    public static void copyFile(String src, String dist) throws IOException{
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dist);
        try {
            byte[] buffer = new byte[20*1024];
            int cnt;
            while((cnt = in.read(buffer, 0, buffer.length)) != -1){
                out.write(buffer, 0, cnt);
            }
        } finally {
            in.close();
            out.close();
        }
    }

    public static void main(String[] args) {
        try {
            copyFile("E:\\Person.txt", "E:\\test.TXT");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
