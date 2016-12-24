
public abstract class Pokemon implements Fightable {

	private String nickName;
	private PokemonType type;
	private int cp;
	
	@Override
	public abstract void attack();

	public Pokemon(String nilcName,PokemonType type,int cp){
		this.nickName=nickName;
		this.type=type;
		this.cp=cp;
	}
	
	public void setNickName (String nickName){
		this.nickName = nickName;
	}
	
	public String getnNickName(){
		return nickName;
	}
	
	public int getCp(){
		return cp;
	}
	
	public PokemonType getType(){
		return type;
	}
	
	public void setCp(int cp){
		this.cp = cp;
	}
}
