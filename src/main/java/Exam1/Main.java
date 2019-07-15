package Exam1;

public class Main {

    public static void main(String[] args) {
        MySort sort=SortFactory.getStreamSort();
        sort.sort();
    }
}
