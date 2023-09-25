package objectMother;

import java.util.List;

import model.data.Articulo;

public class ArticulosOM {

	public List<Articulo> getArticulos(){
		return List.of(
				new Articulo(1, "Tornillo", 23f),
				new Articulo(1, "Tornillo", 23f),
				new Articulo(1, "Tornillo", 23f),
				new Articulo(1, "Tornillo", 23f),
				new Articulo(1, "Tornillo", 23f),
				new Articulo(1, "Tornillo", 23f),
				new Articulo(1, "Tornillo", 23f),
				new Articulo(1, "Tornillo", 23f)
				);
		
	}
}
