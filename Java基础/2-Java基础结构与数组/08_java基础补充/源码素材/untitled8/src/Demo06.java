import java.io.File;

public class Demo06 {
    public static void main(String[] args) {
        showFiles(new File("D:\\202203\\正科\\08_补充\\附件\\a"));
    }

    /*
        展示文件夹下所有的文件，包含子文件夹下的文件
     */
    public static void showFiles(File file) {
        File[] files = file.listFiles(); // 枚举该文件夹file对象下的文件或文件夹对象
        for (File f : files) {
            if (f.isFile()) System.out.println(f.getName()); // 文件
            if (f.isDirectory()) showFiles(f); // 递归调用文件夹
        }
    }
}
