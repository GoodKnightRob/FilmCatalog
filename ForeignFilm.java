
public class ForeignFilm extends Film{
	private String language;
	private String subtitleInfo;
	private String translation;
	
	public ForeignFilm(){
		super();
		language="";
		subtitleInfo="";
		translation="";
	}
	public void setLanguage(String newLanguage){
		language=newLanguage;
	}
	public void setSubtitleInfo(String newSubtitleInfo){
		subtitleInfo=newSubtitleInfo;
	}
	public void setTranslation(String newTranslation){
		translation=newTranslation;
	}
	
	public String getLanguage(){
		return language;
	}
	public String getSubtitleInfo(){
		return subtitleInfo;
	}
	public String getTranslation(){
		return translation;
	}
	
	public String toString(){
		String info= super.toString()+"\nLanguage: "+language
				+"\nSubtitle Info: "+subtitleInfo
				+"\nTranslation of Film name: "+translation;
		return info;
	}
	
}
