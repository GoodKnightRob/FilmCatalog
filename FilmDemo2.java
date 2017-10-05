import java.util.Scanner;
import java.util.Arrays;
public class FilmDemo2 {

	public static void main(String[] args) {
		Scanner keyboard =new Scanner(System.in);
		Film [] FilmsArray = new Film[10];
		int filmtracker=0, option;
		do{
			System.out.println("number of films entered: "+filmtracker);
			printOptions();
			option= keyboard.nextInt();
				if (option==1){
					Film newFilm=new Film();
					enterInformation(newFilm);
					if(filmtracker<10){
						boolean duplicate = false;
						for (int i=0; i<filmtracker; i++){
							if (newFilm.equals(FilmsArray[i])){
								System.out.println("Duplicate Film");
								duplicate=true;
							}
						}
						if (duplicate==false){
							FilmsArray[filmtracker]=newFilm;
							filmtracker++;
						}
						}
					}
				else if (option==2){
					ForeignFilm newForeignFilm = new ForeignFilm ();
					enterInformation(newForeignFilm);
					if(filmtracker<10){
						boolean duplicate = false;
						for (int i=0; i<filmtracker; i++){
							if (newForeignFilm.equals(FilmsArray[i])){
								System.out.println("Duplicate Film");
								duplicate=true;
							}
						}
						if (duplicate==false){
						FilmsArray[filmtracker]=newForeignFilm;
						filmtracker++;
						}
					}
				}
				else if (option==3){
					BollywoodFilm newBollywoodFilm = new BollywoodFilm();
					enterInformation(newBollywoodFilm);
					if(filmtracker<10){
						boolean duplicate = false;
						for (int i=0; i<filmtracker; i++){
							if (newBollywoodFilm.equals(FilmsArray[i])){
								System.out.println("Duplicate Film");
								duplicate=true;
							}
						}
						if (duplicate==false){
						FilmsArray[filmtracker]=newBollywoodFilm;
						filmtracker++;
						}
					}
				
				}
				else if (option== 4){
					if(FilmsArray!=null){
						for (int x=0; x<filmtracker; x++){
							String info= FilmsArray[x].toString();
						System.out.println(info+"\n");
						}
					}
					else
						System.out.println("no Films entered");
					
			}
				else if (option==5){
					System.out.println("Sorting by Year");
					Film [] comparableArray = new Film[filmtracker];
					if(FilmsArray!=null){
						for (int x=0; x<filmtracker; x++){
							comparableArray[x]=FilmsArray[x];
						}
					}
					Arrays.sort(comparableArray);
					for(int index = 0; index < filmtracker; index++) {
						System.out.println(comparableArray[index].getYOR()+" "+comparableArray[index].getName());
					}
				}
				else if (option==6)
					System.out.println("Goodbye");
				else
					System.out.println("invalid input");
		}while (option!=6);
	}
	public static void printOptions(){
			System.out.println("Press 1 to add a Film");
			System.out.println("Press 2 to add a Foreign Film");
			System.out.println("Press 3 to add a BollyWoodFilm");
			System.out.println("Press 4 to view Films information");
			System.out.println("Press 5 to sort films by date");
			System.out.println("Press 6 to exit");
	}
	public static void enterInformation(Film newFilm){
		if (newFilm !=null){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the name of the film:");
			String name= keyboard.nextLine();
			newFilm.setName(name);
			System.out.println("Enter the name of the director: ");
			String director=keyboard.nextLine();
			newFilm.setDirector(director);
			System.out.println("Enter the Year of release: ");
			int Yearofrelease=keyboard.nextInt();
			newFilm.setYOR(Yearofrelease);
			keyboard.nextLine();
			if (newFilm instanceof ForeignFilm ){
					ForeignFilm newForeignFilm = (ForeignFilm)newFilm;
					System.out.println("Enter the language the film is in: ");
					String newLanguage= keyboard.nextLine();
					newForeignFilm.setLanguage(newLanguage);
					System.out.println("Enter the subtitle information:");
					String newsubtitleinfo=keyboard.nextLine();
					newForeignFilm.setSubtitleInfo(newsubtitleinfo);
					System.out.println("Enter the translation of the film name: ");
					String newtranslation=keyboard.nextLine();
					newForeignFilm.setTranslation(newtranslation);
			}
			if (newFilm instanceof BollywoodFilm ){
					BollywoodFilm newBollywoodFilm = (BollywoodFilm)newFilm;
					System.out.println("Enter secondary Language of the film: ");
					String newSecondaryLanguage = keyboard.nextLine();
					newBollywoodFilm.setsecondaryLanguage(newSecondaryLanguage);
					int songoption;
					int songticker=0;
					do{
						System.out.println("would you like to enter the name of a song? 1-yes 0-no");
						songoption=keyboard.nextInt();
						if (songoption==1){
						keyboard.nextLine();
						System.out.println("Song name: ");
						String newsongname=keyboard.nextLine();
						newBollywoodFilm.setsong(songticker, newsongname);
						songticker++;
						}
						else if(songoption==0){
						System.out.println("End of songs");
						}
						if (songoption==20 )
							System.out.println("you can only enter up to 20 songs");
					}while(songoption!=0 || songticker ==20);	
			}
		}
	}
}
