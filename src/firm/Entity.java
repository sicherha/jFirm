package firm;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

import firm.bindings.binding_typerep;

public class Entity {
	
	protected final static binding_typerep binding = (binding_typerep) Native.loadLibrary("firm", binding_typerep.class); 
	
	protected final Pointer ptr;
	
	protected Entity(Pointer ptr) {
		this.ptr = ptr;
	}
	
	public Entity(Type owner, Ident name, Type type) {
		this(binding.new_entity(owner.ptr, name.ptr, type.ptr));
	}
	
	public void free() {
		binding.free_entity(ptr);
	}
}
