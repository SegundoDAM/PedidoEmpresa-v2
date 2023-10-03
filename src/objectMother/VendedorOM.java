package objectMother;

import java.util.ArrayList;
import java.util.List;

import model.data.Ruta;
import model.data.Vendedor;

public class VendedorOM {
	public List<Vendedor> getVendedores(){
		Ruta[] rutas= {Ruta.central,Ruta.norte,Ruta.sur,Ruta.periferia};
		String[] idStrings= {"1","2","3","4"};
		String[] nombres= {"juan", "pedro","jaime","arturo"};
		ArrayList<Vendedor> vendedores=new ArrayList();
		for (int i = 0; i < nombres.length; i++) {
			vendedores.add(new Vendedor(idStrings[i],nombres[i],rutas[i]));
		}
		return vendedores;
	}
}
