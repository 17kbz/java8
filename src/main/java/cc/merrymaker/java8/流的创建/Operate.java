package cc.merrymaker.java8.流的创建;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * 流的创建API
 * @author MerryMaker
 */
public class Operate {
    /**
     *
     */
    public static void operateOne() throws IOException {
        //将数组转换成流的方法
        String[] words=new String[]{"hello","world"};
        Stream.of(words);
        //使用Arrays工具类将数组转化为流
        Arrays.stream(words);
        //创建一个空流
        Stream<Object> empty = Stream.empty();
        //Stream接口中创建流的两个方法
        Stream<String> generate = Stream.generate(() -> "echo");
        Stream<Double> generate1 = Stream.generate(Math::random);
        //生成无限序列
        Stream<BigInteger> iterate = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
        //其他Java API生成流的方法
        Stream<String> stringStream = Pattern.compile("\\PL+").splitAsStream(String.valueOf(words));
        Stream<String> lines = Files.lines(Paths.get(""));
    }
}
