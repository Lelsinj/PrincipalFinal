//Leonardo Pereira Jorge RA: 2503689
import java.util.ArrayList;
import java.util.List;

public class ComandosMenu {
    private List<Apartamento> apartamentoList;
    private List<Casa> casaList;
    private List<Inquilino> inquilinoList;
    private List<Corretor> corretorList;  
    private static ComandosMenu instanciaComandos;
    
    private ComandosMenu(){
        apartamentoList = new ArrayList<Apartamento>();
        casaList = new ArrayList<Casa>();
        inquilinoList = new ArrayList<Inquilino>();
        corretorList = new ArrayList<Corretor>();
    }
    
    public List<Apartamento> getBdApartamentos(){
            return apartamentoList;
    }
    
    public List<Casa> getBdCasas(){
            return casaList;
    }
    
    public List<Corretor> getBdCorretores(){
            return corretorList;
    }
    
    public static ComandosMenu getInstanciaComandos() {
        if (instanciaComandos == null) {
            instanciaComandos = new ComandosMenu();
        }
        return instanciaComandos;
    }
    
    public void registrarCasa(Casa novaCasa){ //REGISTRAR NOVA CASA
        casaList.add(novaCasa);
    }
    
    public void registrarApartamento(Apartamento novoApartamento){ //REGISTRAR NOVO APARTAMENTO
        apartamentoList.add(novoApartamento);
    }
    
    public void registrarCorretor(Corretor novoCorretor){//REGISTRAR NOVO CORRETOR
        corretorList.add(novoCorretor);
    }
    
    public void registrarInquilino(Inquilino novoInquilino){ //REGISTRAR NOVO INQUILINO
        inquilinoList.add(novoInquilino);
    }
    
    public Apartamento exApartamentoIPTU(Apartamento apartamento){
                Apartamento apartamento1 = (Apartamento) consultaApartamento(apartamento);
            	if(apartamento1 != null){
                    apartamentoList.remove(apartamento1);
                    return null;
		}
		else{
                    return apartamento;
		}
		
    }
    
    public Apartamento consultaApartamento(Apartamento apartamento){
		for(int i = 0; i < apartamentoList.size(); i++){
			if(apartamento.getIPTU().equals(apartamentoList.get(i).getIPTU())){
				return apartamentoList.get(i);
			}
		}
		return null;
	}
    
    public Casa exCasaIPTU(Casa casa){
                Casa casa1 = (Casa) consultaCasa(casa);
            	if(casa1 != null){
                    casaList.remove(casa1);
                    return null;
		}
		else{
                    return casa;
		}
		
    }
    
    public Casa consultaCasa(Casa casa){
		for(int i = 0; i < casaList.size(); i++){
			if(casa.getIPTU().equals(casaList.get(i).getIPTU())){
				return casaList.get(i);
			}
		}
		return null;
	}
    
    public Corretor exCorretorCRECI(Corretor corretor){
                Corretor corretor1 = (Corretor) consultaCorretor(corretor);
            	if(corretor1 != null){
                    corretorList.remove(corretor1);
                    return null;
		}
		else{
                    return corretor;
		}
		
    }
    
    public Corretor consultaCorretor(Corretor corretor){
		for(int i = 0; i < corretorList.size(); i++){
			if(corretor.getCRECI().equals(corretorList.get(i).getCRECI())){
				return corretorList.get(i);
			}
		}
		return null;
	}
}

