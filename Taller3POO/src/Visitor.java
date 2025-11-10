public interface Visitor {
	void visitar(Bug bug);
	void visitar(Feature feature);
	void visitar(Documentacion documentacion);
}
