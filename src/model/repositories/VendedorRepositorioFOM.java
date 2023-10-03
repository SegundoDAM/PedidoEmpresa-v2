package model.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Ruta;
import model.data.Vendedor;
import objectMother.VendedorOM;

public class VendedorRepositorioFOM implements VendedorRepositorio {
	List<Vendedor> vendedores=new VendedorOM().getVendedores();

	public List<Vendedor> findByRoutes(Ruta... rutas) {
		ArrayList<Vendedor> vendedoresResult = new ArrayList<Vendedor>();
		Arrays.asList(rutas).stream().forEach((ruta) -> {
			vendedoresResult.addAll(vendedores.stream().filter((vendedor) -> {
				return vendedor.rutaEquals(ruta);
			}).collect(Collectors.toList()));
		});
		return vendedoresResult;
	}

	public List<Vendedor> findByRoutesDos(Ruta... rutas) {
		return vendedores.stream().filter((vendedor) -> {
				return Arrays.asList(rutas).stream()
						.anyMatch((ruta)->{return vendedor.rutaEquals(ruta);});
			})
			.collect(Collectors.toList());
	}

	public Optional<Vendedor> findById(String idVendedor) {
		// TODO Auto-generated method stub
		return null;
	}

}
