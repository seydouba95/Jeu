import java.util.Scanner;
public class Jeu{

      public static void main(String[]args){
	   Scanner clavier= new Scanner(System.in);
	   int nombre_secret,nombre_user;
	     nombre_secret= (int) (Math.random () * 999) + 1;
		 
		 do{
		            System.out.println("entrer un nombre(1-1000):");
		             nombre_user=clavier.nextInt();
				 if(nombre_user==nombre_secret)
				{ 
					System.out.println("FELICITATION !!!!");
				}
				else if(nombre_user>nombre_secret)
				{
				   System.out.println("votre nombre est trop grand !");
				}
				else
				{
				   System.out.println("votre nombre est trop petit !");
				}
						   
						 
		   }while(nombre_user != nombre_secret);
		 
	  
	  }
}















