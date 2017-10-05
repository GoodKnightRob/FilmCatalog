
public class BollywoodFilm extends ForeignFilm{
	private String [] songsArray=new String [20];
	private String secondaryLanguage;
	int numberofsongs=0;

	public BollywoodFilm(){
		secondaryLanguage="none";
		}
	public void setNumberofSongs(int numberofsongs){
		this.numberofsongs=numberofsongs;		
	}
	public void setsong(int songindex,String newsong){
		if(songindex<20){
		songsArray[songindex]=newsong;
		numberofsongs++;
		}
	}
	public void setsecondaryLanguage(String newSecondaryLanguage){
		secondaryLanguage=newSecondaryLanguage;
	}
	public String toString(){
		String songsinfo="\nSongs:\n";
		for (int i=0; i<numberofsongs; i++){
			songsinfo=songsinfo+(i+1)+")"+songsArray[i]+"\n";
		}
		String info= super.toString()+"\nSecondary Language: "+secondaryLanguage+songsinfo;
		return info;
	}
}

