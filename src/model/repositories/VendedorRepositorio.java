package model.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.data.Ruta;
import model.data.Vendedor;

public class VendedorRepositorio {
	List<Vendedor> vendedores;

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
				return Arrays.asList(rutas).stream()...;
			})
			.collect(Collectors.toList());
		});
	}

}
