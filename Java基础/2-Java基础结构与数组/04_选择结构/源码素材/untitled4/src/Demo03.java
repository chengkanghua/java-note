public class Demo03 {
    public static void main(String[] args) {
        /* 注意
            1. 多选一
            2. 从上到下，逐一判断，一旦为真，不会往下判断
            3. else if是可以不定项
         */
        int score = 88;
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 70) {
            System.out.println("中等");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("差");
        }
    }
}
