package 测试.通用.博客;

public class 博客 {
    private String 题目;
    
    public String get题目() {
        return 题目;
    }
    
    public void set题目(String 题目) {
        this.题目 = 题目;
    }
    private 测试.通用.博客.博文 _博文;
    
    public 测试.通用.博客.博文 get_博文() {
        return _博文;
    }
    
    public void set_博文(测试.通用.博客.博文 _博文) {
        this._博文 = _博文;
    }
}
