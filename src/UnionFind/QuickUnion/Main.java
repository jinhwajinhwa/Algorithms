package UnionFind.QuickUnion;

import java.util.Scanner;

public class Main extends QuickUnionUF {

    public Main(int N) {
        super(N);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        QuickUnionUF uf=new QuickUnionUF(N);
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
