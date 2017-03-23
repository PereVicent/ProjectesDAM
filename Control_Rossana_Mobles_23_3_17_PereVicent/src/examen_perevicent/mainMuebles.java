package examen_perevicent;
import java.util.*;
import java.text.*;
public class mainMuebles {

	//OPCIÓ 1
	public static void mobleMesAlt(){
		int pos=-1;
		double max=0;
		Iterator<Moble> it=llistaGeneralMobles.iterator();
		for(int i=0;it.hasNext();i++){
			Moble moble=it.next();
			if(moble.getDimensions()[2]>max){
				max=moble.getDimensions()[2];
				pos=i;
			}//tanque if
		}//tanque for
		if (pos!=-1){
			System.out.println("El moble més alt és :"+llistaGeneralMobles.get(pos).toString());
		}
		else System.out.println("la llista és buida");
	}
	//OPCIÓ 2
	public static void imprimirCataleg(){
		System.out.println("El nombre total de mobles és: "+llistaGeneralMobles.size());
		Iterator<Moble> it=llistaGeneralMobles.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	//OPCIÓ 3
	public static void imprimirTipus(String tipus){
		int pos=-1;
		Iterator<Moble> it=llistaGeneralMobles.iterator();
		for(int i=0;it.hasNext();i++){
			Moble moble=it.next();
			if(moble.getTipusFusta().equalsIgnoreCase(tipus)){
				pos=i;
				System.out.println(moble.toString());
			}//tanque if
		}//tanque for
		if(pos==-1) System.out.println("No hi ha cap moble de fusta del tipus "+tipus);
	}
	//OPCIÓ 4
	public static void incrementarPreuTipus(String tipus,double perc){
		int pos=-1;
		Iterator<Moble> it=llistaGeneralMobles.iterator();
		for(int i=0;it.hasNext();i++){
			Moble moble=it.next();
			if(moble.getTipusFusta().equalsIgnoreCase(tipus)){
				pos=i;
				moble.setPreu(moble.getPreu()*perc);
				System.out.println("S'ha variat el preu del següent moble:");
				System.out.println(moble.toString());
			}//tanque if
		}//tanque for
		if(pos==-1) System.out.println("No hi ha cap moble de fusta del tipus "+tipus);
	}
	//OPCIÓ 5
	public static void moblesBarats(){
		Iterator<Moble> it=llistaGeneralMobles.iterator();
		for(int i=0;it.hasNext();i++){
			Moble moble=it.next();
			if(moble.getPreu()<500){
				llistaMoblesBarats.add(moble);
			}//tanque if
		}//tanque for
		if(llistaMoblesBarats.size()!=0){
			System.out.println("=========Els següents mobles s'han afegit a la llista de mobles barats:=======");
			Iterator<Moble> iter=llistaMoblesBarats.iterator();
			while(iter.hasNext()){
				System.out.println(iter.next());
			}//tanque while
		}//tanque if
	}
	public static ArrayList<Moble> llistaMoblesBarats=new ArrayList<Moble>();
	public static ArrayList<Moble> llistaGeneralMobles=new ArrayList<Moble>();
	public static Scanner lector=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Creando todos los muebles ....");
		
			Moble m1=new Moble("taula",900,1.6,0.8,0.90,"roure");
			Moble m2=new Moble("sofà",1200,2.9,0.9,1,"castany");
			Moble m3=new Moble("aparador",1500,3.2,0.45,1.90,"pi");
			Moble m4=new Moble("tauleta",80,0.8,0.35,0.5,"roure");
			Moble m5=new Moble("rinconera",120,0.5,0.45,1,"roure");
			Moble m6=new Moble("moble bany",150,0.5,0.45,1,"castany");
			Moble m7=new Moble("estanteria",160,1.2,0.3,0.1,"pi");
			Moble m8=new Moble("xifonier",225,0.6,0.45,1.2,"pi");
		
		   System.out.println("Almacenando muebles en la lista ....");
		llistaGeneralMobles.add(m1);
		llistaGeneralMobles.add(m2);
		llistaGeneralMobles.add(m3);
		llistaGeneralMobles.add(m4);
		llistaGeneralMobles.add(m5);
		llistaGeneralMobles.add(m6);
		llistaGeneralMobles.add(m7);
		llistaGeneralMobles.add(m8);
		
		
		
		int option=0;
		
		do{
			System.out.println();
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("====================");
			System.out.println("1.-Imprimir mueble más alto");
			System.out.println("2.-Imprimir todos los muebles");
			System.out.println("3.-Imprimir muebles  de un tipo de madera");
			System.out.println("4.-Incrementar precios a tipo madera");
			System.out.println("5.-Crear lista nueva muebles baratos ");
			System.out.println("0.-Eixir de l'aplicació.");
			
			
			System.out.print("Inserta una opció vàlida: ");
			option=lector.nextInt();
			lector.nextLine();
			System.out.println("");
			switch(option){
			case 1:
				mobleMesAlt();
				break;
			case 2:			
				imprimirCataleg();
				break;
			case 3:			
				System.out.println("De quina fusta vols el llistat (roure/castany/pi");
				 	String tipus=lector.nextLine();
				 	imprimirTipus(tipus);
				break;
			case 4:			
				System.out.println("Dis-me en quin percentatge vols incrementar els preus:");
				 	double perc=lector.nextDouble();
				 	lector.nextLine();
				 	double percentatge=((perc/100)+1);
			 	System.out.println("Dis-me a quin tipus de fusta vols aplicar-lo:");
			 		tipus=lector.nextLine();
		 		incrementarPreuTipus(tipus,percentatge);
				break;
			case 5:			
				moblesBarats();
				break;
			case 0:
				System.out.println("Aplicació finalitzada.");
				break;
			default:
				break;
			}
			
		}while (option!=0);
			
	}

}
