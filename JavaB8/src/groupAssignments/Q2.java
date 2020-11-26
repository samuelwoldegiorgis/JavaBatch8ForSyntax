package groupAssignments;

public class Q2 {

	public static void main(String[] args) {
		int num = 145;
        boolean flag = false;
        
        if(num>1) {
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        }else {
        	flag=true;}
        
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
	}

	}


