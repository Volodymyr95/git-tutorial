public class Main {

    public static void main(String[] args) {

        //new Menu().run();

        char[] charArray = "АБВЯ".toCharArray();

        for (char c : charArray) {
            System.out.println( (char)(c + 3) );
            // АБВЯ АБВЯ ==>(зсув на 3) ==> ГДЕв  ГДЕв
            // ГДЕв ГДЕв ==> АБВЯ АБВЯ
            // 3 зсуви - це також 2 пробіли замість одного
        }
    }
}
