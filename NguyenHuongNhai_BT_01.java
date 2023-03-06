package NguyenHuongNhai_BT_1234;

public class NguyenHuongNhai_BT_01 {
	public static void main(String[] args) {
	
       Scanner inp = new Scanner(System.in);
        float a,b;
        System.out.println("Nhap a : ");
        a = inp.nextfloat();
        System.out.println("nhap b : ");
        b = inp.nextfloat();

        System.out.println("Tong la " + (a+b));
        System.out.println("Hieu la " + (a-b));
        System.out.println("Tich la " + (a*b));
        System.out.println("Thuong la " + (a/b));
        System.out.println("Chia lay du" + a + " va " + b + " = " + (a%b));

        if(a>b) {
                System.out.println(a +" > " + b);
        }else{
                if(a<b)System.out.println(a + " < " + b );
        }
        if(a==b)System.out.println(a + " = " +b );



    }
}

}
