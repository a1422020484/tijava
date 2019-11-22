package tjjava.fifteen;

public class Hourly implements Payable<Hourly>{

}

interface Payable<T> {
}

class Employee implements Payable<Employee> {

}

//The interface Payable cannot be implemented more than once with different arguments: 
//Payable<Employee> and Payable<Ourll>
//class Ourll extends Employee implements Payable<Ourll>{
//	
//}