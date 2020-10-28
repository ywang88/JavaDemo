package day09;

/*
 * 汽车接口
 * @Author wangyi
 * @Date 22:07 2020/9/21
 * @Param
 * @return
 **/
public interface BWM {
    void showIfo();
}
class BWM3 implements BWM{
    @Override
    public void showIfo() {
        System.out.println("这是宝马3系");
    }
}
class BWM5 implements BWM{
    @Override
    public void showIfo() {
        System.out.println("这是宝马5系");
    }
}
class BWM7 implements BWM{
    @Override
    public void showIfo() {
        System.out.println("这是宝马7系");
    }
}
