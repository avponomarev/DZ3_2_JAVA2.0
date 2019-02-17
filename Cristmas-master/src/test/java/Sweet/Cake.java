package Sweets;


public class Cake extends Sweets {

    private int  unicIdentifiCake;

    public Cake (String Name, int Wes, int Price, int unicIdentifiCake)
    {
        super(Name,Wes,Price);
        this.unicIdentifiCake=unicIdentifiCake;
    }

    public void setUnicIdentifiCake(int unicIdentifiCake)
    {
        this.unicIdentifiCake=unicIdentifiCake;
    }
    public int getUnicIdentifiCake()
    {
        return unicIdentifiCake;
    }
    @Override
    public String toString()
    {
        return "Кексы  [ " +super.toString()+"; Уникальный номер = "+unicIdentifiCake+" ] ";

    }

}