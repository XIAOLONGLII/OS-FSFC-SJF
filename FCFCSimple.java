

/*Introduction: 
(Thanks for Professor.Owen let me do this again) 
Mission: This two classes will find out which one runs better, the waiting time is shorter. 
Methods(class) 1: FCFS is first come and first serve, so there is no anything switch. 
Methods (Class)2: SJF is Shortest Job First, need to compare my jobs which burst(run) time is shorter or shortest. */

/*I created three processes for this project. And its start time is 0. 
Then later find out total awaiting average time to compare to find out SJF has less waiting time then FCFS
The compare method will be the result comparison.

For the future project, I will write more different case to prove more cases that SJF is better than FCFS
*/


import java.util.Scanner;

 public class FCFCSimple {
	public static void main(String[] args){
		Scanner k= new Scanner(System.in);
		//System.out.println("How many processes: ");
		//int process=k.nextInt();
		System.out.println("Enter each process burst time: ");
		int[] burstTime=new int[3];
		int start=0;//They arrive the same time, but the order will be P1, P2,P3
		
		System.out.println("Enter process 1 burst time: ");
		int b1=k.nextInt();

		System.out.println("Enter process 2 burst time: ");
		int b2=k.nextInt();
		
		System.out.println("Enter process 3 burst time: ");
		int b3=k.nextInt();
		
		
		
		//FSFC function 
		int total1=start;
		int total2=start+b1;
		int total3=start+b1+b2;
		
		System.out.println("Process 1 total waiting time is "+ total1);
		System.out.println("Process 2 total waiting time is "+ total2);
		System.out.println("Process 3 total waiting time is "+ total3);
		
		double AverageTime = (double)(total1+total2+total3)/3 - start;
				
		System.out.println("Average Waiting Time for FCFC  "+AverageTime);
		

		
	}
	
 }
 
		




