
package domaci5;


public class KoncertnaDvorana {

    private boolean [] nizSedista;
    
    private ZaradaDvorane zaradaDvorane = new ZaradaDvorane();
    
    public KoncertnaDvorana (int kapacitetSale) throws ZaradaDvoraneException {
    
        if (kapacitetSale <= 0)
            kapacitetSale=120;
        
        nizSedista = new boolean [kapacitetSale];
        
        for (int i=0; i<kapacitetSale; i++)
            nizSedista [i] = true;
    }
    public void uvediGledaoca (int brojSedista){
        if (nizSedista[brojSedista] && brojSedista < nizSedista.length && brojSedista >=0)
            nizSedista[brojSedista] = false;
    }
    public void izracunajZaradu (){
        int polovina = (nizSedista.length) / 2;
        int suma = 0;
        for (int i=0; i<polovina; i++)
            if (!nizSedista[i])
                suma+=500;
        for (int i=polovina; i<nizSedista.length; i++){
            if (!nizSedista[i])
                suma+=250;
        }
        zaradaDvorane.postaviZaradu (suma);
    }
    public boolean proveraSedista (){
        for(int i=1; i<nizSedista.length-1; i++){
            if(nizSedista[i-1] && nizSedista[i] && nizSedista[i+1] && (i-1)/10==i/10 && i/10==(i+1)/10)
            return true;
        }
        return false;
    }
    public ZaradaDvorane dohvatiZaraduDvorane(){
        return zaradaDvorane;
    }
}
