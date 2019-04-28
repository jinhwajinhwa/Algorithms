package UnionFind.QuickFind;

import java.util.Scanner;

public class Main extends QuickFindUF {

    public Main(int N) {
        super(N);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        QuickFindUF uf=new QuickFindUF(N);
        while (String.valueOf(N).equals(""))
        {
            int p= scan.nextInt();
            int q= scan.nextInt();
            if(!uf.connected(p,q))
            {
                uf.union(p,q);
                System.out.println(p+" "+q);
            }
        }
    }
}
