class Array{
	public static void main(String[] args){
	int z=0;
	
	int arr[]=new int[args.length];
	for(int i=0;i<arr.length;i++){
		arr[i]=Integer.parseInt(args[i]);
	}	

	for(int i=0;i<5;i++){
		System.out.println(arr[i]);
	}

	
	for(int i=0;i<args.length-1;i++){
		for(int j=0;j<args.length-1-i;j++){
		if(arr[j]>arr[j+1]){
		z=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=z;
		}
		}	
	}
	System.out.println("Sorted Array");
	
	for(int i=0;i<args.length-1;i++){
		System.out.println(arr[i]);
	}


}
}

	
	
	