// Thanks to Reng Zheng for helping with Testing!!
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int size){
    super(size);
  }
  public boolean add (T element){
    if (element == null) {throw new IllegalArgumentException();}
    super.add(element);
    int sorte = 0;
    boolean notit = true;
    while (notit)
    {
      notit = element.compareTo(this.get(sorte)) > 0;
      if (notit) {sorte ++;}
    }
     super.add(sorte, element);
     super.remove(this.size() - 1);
     return true;
  }
  public void add (int index, T element){
    if (element == null) {throw new IllegalArgumentException();}
    this.add(element);
  }
  public T set(int index, T element){
    if (element == null) {throw new IllegalArgumentException();}
    T thing = this.get(index);
    this.remove(index);
    this.add(index, element);
    return thing;
  }
}
