package 个人.模型;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import 个人.模型.地址;

@SuppressWarnings("all")
public class 人 {
  private String 姓;
  
  public String get姓() {
    return this.姓;
  }
  
  public void set姓(final String 姓) {
    this.姓 = 姓;
  }
  
  private String 名;
  
  public String get名() {
    return this.名;
  }
  
  public void set名(final String 名) {
    this.名 = 名;
  }
  
  private List<人> 朋友;
  
  public List<人> get朋友() {
    return this.朋友;
  }
  
  public void set朋友(final List<人> 朋友) {
    this.朋友 = 朋友;
  }
  
  private 地址 地址;
  
  public 地址 get地址() {
    return this.地址;
  }
  
  public void set地址(final 地址 地址) {
    this.地址 = 地址;
  }
  
  public String get全名() {
    return (this.姓 + this.名);
  }
  
  public List<人> get按姓名排序的朋友() {
    final Function1<人, String> _function = (人 友) -> {
      return 友.get全名();
    };
    return IterableExtensions.<人, String>sortBy(this.朋友, _function);
  }
}
