public class ArrayStackTest
{
    public static void main(String [] args) throws StackUnderflowException
    {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}