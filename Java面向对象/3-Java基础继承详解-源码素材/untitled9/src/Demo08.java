public class Demo08 {
    public static void main(String[] args) {
        {
            School school1 = new School(); // new一律分配在堆
            School school2 = school1;
            School school3 = school1;
            // GC的垃圾回收机制，记录这块堆空间，引用数1+1+1
            school1.name = "艾溪湖小学";
            school1.show();
        }
        // school1被回收了，GC的垃圾回收机制感应到栈变量school1回收了，引用数0
        // GC的垃圾回收机制，就会考虑回收
        System.gc();
    }
}
