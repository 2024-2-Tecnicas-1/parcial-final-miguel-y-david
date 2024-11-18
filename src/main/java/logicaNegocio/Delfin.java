package logicaNegocio;

public class Delfin extends Animal 
{
    private TipoHabitat habitat=TipoHabitat.ACUATICO;
      
    
    public Delfin() {
        
    }
    @Override
    public String emitirSonido()
    {
        
        return "Chirrido";
        
    }
    
    @Override
    public String obtenerDieta()
    {
        
        return "Pescado";
        
    }

    @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }
     


    
}
