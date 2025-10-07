package helpers;

import java.util.ArrayList;
import java.util.List;

public class String_helper {
    /**
     * Метод чтобы найти нужную подстроку в строке
     * Используем эту реализацию метода, если удобно вставить начало и конец подстроки
     *
     * @param base_string - строка в которой проводится поиск подстроки
     * @param start_searching_string - начало подстроки
     * @param end_searching_string - конец подстроки
     *
     * @return Возвращает искомую подстроку из строки, в которой проводится поиск
     */
    public static String contains_string(String base_string, String start_searching_string, String end_searching_string)
    {
        int begin_index=  base_string.indexOf(start_searching_string);
        int end_index=  base_string.indexOf(end_searching_string);

        List<Integer> begin_end = new ArrayList<>();

        begin_end.add(0,begin_index);
        begin_end.add(1,end_index+end_searching_string.length());



        return base_string.substring(begin_end.get(0),begin_end.get(1));
    }
    /**
     * Метод чтобы найти нужную подстроку в строке
     * Используем эту реализацию метода, если удобно вставлять всю искомую подстроку целиком
     *
     * @param base_string - строка, в которой проводится поиск подстроки
     * @param searching_string - искомая подстрока
     *
     * @return Возвращает искомую подстроку из строки, в которой проводится поиск

     */
    public static String contains_string(String base_string, String searching_string)
    {
        int index=  base_string.indexOf(searching_string);

        List<Integer> begin_end = new ArrayList<>();

        begin_end.add(0,index);
        begin_end.add(1,index+searching_string.length());


        return  base_string.substring(begin_end.get(0),begin_end.get(1));
    }

}
