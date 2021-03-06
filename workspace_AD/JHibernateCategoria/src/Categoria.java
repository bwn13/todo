

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table( name = "Categoria" )
public class Categoria {
	
	
	private String Nombre;
    private int Id;

	public Categoria(String nombre, int id) {
		// for application use, to create new events
		this.Nombre = nombre;
		this.Id = id;
	}

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
    
	   private void setId(int Id) {
		this.Id = Id;
       }
	   private String getNombre() {
			return Nombre;
		}

		private void setNombre(String nombre) {
			Nombre = nombre;
		}

		private int getId() {
			return Id;
		}

		
		public Categoria() {
			// this form used by Hibernate
		}
	
}