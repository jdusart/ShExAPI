package io.shex.validation;

import java.io.File;

import org.apache.commons.rdf.api.IRI;
import org.apache.commons.rdf.api.RDF;

public interface ShExParser {
	public ShExSchema createShExSchema(File path);
	public ShExSchema createShExSchema(IRI address);
	public ShExSchema createShExSchema(File path, RDF factory);
	public ShExSchema createShExSchema(IRI address, RDF factory);	
}
