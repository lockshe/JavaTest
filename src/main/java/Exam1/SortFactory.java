package Exam1;

public class SortFactory {

    public static MySort getStreamSort(){
        return new StreamSort();
    }

    public static MySort getOtherSort(){
        return new OtherSort();
    }
}
