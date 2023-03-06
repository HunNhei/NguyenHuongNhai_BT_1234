package NguyenHuongNhai_BT_1234;

public class NguyenHuongNhai_BT_02 {
	public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        n = sc.nextInt();

        if(n%2 == 0){
            System.out.format("%d la so chan", n);
        }
        else{
            System.out.format("%d la so le", n);
        }
    }
}

