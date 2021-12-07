import Fruting.Apple;
import Fruting.Box;
import Fruting.Fruit;
import Fruting.Orange;

import java.util.Arrays;
import java.util.List;

import static Fruting.Box.compaer;

public class Main {
    public static  void main(String[] args) {// Методы заданий 1 и 2 приветеды в кассе Main. Методы Задания 3 в классе Box.

        Fruit[] frut = new Fruit[2];
        flip(frut);


        Box<Apple> box = new Box<>();
        Box<Orange> box1 = new Box<>();


        Apple ap = new Apple();
        Orange org = new Orange();
        Orange org1 = new Orange();
        Orange org2 = new Orange();

        box.putInBox(ap);
        box1.putInBox(org);
        box1.putInBox(org1);
        box1.putInBox(org2);
        System.out.println(box1.getWeight(org));

        compaer(box,ap,box1,org);





        Box<Orange> box2 =new Box();
        box1.putInBoxAll(box2);
    }

     public  static  <T> void flip(T[] v){// Задание 1
        T c;
        for (int i = 0; i <v.length-1; i++) {
        c =  v[i];
        v[i] =  v[i+1];
        v[i+1] = c;
    }

}


public  static <T> List<T> convertArr(T[] arr){//Задание 2
        return Arrays.asList(arr);
}



}
