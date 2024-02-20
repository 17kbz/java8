package cc.merrymaker.java8.流的方法;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 流的map、filter、flatMap方法
 * @author MerryMaker
 */
public class FMF {
    /**
     * 根据条件过滤流中的元素得到一个新流
     */
    public static List<String> words=new ArrayList<>();
    {
        words.add("hello");
        words.add("world");
    }

    public static void filterOne(){
        Stream<String> stringStream = words.stream().filter(w -> w.length() > 3);
    }

    /**
     * 传入一个方法对流进行操作
     */
    public static void mapOne(){
        Stream<Object> objectStream = words.stream().map(s -> {
            System.out.println(s);
            s.toLowerCase();
            return s;
        });
    }

    /**
     * 将一个String变为字符列表的流
     * @param s
     * @return
     */
    public static Stream<String> letter(String s){
        List<String> result=new ArrayList<>();
        for(int i=0;i<s.length();i++)
            result.add(s.substring(i,i+1));
        return result.stream();
    }

    /**
     *平摊流的流的方法
     */
    public static void flatMapOne(){
        //此时如下代码是返回流的流
        Stream<Stream<String>> streamStream = words.stream().map(w -> letter(w));
        //为了将其摊平威威字母流，而不是流的字母流，可以使用flatMap
        Stream<String> stringStream = words.stream().flatMap(w -> letter(w));
    }
}
