package Fruting;

import java.util.ArrayList;


public class Box<T> {

private float weight;
    private ArrayList<T> list;


    public <T> Box() {
        this.list = new ArrayList<>();

    }

    public ArrayList getList() {
        return list;
    }

    public void putInBox(T v) {
        this.list.add(v);

    }


    public <T> float getWeight(Fruit t) {

        weight = this.list.size();
        return weight*t.getWeight();
    }



    public static  <T,E> boolean compaer(Box<T> e, Fruit x , Box<E> r, Fruit y){
        System.out.println(e.getWeight(x) - r.getWeight(y)>0);
        return e.getWeight(x) - r.getWeight(y)>0;
    }


    public  void putInBoxAll(Box<T> b){

        for (int i = 0; i < this.list.size(); i++) {
            b.putInBox(list.get(i));
        }




    }

}

