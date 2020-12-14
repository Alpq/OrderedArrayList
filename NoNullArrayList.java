// Thanks to Reng Zheng for helping with Testing!!
import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList()
  {
    super();
  }
  public NoNullArrayList(int size)
  {
    super(size);
  }
  public void add(int index, T element)
  {
    if (element != null)
    {super.add(index, element);}
    else
    {throw new IllegalArgumentException();}
  }
  public boolean add(T element)
  {
    if (element == null) {throw new IllegalArgumentException();}
    return super.add(element);
  }
  public T set(int index,T element)
  {
    if (element == null) {throw new IllegalArgumentException();}
    return super.set(index, element);
  }
}
