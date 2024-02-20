package cc.merrymaker.java8.抽取子流和连接流;

import cc.merrymaker.java8.流的方法.FMF;

import java.util.stream.Stream;

/**
 * @author MerryMaker
 */
public class demo {
    public static String words="hello";
    /**
     *limit方法对于裁剪无限流非常有用，当然对于有限流也有用
     */
    public static void demoOne(){
        //只要流的前n个元素，这里是100
        Stream<Double> limit = Stream.generate(Math::random).limit(100);
        //跳过流的第一个元素
        Stream<String> skip = Stream.of(words.split("\\PL+")).skip(1);
        //将两个流连接起来
        Stream.concat(FMF.letter("hello"),FMF.letter("world"));
    }
}
