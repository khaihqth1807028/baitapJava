package controller;

import entity.Food;

import java.util.ArrayList;
import java.util.Scanner;

public class foodController extends ApplicationController {

    private ArrayList<Food> list = new ArrayList<>();

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println( "nhap ngyen vong");
        String rollNumber = scanner.nextLine();
        System.out.println("Nhập ID: ");
        String ID = scanner.nextLine();
        System.out.println("nhap ten food: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("nhap mota");
        String mota = scanner.nextLine();
        System.out.println("nhap Gia");
        String gia =scanner.nextLine();
        System.out.println("nhap ngay tao");
        String ngaytao =scanner.nextLine();
        Food foods1 = new   Food ();

        list.add(foods1);
    }

//    @Override
//    public void printGame() {
//        System.out.printf("%15s | %15s | %15s | %15s\n", "ten game"," ngay phat hanh","mo ta", "gia");
//        for (int i = 0; i < list.size(); i++) {
//            Food game = list.get(i);
//            System.out.printf("%15s | %15s | %15s | %15s\n",
//                    game.getName(),  game.getID(), game.getMota(), game.getNgaytao());
//        }
    }
}