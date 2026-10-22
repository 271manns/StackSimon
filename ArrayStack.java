public class ArrayStack<T> implements StackInterface<T>
{
    private int size;
    private T[] log;

    public ArrayStack()
    {
        log = (T[]) new Object[4];
        size = 0;

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
           return log[size-1]; 
        }
    }
    public T pop() throws StackUnderflowException
    {
        if(empty())
        {
            throw new StackUnderflowException();
        }
        else
        {
            T temp = log[size-1];
            log[size-1] = null;
            size--;
            return temp;
            
        }
    }
    public T push(T item)
    {
        if(size == log.length)
        {
            T[] newLog = (T[])new Object[log.length * 2];
            for(int i = 0; i < log.length; i++)
            {
                newLog[i] = log[i];
            }
            newLog[size] = item;
            log = newLog;
            size++;
            return item;
        }
        else
        {
            log[size] = item;
            size++;
            return item;
        }
    }
    public void clear()
    {
        for(int i = 0; i<size; i++)
        {
            log[i] = null;
        }
        size = 0;
    }
    public int search(Object o)
    {
        for(int i = size-1; i>=0; i--)
        {
            if(log[i].equals(o))
            {
                return size - i;
            }
        }
        return -1;
    }




}