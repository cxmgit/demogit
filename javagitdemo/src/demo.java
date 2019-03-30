import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2019/3/1/001.
 */
public class demo {
    public static void main(String[] args) {
        //这是我第一次使用git
        System.out.println("工作中要使用git，加油");
        System.out.println("我改的代码");
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = list.subList(1, 4).stream().filter(l->(l%2==0)).collect(Collectors.toList());
        list2.forEach(l -> System.out.println(l));
       /* Stream<Integer> integerStream = list.stream().filter(l -> (l%2==0));
        long count = integerStream.count();
        System.out.println(count);*/
        //别人改动了代码
        //改动1111

    }
}
