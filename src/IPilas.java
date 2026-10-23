package src;
public interface IPilas<T>{
	public void pop();
	public void push(T dato);
	public T peek();
	public boolean isEmpty();
}
