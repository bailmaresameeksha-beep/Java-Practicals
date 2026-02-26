class practical_9{
	static void f1(){
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
		System.out.println("SGGSIE&T");
}

	static void f2(){
		for(int i=1; i<=25; i++){
			System.out.println("SGGSIE&T");
}
}	
	public static void main(String[] args){
		long f1_time = 0;
		long f2_time = 0;
		int no_of_times = 20;
		for(int i=0; i<no_of_times; i++){
			long st = System.currentTimeMillis();
			f1();
			long et = System.currentTimeMillis();
			f1_time = et-st;
}

		for(int i=0; i<no_of_times; i++){
			long st = System.currentTimeMillis();
			f2();
			long et = System.currentTimeMillis();
			f2_time = et-st;
}


float total_time_f1 = f1_time/no_of_times;
float total_time_f2 = f2_time/no_of_times;

System.out.println("Total Time f1: "+ total_time_f1);
System.out.println("Total Time f2: "+ total_time_f2);
}
}