//Type casting
//two type
//1). Widening Typecasting    byte -> short -> char -> int -> long -> float -> double
//2).Narrow Typecasting       double -> float -> long -> int -> char -> short -> byte

//Widening casting
//public class Typecasting {
//    public static void main(String[] args) {
//        int num=21;
//        double numd= num;
//        System.out.println(num);
//        System.out.println(numd);
//    }
//}

// Narrow Typecasting


public class Typecasting {
    public static void main(String[] args) {
        double num=21;
        byte numi = (byte) num;
        System.out.println(num);
        System.out.println(numi);


    }
}
