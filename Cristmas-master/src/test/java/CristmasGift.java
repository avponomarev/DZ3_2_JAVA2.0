package CristmasGift;

import Sweets.Sweets;
import Sweets.Cake;
import Sweets.Candy;
import Sweets.Chokolate;

public class CristmasGift {
    public static void main(String[] args) {

        Cake cake = new Cake("Кекс",50,200,1);
        Candy candy=new Candy("Raffaelo",100,800,2);
        Chokolate chokolate=new Chokolate("Милка",25,400,3);
        Sweets[] box = {cake,candy,chokolate};
        for (Sweets somePar : box) {
            System.out.println(somePar.toString());
        }
        int cena = cake.getPrice()+candy.getPrice()+chokolate.getPrice();
        System.out.println(" Цена подарка = " + cena);

        int ves=cake.getWes()+candy.getWes()+chokolate.getWes();
        System.out.println(" Вес подарка = "+ves);
    }
}