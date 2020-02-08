package org.ING.Logiciel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Fonctions f = new Fonctions();
       
        System.out.println( "  1 : Generate random Table " );
        long start = System.nanoTime();
        int[] tab = f.randomTab(10);
        long end = System.nanoTime();
        
        
        System.out.println( "   " );
        System.out.println( "  2 : Display random Table " );
        f.affichertableau(tab);
        System.out.println( "  3 : Generation Time  :" + (end - start) + "ns" );
        
        
        System.out.println( "   " );
        System.out.println( "  4 : Sort random table by Insertion " );
        start = System.nanoTime();
        f.affichertableau(f.triparInsertion(tab));
        end = System.nanoTime();
        System.out.println( "  5 : Generation Time  :" + (end - start) + "ns" );
        
        
        System.out.println( "   " );
        System.out.println( "  6 : Sort random table by Selection " );
        start = System.nanoTime();
        f.affichertableau(f.triSelection(tab));
        end = System.nanoTime();
        System.out.println( "  7 : Generation Time  :" + (end - start) + "ns" );
        
        
        System.out.println( "   " );
        System.out.println( "  8 : Sort random table by Bubble " );
        start = System.nanoTime();
        f.affichertableau(f.triABulle(tab));
        end = System.nanoTime();
        System.out.println( "  9 : Generation Time  :" + (end - start) + "ns" );
        
        System.out.println( "   " );
        System.out.println( "  10 : Reverse random Table " );
        start = System.nanoTime();
        f.affichertableau(f.reverseTable(tab));
        end = System.nanoTime();
        System.out.println( "  11 : Generation Time  :" + (end - start) + "ns" );
        
        f.count();
        
    }
}
