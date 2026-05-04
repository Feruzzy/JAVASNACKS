import java.util.Scanner;

public class TaskOne {

public static void main(String[] args){


Scanner input = new Scanner(System.in);



int[] g = new int[10];
for(int count = 0; count <= g.length; count++){
    System.out.println("Enter an integer: ");
    g[count] = input.nextInt();
    
    
    

System.out.println(g[count]);

}
}
}

int gVertical = 0;
for(int counter = 0; counter <= g.length; counter++){
    
    gVertical = gVertical + g[counter];
    System.out.print(gVertical);
    }

int gHorizontal = 0;
for(int counter = 0; counter <= g.length; counter++){
    
    gHorizontal = gHorizontal + g[counter];
    System.out.print(gHorizontal + " ");
    }

System.out.println();

}
}
}
