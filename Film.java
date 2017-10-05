
public class Film implements Comparable{
 private String name;
 private String director;
 private int yearofrelease;
 
 public Film(){
	 name="";
	 director="";
	 yearofrelease = 0;
 }
 public void setName(String newname){
	 name=newname;
	 }
 public void setDirector(String newDirector){ 
	 director=newDirector;
	 }
 public void setYOR(int newyor){
	 if (newyor>=1)
	 yearofrelease=newyor;
	 }
 public String getName(){
	 return name;
	 }
 public String getDirector(){
	 return director;
	 }
 public int getYOR(){
	 return yearofrelease;
	 }
 public String toString(){
	 String info="Name: "+name+"\nDirector: "+director+"\nYear of Release: "+yearofrelease;
	 return info;
	 }
 public boolean equals(Object OtherO){
	 boolean isEqual = false;
	 if (OtherO !=null && OtherO instanceof Film){
		 Film OtherF = (Film)OtherO;
		 if (this.name == (OtherF.name)){
			 isEqual=true;
		 }
	 }
	 return isEqual;
 }
 public int compareTo(Object otherO) {
		int value = -1;
		if(otherO != null && otherO instanceof Film) {// change Song to Film
			Film otherFilm = (Film)otherO;
			if(this.yearofrelease < otherFilm.yearofrelease)
				value = -1;
			else if(this.yearofrelease > otherFilm.yearofrelease)
				value = 1;
			else
				value = 0;
		}
		return value;
	}
}
