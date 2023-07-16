
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        minHeap heap = new minHeap();
/*        for (int i = 0; i < 5; i++)
        {
            heap.add(i);
           
        }
*/        
 heap.add(11);
 heap.add(77);
 heap.add(66);
 heap.add(15);
 heap.add(21);
 heap.add(111);
 heap.add(110);
 heap.add(1);
 while (heap.getSize()>0)
    System.out.println(heap.remove());
 
  /*      for (int i = 0; i < 5;i++)
        {
            System.out.println(heap.remove());
        }
    */}
}
