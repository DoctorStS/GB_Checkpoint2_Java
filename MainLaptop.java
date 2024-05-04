/*
 *
-Создать множество ноутбуков.
-Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
-Далее нужно запросить минимальные значения для указанных критериев - сохранить
параметры фильтрации можно также в Map.
-Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
условиям.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainLaptop {
    public static void main(String[] args) {
        Laptop lt1 = new Laptop(0, "ASUS", 8., 1., "Intel Core i7", "Win10", "white", 500);
        Laptop lt2 = new Laptop(1, "Acer", 12., 2., "Intel Core i7", "Win10", "red", 600);
        Laptop lt3 = new Laptop(2, "DELL", 18., 12., "AMD Ryzen 9", "Win11", "yellow", 800);
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(lt1, lt2, lt3));
        for (Laptop lpt : laptops) {
            System.out.println(lpt);
        }
    }
}
