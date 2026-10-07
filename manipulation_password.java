import java.util.ArrayList;
import java.util.Scanner;

public class manipulation_password {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        ArrayList<String> ARR = new ArrayList<>();
 
        
        ARR.add("CDOO1");
        ARR.add("AKRA2");
        ARR.add("DUDJ3");
        ARR.add("GHJU4");
        System.out.println(ARR);
        
        System.out.print("DIGITE O CODIGO A VER:_ ");
        String cd_ver = sc.nextLine();
        sc.nextLine();
        
        if(cd_ver.equals("CD001")) {
        	System.out.print("NOVA SENHA:_ ");
            String nv_senha = sc.nextLine();
            ARR.add(0, nv_senha);
            ARR.remove("CDOO1");
        }
       else if(cd_ver.equals("AKRA2")) {
        	System.out.print("NOVA SENHA:_ ");
            String nv_senha1 = sc.nextLine();
            ARR.add(1, nv_senha1);
            ARR.remove("AKRA2");
        }
       else if(cd_ver.equals("DUDJ3")) {
        	System.out.print("NOVA SENHA:_ ");
            String nv_senha2 = sc.nextLine();
            ARR.add(2, nv_senha2);
            ARR.remove("DUDJ3");
        }
       else if(cd_ver.equals("GHJU4")) {
        	System.out.print("NOVA SENHA:_ ");
            String nv_senha3 = sc.nextLine();
            ARR.add(3, nv_senha3);
            ARR.remove("GHJU4");
        }
        
        else {
        	System.out.println("por favor verifique com seu adm os dados corretos ! ");
        }
      
        
        System.out.println("================================");
        System.out.println("        RELATORIO FINAL         ");
        System.out.println("================================");
        System.out.println(ARR);
    }
}