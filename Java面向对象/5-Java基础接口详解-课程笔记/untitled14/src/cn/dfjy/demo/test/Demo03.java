package cn.dfjy.demo.test;

import cn.dfjy.demo.entity.*;

public class Demo03 {
    public static void main(String[] args) {
        // 买个裸机
        //Printer printer = new Printer();
        //System.out.println(printer);

        // 买个整机
        Printer printer = new Printer(new ColorInk(), new A4Paper());
        System.out.println(printer);

        // 更换纸张
        printer.setInk(new BlankInk());
        printer.setPaper(new B5Paper());
        System.out.println(printer);
    }
}
