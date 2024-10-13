package opertors;

import java.util.Scanner;
public class Arithmetic {

				public static void main(String[] args) {
					// Arithmetic Operation
					
					Scanner sc = new Scanner(System.in);
					
					int sum;
					
					System.out.println("Enter Your First Value: ");
					int A = sc.nextInt();
					
					System.out.println("Enter Your Second Value: ");
					int B = sc.nextInt();
					
					sum=A + B;
					//sum=A - B;
					//sum=A * B;
					//sum=A / B;
					//sum=A % B;
					
					System.out.println("Total value for: " + sum);

					//Assignment Operator
					
					int sum1;
					
					System.out.println("Enter Your First Value: ");
					int C = sc.nextInt();
					
					System.out.println("Enter Your Second Value: ");
					int D = sc.nextInt();
					
					//sum1 = C+=3 + D;
					sum1 = D+=1 +C;
					
					System.out.println("Total value : " + sum1);

					//Increment or Decrement Operator
					
					int sum2;
					
					System.out.println("Enter Your First Value: ");
					int E = sc.nextInt();
					
					System.out.println("Enter Your Second Value: ");
					int F = sc.nextInt();
					
					 E++;
					 --F;
					
					sum2 = E + ++F;
					
					System.out.println("E Value For : " + E );
					System.out.println("F value For : " + F );
					System.out.println("E and F Value  : " + sum2);


					
					
				}

			}

