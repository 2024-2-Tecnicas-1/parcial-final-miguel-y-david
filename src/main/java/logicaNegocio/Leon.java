package logicaNegocio;

public class Leon extends Animal 
{
    private TipoHabitat habitat=TipoHabitat.TERRESTRE;
    public Leon() {
        
    }
    
    public String emitirSonido()
    {
        
        return "rugido";
        
    }
    public String obtenerDieta()
    {
        
        return "Carnivoro";
        
    }
        @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }
    
    
}
