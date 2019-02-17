package Sweets;

public class Candy extends Sweets {

    private int  unicIdentifiCandy;

    public Candy (String Name, int Wes, int Price, int unicIdentifiCandy)
    {
        super(Name,Wes,Price);
        this.unicIdentifiCandy=unicIdentifiCandy;
    }

    public void setUnicIdentifiCandy(int unicIdentifiCandy)
    {
        this.unicIdentifiCandy=unicIdentifiCandy;
    }
    public int getUnicIdentifiCandy()
    {
        return unicIdentifiCandy;
    }
    @Override
    public String toString()
    {
        return "Конфеты  [ " +super.toString()+"; Уникальный номер = "+unicIdentifiCandy+" ] ";

    }

}
