package com.company;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        /*for (int i=0 ;i<listInteger.getSize();i++){
            System.out.println(listInteger.get(i));
        }*/

        System.out.println("phan tu 1:"+listInteger.get(0));
        System.out.println("phan tu 2:"+listInteger.get(1));
        System.out.println("phan tu 3:"+listInteger.get(2));
        System.out.println("phan tu 4:"+listInteger.get(3));

    }

}
