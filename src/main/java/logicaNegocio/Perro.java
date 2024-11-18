package logicaNegocio;

public class Perro extends Animal implements Domestico
{
  private TipoHabitat habitat=TipoHabitat.TERRESTRE;

    public Perro() {
        
    }
  
   
    public String emitirSonido()
    {
        
    return "ladrido";
        
    }
    public String obtenerDieta()
    {
        
        return "Omnivoro";
        
    }
    
        
  @Override
    public String interactuarConHumano()
    {
        
        return "El perro mueve la cola y ladra de felicidad";
        
    }
        @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }
}
