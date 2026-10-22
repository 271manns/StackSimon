public class LinkedStack<T> implements StackInterface<T>
{
    private LLNode<T> log;
    private int size;
    
    public LinkedStack()
    {
        size = 0;
        log = null;
    }
    public int size()
    {
        return size;
    }
    public boolean empty()
    {
        return size == 0;
    }
    public T peek() throws StackUnderflowException
    {
        if(empty())
        {
            throw new StackUnderflowException();
        }
        return log.getInfo();
    }
    public T pop() throws StackUnderflowException
    {
        if(empty())
        {
            throw new StackUnderflowException();
        }
        T temp = log.getInfo();
        log = log.getLink();
        size--;
        return temp; 
        
     
    }
    public T push(T item)
    {
        LLNode<T> temp = new LLNode<T>(item);
        temp.setLink(log);
        log = temp; 
        size++;
        return item;
        
    }
    public void clear()
    {
        log = null;
        size = 0;
    }
    public int search(Object o)
    {
        LLNode<T> temp = log;
        for(int i = 0; i<size; i++)
        {
            if(temp.getInfo().equals(o))
            {
                return i+1; 
            }
            temp = temp.getLink();
        }
        return -1;
    }




}