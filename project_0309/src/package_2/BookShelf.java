package package_2;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title); // 책을 추가할 것이므로 add
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // 꺼내는 것인데 맨처음(0) 부터
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
