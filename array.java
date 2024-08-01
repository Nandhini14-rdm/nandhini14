// inserting element in array

class ArrayTest {
	
	public static void insert(char[] ar, int pos, char val){
		for(int i=ar.length-1;i>=pos;i--){
		    //Moving each element one position to its right
			ar[i]=ar[i-1];
		}
		//Inserting the data at the specified position
		ar[pos-1]=val;
	}
}
class Tester{

	public static void main(String args[]){
		char arr[]=new char[6];
		arr[0]='A';
		arr[1]='B';
		arr[2]='C';
		arr[3]='D';
		arr[4]='E';
		
		//Make changes and try to insert elements at different positions
		ArrayTest.insert(arr, 3, 'J');
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}


// Deleting in an array

class ArrayTest {

	public static void delete(char[] ar, int pos){
	    //Traversing the array from the position where the element has to be deleted to the end
		for(int i=pos-1;i<ar.length-1;i++){
		    //Moving each element one position to the left
			ar[i]=ar[i+1];
		}
		
		//The space that is left at the end is filled with character '0'
		ar[ar.length-1]='0';
	}
}

class Tester{
	public static void main(String args[]){
		char arr[]=new char[6];
		arr[0]='A';
		arr[1]='B';
		arr[2]='J';
		arr[3]='C';
		arr[4]='D';
		arr[5]='E';
		
		//Make changes and try to delete elements from different positions
		ArrayTest.delete(arr, 3);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}


//Some of the limitations are:
// An array can contain data of only similar type. Heterogeneous elements cannot be stored in an array.
// Array is of fixed size. Once declared, the size cannot be changed. 
// You have seen the insertion and deletion operations in an array. Those operations are expensive in terms of memory as they require shifting of elements. 
// This shifting may also sometime lead to loss of data if we try to exceed the capacity of the array.
// The elements of an array are stored in continuous memory locations. If the required number of blocks are not present together in the memory, then the array will not be created. 
