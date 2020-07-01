package main.task7;

public class Main {
    public static void main(String ... args) {
        ListService listService = new ListService();
        int n = 12;
        System.out.println(listService.makeList(n).size() + " " + n);
        n = 1;
        System.out.println(listService.makeList(n).size() + " " + n);
        n = 2;
        System.out.println(listService.makeList(n).size() + " " + n);
        n = 3;
        System.out.println(listService.makeList(n).size() + " " + n);
        n = 33;
        System.out.println(listService.makeList(n).size() + " " + n);
    }
}
