/*
 * WIP XI Computer Programing 
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {

    public static void main(String[] args) {
        int item = 0;
        int limit = 10;
        

            Scanner sc = new Scanner(System.in);
            System.out.println("input ma jaa :");
            int additem= sc.nextInt();

            if (item <= limit) {
                item =+ additem;
                System.out.println(" item = " + additem);
            } else {
                System.out.println("");
                
            }
            {
                System.out.println(" ไอเท็มเต็มแล้ว ");

            }
        }
    }
}
