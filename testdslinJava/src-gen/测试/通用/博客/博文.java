package 测试.通用.博客;

public class 博文 extends 测试.通用.有作者 {
    private String 题目;
    
    public String get题目() {
        return 题目;
    }
    
    public void set题目(String 题目) {
        this.题目 = 题目;
    }
    private String 内容;
    
    public String get内容() {
        return 内容;
    }
    
    public void set内容(String 内容) {
        this.内容 = 内容;
    }
    private 测试.通用.博客.评论 评论;
    
    public 测试.通用.博客.评论 get评论() {
        return 评论;
    }
    
    public void set评论(测试.通用.博客.评论 评论) {
        this.评论 = 评论;
    }
}
