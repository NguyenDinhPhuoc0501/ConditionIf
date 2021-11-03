package basic.dev;

import java.util.Scanner;

	public class MainApp {
		public static void main(String[] args) {
			//9.1 phan biet nguyen am, nguyen duong
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao so nguyen a: ");
			int a = sc.nextInt();
			if(a > 0) {
				System.out.println("a La so nguyen duong");
			}else{
				if(a == 0) {
					System.out.println("a La so khong duong khong am");
				}else{
					System.out.println("a La so nguyen am");
				}
			}
			//9.2 chia het hay khong chia het
			System.out.println("Nhap vao so nguyen n: ");
			int n = sc.nextInt();
			if (n % 3 == 0 ) {
			System.out.println("So chia het cho 3") ;
			}		
			if (n % 5 == 0) {
			System.out.println("So chia het cho 5") ;
			}
			else {
				System.out.println("Khong chia het cho 3 va 5");
			}
			//9.3 Viet chuong trinh nhap vao thang
			System.out.println("Nhap thang trong nam t = ");
			int t = sc.nextInt();
			if(t == 1 || t == 3 || t == 5 || t == 7 || t == 8 || t == 10 || t == 12)
				System.out.println("Thang co 31 ngay");
			else if( t == 4 || t == 6 || t == 9 || t == 11)
				System.out.println("Thang co 30 ngay");
			else if ( t == 2 )
				System.out.println("Thang co 28 ngay");
	        //9.4 Viet phuong trinh bat 2
	        Scanner scpt = new Scanner(System.in);
	        System.out.println("Nhap he so bac 2 d = ");
	        float d = scpt.nextFloat();
	        
	        System.out.println("Nhap he so bac 1 e = ");
	        float e = scpt.nextFloat();
	        
	        System.out.println("Nhap hang so tu do f = ");
	        float f = scpt.nextFloat();
	        // kiem tra he so
	        if(d == 0) {
	        	if(e == 0) {
	        		System.out.println("Phuong trinh vo nghiem.");
	        	}else {
	        		System.out.println("Phuong trinh co 1 nghiem:" + "x = " + (-f / e));
	        	}
	        }
	        // tinh delta
	        float delta = e*e - 4*d*f;
	        float x1;
	        float x2;
	        
	        if(delta > 0) {
	        	 x1 = (float) ((-e + Math.sqrt(delta)) / (2*d));
	             x2 = (float) ((-e - Math.sqrt(delta)) / (2*d));
	             System.out.println("Phuong trinh co 2 nghiem: " + "x1 = " + x1 + " và x2 = " + x2);
	        }else {
	        	System.out.println("Phuong trinh vo nghiem.");
	        }
	        // 9.5 Viet phuong trinh nhap 3 so r, y, u. kiem tra co phai la 3 canh cua 1 tam giac khong
	        System.out.println("Nhap r = ");
	        int r = sc.nextInt();
	        
	        System.out.println("Nhap y = ");
	        int y = sc.nextInt();
	        
	        System.out.println("Nhap u = ");
	        int u = sc.nextInt();
	        
			if ((r + y > u) || (r + y > u) || (y + u > r)) {
				System.out.println("Day la tam giac");
			} else {
				System.out.println("Day khong phai la tam giac");
			}
		}
	}