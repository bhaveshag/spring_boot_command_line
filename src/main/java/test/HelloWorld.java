/**
 * 
 */
package test;

import org.springframework.stereotype.Service;

/**
 * @author bhavesh
 *
 */
@Service("helloWorld")
public class HelloWorld{
	public void print(String... args){
		System.out.println("Hello !!!");
		
		if(args.length == 0)
			System.out.println("No arguments entered. Exiting application.");
		for(int i=0;i<args.length;i++){
			System.out.println("Argument["+i+"]: "+args[i]);
		}
		
		System.out.println("Good luck !!!!");
	}
}
