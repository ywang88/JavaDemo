package day09;

import java.io.FileOutputStream;

/**
 * 模板设计模式
 * Author wangyi
 * Create 2020-09-17 23:13
 * ClassName Template
 * Version 1.0
 */
public abstract class Template {
    public abstract void code();

    public final void getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("code方法执行的时间" + (end - start));
    }

    static class TestTmp extends Template {
        @Override
        public void code() {
            int k = 0;
            for (int i = 0; i < 500000; i++) {
                k += 1;
            }
            System.out.println(k);
        }
    }

}
