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
        else
        {
            return log.getLink().getInfo();
        }
    }
    public T pop() throws StackUnderflowException
    {
        if(empty())
        {
            throw new StackUnderflowException();
        }
        else if(size == 1)
        {
            T temp = log.getLink().getInfo();
            size--;
            log = null;
            return temp;
            
        }
        else
        {
            T temp = log.getLink().getInfo();
            log.setLink(log.getLink().getLink());
            size--;
            return temp;

        }
    }
    public T push(T item)
    {
        LLNode<T> temp = new LLNode<T>(item);
        log.setLink(temp);
        size++;
        return item;
    }
    public void clear()
    {
        log.setLink(null);
        size = 0;
    }
    public int search(Object o)
    {
        LLNode<T> temp = log;
        for(int i = 0; i<size; i++)
        {
            if(temp.getInfo().equals(o))
            {
                return i; 
            }
            temp = temp.getLink();
        }
        return -1;
    }




}