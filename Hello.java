public class Hello {

    public static void main(String args[]) {
        try {
            int ketqua = add(0, 3);
        } catch (InvalidParamException e) {
            System.out.println("tao bat duoc loi cua may roi nha , ket qua la 0");
            return;
        }
        System.out.println("hello world");

    }

    static int add(int a, int b) {
        if (a == 0) {
            throw new InvalidParamException("khong co phep gia tri 0");
        }
        return a + b;
    }
}