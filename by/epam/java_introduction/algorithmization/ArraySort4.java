package by.epam.java_introduction.algorithmization;

//Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an.
//Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. 
//Если ai > ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class ArraySort4 {
	
	public static void main(String[] args) {
		
		//В условии ошибка, тк сказано переставить элементы по возрастанию, хотя они a1 <= a2 <= ... <= an
		//Тогда сделаем исходную последовательность не отсортированной, иначе ничего переставлять не пришлось бы.
		
		int a[] = new int[] {17, 66, 2, 10, 66, 26, 77, 56};
		int temp;
		int count = 0;
		
		for (int i = 0; i < a.length - 1; i++) {			
			if (a[i] > a[i + 1]) {
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				count++;
				i = -1;
			}			
		}
		
		System.out.println("Количество перестановок - " + count);
		for (int i : a) {
			System.out.print("[" + i + "] ");
		}
		
	}
}