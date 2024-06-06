package cn.dfjy.demo.entity;

public class Printer {
    // 属性上多态
    private IInk ink;
    private IPaper paper;

    public Printer() {
    }

    public Printer(IInk ink, IPaper paper) {
        this.ink = ink;
        this.paper = paper;
    }

    public IInk getInk() {
        return ink;
    }

    public void setInk(IInk ink) {
        this.ink = ink;
    }

    public IPaper getPaper() {
        return paper;
    }

    public void setPaper(IPaper paper) {
        this.paper = paper;
    }

    @Override
    public String toString() {
        return "使用" + ink.color() + "在" + paper.size() + "上打印。";
    }
}
