public class Demo01 {
    public static void main(String[] args) {
        // 计算机的底层全部都是字节 ---- ----
        // 一个字节由八个位构成的
        // 每个位状态只有 0 1
        // 一个字节的所有状态 2^8状态=256个状态
        // 美国发明了计算机的字节，存储各种各样的信息，自己的文字
        // 一个字节的一半就可以了
        // 0--- ----
        // 建立了一张数字与文字的映射表
        // 0~127 97 a
        char c1 = 97;
        char c2 = 'a';
        System.out.println(c1);
        System.out.println(c2);
        // ASCII是最最基础的一张码表 0-127
    }
}
