package cc.merrymaker.java8.流操作;

import java.util.ArrayList;
import java.util.List;

/**
 * 流的作用
 * @author MerryMaker
 */
public class  Flow{
    /**
     * 一般处理集合我们都会使用迭代进行遍历然后再进行操作，
     * 使用流比循环版本要更容易阅读因为代码短
     *
     */
    public static void flowOne(){
        List<String> words =new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("flow");
        words.add("java");
        //迭代操作
        for (String word : words) {
            //在这里进行操作
            System.out.println(word);
        }
        //流操作
        words.stream().filter(word->word.length()>4).count();
        //仅将stream修改为parallelStream就可以让流库以并行的方式来执行统计
        words.parallelStream().filter(w->w.length()>4).count();
    }
}
