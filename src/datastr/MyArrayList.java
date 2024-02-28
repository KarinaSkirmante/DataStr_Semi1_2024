package datastr;

public class MyArrayList {

	private int[] list;
	private final int LIST_DEFAULT_SIZE = 10;
	private int size = LIST_DEFAULT_SIZE;
	private int counter = 0;
	
	//constructors
	public MyArrayList() {
		list = new int[size];
	}
	
	public MyArrayList(int inputSize) {
		if(inputSize > 0) {
			size = inputSize;
		}
		list = new int[size];
	}
	
	//isEmpty
	public boolean isEmpty() {
		//1. long if-else
		/*if(counter==0)
			return true;
		else
			return false;
		*/
		//2. short if-else
		//return (counter==0)? true : false;
		//3.
		return (counter==0);
	}
	
	//isFull
	public boolean isFull() {
		return (counter == size);
	}
	
	//howManyElements
	public int howManyElements() {
		return counter;
	}
	
	//TODO
	//1. funkcijas deklarācija
	private void resize()
	{
	//3. apreķināt newSize
		int newSize = (counter <= 100)? size * 2 : (int)(size * 1.5);
	//4. izveidot listNew ar newSize izmeru
		int[] listNew = new int[newSize];
	//5. veikt kopēsanu no veca masīva uz jauno
		for(int i = 0; i < size; i++) {
			listNew[i] = list[i];
		}
		
	//6. nomainam list refernci uz listNew
		list = listNew;
	//7. izsaukt Garbage Collector
		System.gc();
	//8. size noaminām uz newSize
		size = newSize;
	}
	
	
	//TODO
	//1. funkcijas deklarācija
	public void add(int element)
	{
		//2. pārbaude isFull - tad resize izsaukums
		if(isFull()) resize();
		//3. ieliekam jauno elemntu kā pēdējo sarakstā
		list[counter++] = element;
		//4 palielinām counter par 1
		//counter++;
	}
	
	//TODO
	//1. funkcijas deklarācija
	//2. pārbaudes
	//2.1. par indeksu, ja nav pareizs, tad izmest izņēmumu
	//2.2 pārbaude isFull - tad resize izsaukums
	
	//3. veikt pārkopēšanu, lai elementi sākot no noradīta indeksa
	//tiek pavirzīti pa labi
	
	//4. ievietojam indeksa šūnā pasu elementu
	//5. palielinām counter par 1
	

	
	
}
