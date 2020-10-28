package day09;

/*
 * 汽车生产工厂
 * @Author wangyi
 * @Date 22:12 2020/9/21
 * @Param
 * @return
 **/
public interface BWMFactry {
    BWM productBwm();
}

class BWM3Factry implements BWMFactry {
    @Override
    public BWM productBwm() {
        System.out.println("生产BWM3系的工厂");
        return new BWM3();
    }
}
class BWM5Factry implements BWMFactry{
    @Override
    public BWM productBwm() {
        System.out.println("生产BWM5系的工厂");
        return new BWM5();
    }
}
class BWM7Factry implements BWMFactry{
    @Override
    public BWM productBwm() {
        System.out.println("生产BWM7系的工厂");
        return new BWM7();
    }
}
