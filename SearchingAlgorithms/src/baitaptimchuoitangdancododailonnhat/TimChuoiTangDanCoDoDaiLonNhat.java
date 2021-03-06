package baitaptimchuoitangdancododailonnhat;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiTangDanCoDoDaiLonNhat {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        //Find the maxium increasingly ordered subsequence
        for (int i =0; i < string.length();i++)
        {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j= i + 1; j < string.length(); j++){
                if (string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch: max){
            System.out.println(ch);
        }
        System.out.println();
    }
}
